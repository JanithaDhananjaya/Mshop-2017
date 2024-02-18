/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.InvoiceDTO;
import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.dao.custom.InvoiceDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class InvoiceDAOImpl implements InvoiceDAO {

    @Override
    public boolean add(InvoiceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<InvoiceDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InvoiceDTO search(InvoiceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(InvoiceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean placeOrder(InvoiceDTO dto,MobileDTO mobileDTO, String status, String batchNo, String IMEIno,String modelNo) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);

            PreparedStatement pstm1 = connection.prepareStatement("INSERT INTO invoice VALUES(?,?,?)");
            pstm1.setObject(1, dto.getInvoiceId());
            pstm1.setObject(2, dto.getOrderDate());
            pstm1.setObject(3, dto.getTotalAmount());
            boolean result = pstm1.executeUpdate() > 0;

            if (result == false) {
                connection.rollback();
                return false;
            }

            PreparedStatement pstm2 = connection.prepareStatement("update mobiledetail set Status=? where IMEIno=?");
            pstm2.setObject(1, status);
            pstm2.setObject(2, IMEIno);
            result = pstm2.executeUpdate() > 0;

            if (result == false) {
                connection.rollback();
                return false;
            }

            PreparedStatement pstm3 = connection.prepareStatement("select Qty from batch where BatchNo = ?");
            pstm3.setObject(1, batchNo);
            ResultSet batchRst = pstm3.executeQuery();
            int currentQtyOnBatch = 0;
            int updatedQtyOnBatch = 0;
            if (batchRst.next()) {
                currentQtyOnBatch = Integer.parseInt(batchRst.getString("Qty"));
                updatedQtyOnBatch = currentQtyOnBatch - 1;
            }

           
            PreparedStatement pstm4= connection.prepareStatement("update batch set Qty=? where BatchNo = ?");
            pstm4.setObject(1, updatedQtyOnBatch);
            pstm4.setObject(2, batchNo);
            result = pstm4.executeUpdate() > 0;

            if (result == false) {
                connection.rollback();
                return false;
            }

            PreparedStatement pstm5 = connection.prepareStatement("select QtyOnHand from model where ModelNo = ?");
            pstm5.setObject(1, modelNo);
            ResultSet modelRst = pstm5.executeQuery();
            int currentQtyOnModel = 0;
            int updatedQtyOnModel=0;
            if (modelRst.next()) {
                currentQtyOnModel = Integer.parseInt(modelRst.getString("QtyOnHand"));
                updatedQtyOnModel=currentQtyOnModel-1;
            }
            

            PreparedStatement pstm6 = connection.prepareStatement("update model set QtyOnHand=? where ModelNo = ?");
            pstm6.setObject(1, updatedQtyOnModel);
            pstm6.setObject(2, modelNo);
            result = pstm6.executeUpdate() > 0;
            
            if (result == false) {
                connection.rollback();
                return false;
            }
            
            PreparedStatement pstm7 = connection.prepareStatement("INSERT INTO mobile VALUES(?,?,?,?,?,?)");
            pstm7.setObject(1, mobileDTO.getMobileNo());
            pstm7.setObject(2, mobileDTO.getIEMIno());
            pstm7.setObject(3, mobileDTO.getCustomerID());
            pstm7.setObject(4, mobileDTO.getModelNo());
            pstm7.setObject(5, mobileDTO.getInvoiceID());
            pstm7.setObject(6, mobileDTO.getWarrentyPeriod());
            result = pstm7.executeUpdate()>0;
            
            if(result==false){
                connection.rollback();
                return false;
            }
            
            connection.commit();
            return true;

        } finally {
            connection.setAutoCommit(true);
        }
    }

}
