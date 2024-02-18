/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ReturnMobileDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.QueryDAO;
import com.project.mobileshop.dao.custom.ReturnMobileDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class ReturnMobileController {

    private static ReturnMobileDAO returnMobileDAO = (ReturnMobileDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.RETURNMOBILE);
    private static QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);

    public static CustomDTO getReturnMobileDetails(String IMEINo) throws Exception {

        CustomDTO returnMobileDetails = queryDAO.getReturnMobileDetails(IMEINo);
        return returnMobileDetails;
    }

    public static boolean addReturnMobile(ReturnMobileDTO returnMobileDTO) throws Exception {

        boolean isAdded = returnMobileDAO.add(returnMobileDTO);
        return isAdded;
    }

    public static ArrayList<ReturnMobileDTO> getAll() throws Exception {
        return returnMobileDAO.getAll();
    }

    public static CustomDTO getFromIMEINo(String IMEINo) throws Exception {
        return queryDAO.searchFromIMEINo(IMEINo);
    }

    public static CustomDTO getCount() throws Exception {
        return returnMobileDAO.getCount();
    }

    public static ArrayList<ReturnMobileDTO> searchFromModelName(String modelName) throws Exception {
        return returnMobileDAO.searchFromModelName(modelName);
    }

    public static ArrayList<ReturnMobileDTO> searchFromSupplierName(String supplierName) throws Exception {
        return returnMobileDAO.searchFromSupplierName(supplierName);
    }

    public static CustomDTO getReturnMobileCount(String modelName) throws Exception {
        return queryDAO.getReturnMobileCount(modelName);
    }

    public static ArrayList<ReturnMobileDTO> LoadWarrentyTyps() throws Exception {
        return returnMobileDAO.LoadWarrantyTypes();
    }

    public static ArrayList<ReturnMobileDTO> searchFromWarrentyType(String warrentyType) throws Exception {
        return returnMobileDAO.searchFromWarrentyType(warrentyType);
    }

}
