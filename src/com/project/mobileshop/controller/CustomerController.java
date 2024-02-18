/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.CustomerDTO;
import com.project.mobileshop.core.dto.SupplierDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.CustomerDAO;
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
public class CustomerController { 
    private static CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    public static boolean addCustomer(CustomerDTO customerDTO) throws SQLException, Exception {
        
        boolean isAdded = customerDAO.add(customerDTO);
        return isAdded;
    }
    public static CustomerDTO searchFromID(CustomerDTO customerDTO) throws SQLException, Exception {
        return customerDAO.searchFromID(customerDTO);
        
    }
    public static CustomerDTO searchFromName(CustomerDTO customerDTO) throws Exception{
        return customerDAO.searchFromName(customerDTO);
    }
    
    public static ArrayList<CustomerDTO> LoadAll() throws SQLException, Exception {
        ArrayList<CustomerDTO> all = customerDAO.getAll();
        return all;
    }
    public static boolean update(CustomerDTO customerDTO) throws Exception{
        boolean isUpdated = customerDAO.update(customerDTO);
        return isUpdated;
    }
    
}
