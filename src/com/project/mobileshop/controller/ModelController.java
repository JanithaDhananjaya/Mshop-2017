/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.BatchDTO;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.CustomerDTO;
import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.core.dto.MobileDetailDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.core.dto.SupplierDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.BatchDAO;
import com.project.mobileshop.dao.custom.MobileDAO;
import com.project.mobileshop.dao.custom.ModelDAO;
import com.project.mobileshop.dao.custom.QueryDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class ModelController {

    private static ModelDAO modelDAO = (ModelDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MODEL);

    public static boolean addModel(ModelDTO modelDTO, ArrayList<MobileDTO> mobile) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);

            boolean result = modelDAO.add(modelDTO);
            if (result == false) {
                connection.rollback();
                return false;

            }
            MobileDAO mobileDAO = (MobileDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MOBILE);
            result = mobileDAO.add(mobile);
            if (result == false) {
                connection.rollback();
                return false;
            }
            connection.commit();
            return true;
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (Exception e) {
                System.out.println("e");
            }

        }
    }

    public static ArrayList<CustomDTO> getAllDetails() throws Exception {

        ArrayList<CustomDTO> all = modelDAO.loadAll();
        if (all == null) {
            return null;
        }
        return all;
    }

    public static ArrayList<CustomDTO> getModelNames(String brand) throws Exception {
        ArrayList<CustomDTO> modelList = modelDAO.getModelNames(brand);
        if (modelList != null) {
            return modelList;
        } else {
            return null;
        }

    }

    public static ArrayList<ModelDTO> getBrands() throws Exception {
        ArrayList<ModelDTO> brands = modelDAO.getBrands();

        return brands;
    }

    public static ModelDTO OrderModelDetails(String modelName) throws Exception {
        ModelDTO modelDetails = modelDAO.getModelDetails(modelName);
        return modelDetails;
    }

    public static ArrayList<CustomDTO> searchFromYear(String year) throws Exception {
        return modelDAO.searchFromYear(year);
    }

    public static CustomDTO searchFromIMEINo(String IMEINo) throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        return queryDAO.searchFromIMEINo(IMEINo);
    }
    public static ArrayList<CustomDTO> searchFromPrice(String Price) throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        return queryDAO.serachFromPrice(Price);
    }
    public static ModelDTO getModelDetails(String modelName) throws Exception{
        return modelDAO.getModelDetails(modelName);
    }
    public static ArrayList<ModelDTO> getAll() throws Exception{
        return modelDAO.getAll();
    }
    public static ModelDTO FillBrandName(String Brand) throws Exception{
        return modelDAO.FillBrandName(Brand);
    }
}
