/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.SupplierDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.SupplierDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Janitha Dhananjaya
 */
public class SupplierController {

    private static SupplierDAO supplierDAO = (SupplierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER);

    public static boolean addSupplier(SupplierDTO supplier) throws Exception {
        boolean isAdded = supplierDAO.add(supplier);
        if (isAdded) {
            return true;
        } else {
            return false;
        }

    }

    public static ArrayList<SupplierDTO> getAllSuppliers() throws Exception {

        ArrayList<SupplierDTO> allSuppliers = supplierDAO.getAll();
        return allSuppliers;

    }

    public static SupplierDTO searchSupplier(SupplierDTO supplierDTO) throws Exception {
        SupplierDTO searchSupplier = supplierDAO.search(supplierDTO);
        return searchSupplier;

    }

    public static boolean updateSupplier(SupplierDTO supplierDTO) throws Exception {
        boolean isUpdated = supplierDAO.update(supplierDTO);
        return isUpdated;
    }

    public static SupplierDTO serachFromName(String Name) throws Exception {
        return supplierDAO.serachFromName(Name);
    }

    public static SupplierDTO serachFromCompany(String company) throws Exception {
        return supplierDAO.serachFromCompany(company);
    }

    
}
