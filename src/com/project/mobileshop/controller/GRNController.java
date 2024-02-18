/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.BatchDTO;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.GRNDTO;
import com.project.mobileshop.core.dto.MobileDetailDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.BatchDAO;
import com.project.mobileshop.dao.custom.GRNDAO;
import com.project.mobileshop.dao.custom.MobileDetailDAO;
import com.project.mobileshop.dao.custom.ModelDAO;
import com.project.mobileshop.db.DBConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Janitha Dhananjaya
 */
public class GRNController {

    private static GRNDAO grndao = (GRNDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GRN);

    public static boolean addGRN(GRNDTO grndto, ArrayList<ModelDTO> modelList, ArrayList<BatchDTO> batchList) throws SQLException, Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {

            System.out.println("start add GRN");

            connection.setAutoCommit(false);
            System.out.println("close database");

            GRNDAO grndao = (GRNDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GRN);

            System.out.println("add grn table");

            boolean isGrnAdded = grndao.add(grndto);

            if (isGrnAdded == false) {
                connection.rollback();
                System.out.println("roll back grn");
                return false;

            }

            System.out.println("grn added successfully");

            ModelDAO modelDAO = (ModelDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MODEL);

            System.out.println("start add models");

            for (ModelDTO m : modelList) {
                String modelNo = m.getModelNo();
                ModelDTO search = modelDAO.search(m);
                if (search != null) {
                    int OldQtyOnHand = search.getQtyOnHand();
                    int newQtyOnHand = m.getQtyOnHand();
                    int updatedQty = newQtyOnHand + OldQtyOnHand;
                    ModelDTO dTO = new ModelDTO();
                    dTO.setQtyOnHand(updatedQty);
                    dTO.setModelNo(modelNo);
                    boolean isUpdate = modelDAO.update(dTO);
                    if (isUpdate == false) {
                        connection.rollback();
                        System.out.println("roll back model");
                        return false;

                    }
                } else {

                    boolean isMOdelAdded = modelDAO.add(m);

                    if (isMOdelAdded == false) {
                        connection.rollback();
                        System.out.println("rool back model");
                        return false;

                    }
                }
            }

            System.out.println("model added successfully");

            BatchDAO batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);

            System.out.println("start add batch");

            for (BatchDTO b : batchList) {

                String batchNo = b.getBatchNo();
                BatchDTO searchBatchNo = batchDAO.searchBatchNo(batchNo);
                if (searchBatchNo != null) {
                    BigDecimal oldAmount = searchBatchNo.getAmount();
                    BigDecimal newAmount = b.getAmount();
                    BigDecimal updatedAmount = new BigDecimal(oldAmount.doubleValue() + newAmount.doubleValue());

                    int OldBatch = searchBatchNo.getQty();
                    int newBatchQty = b.getQty();
                    int updatedQty = newBatchQty + OldBatch;
                    BatchDTO dTO = new BatchDTO();
                    dTO.setQty(updatedQty);
                    dTO.setBatchNo(batchNo);
                    dTO.setAmount(updatedAmount);

                    boolean isUpdate = batchDAO.updateBatch(dTO);
                    if (isUpdate == false) {
                        connection.rollback();
                        System.out.println("roll back model");
                        return false;
                    }
                    connection.commit();
                    System.out.println("3 tables are updated & commit");
                    return true;
                }

                boolean isBatchAdded = batchDAO.add(b);

                if (isBatchAdded == false) {
                    connection.rollback();
                    System.out.println("batch roll back");
                    return false;
                }
            }

            System.out.println("not batch roll back");

            connection.commit();
            System.out.println("3 tables are updated & commit");
            return true;

        } catch (Exception ex) {
            Logger.getLogger(GRNController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);

            } catch (SQLException e) {
                System.out.println("Error");

            }
        }
        return false;
    }

    public static ArrayList<GRNDTO> getAllGRNs() throws Exception {

        ArrayList<GRNDTO> grnList = grndao.getAll();
        return grnList;
    }

    public static ArrayList<GRNDTO> getSelectedGRNFromDate(String Date) throws Exception {
        ArrayList<GRNDTO> grnList = grndao.getGRNFromDate(Date);
        return grnList;

    }

    public static GRNDTO getSelectedGRNFromGRNId(String Date) throws Exception {
        return grndao.getGRNFromGRNId(Date);

    }
    public static ArrayList<GRNDTO> getSelectedGRNFromSupplierId(String ID) throws Exception {
        ArrayList<GRNDTO> grnList = grndao.getGRNFromSupplierID(ID);
        return grnList;

    }
    public static ArrayList<GRNDTO> getSelectedGRNFromSupplierName(String Name) throws Exception {
        ArrayList<GRNDTO> grnList = grndao.getGRNFromSupplierName(Name);
        return grnList;

    }
    public static ArrayList<GRNDTO> getSelectedGRNFromCompany(String Company) throws Exception {
        ArrayList<GRNDTO> grnList = grndao.getGRNFromCompany(Company);
        return grnList;

    }
    public static ArrayList<CustomDTO> getGRNDetails(String grnId) throws Exception{
        return grndao.getGRNDetails(grnId);
    }

}
