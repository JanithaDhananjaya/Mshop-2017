/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.InvoiceDTO;
import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.InvoiceDAO;
import com.project.mobileshop.dao.custom.QueryDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Janitha Dhananjaya
 */
public class InvoiceController {

    public static boolean placeOrder(InvoiceDTO invoiceDTO, MobileDTO mobileDTO, String status, String batchNo, String IEMINo, String modelNo) throws Exception {

        InvoiceDAO invoiceDAO = (InvoiceDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.INVOICE);
        boolean isPlaced = invoiceDAO.placeOrder(invoiceDTO, mobileDTO, status, batchNo, IEMINo, modelNo);
        return isPlaced;

    }

    public static ArrayList<CustomDTO> getDateInvoices(String curDate) throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        return queryDAO.getDateInvoices(curDate);
    }

    public static ArrayList<CustomDTO> getDailyProfit(String curDate) throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        return queryDAO.getDailyProfit(curDate);

    }
    

    public static ArrayList<CustomDTO> getMonthlyProfit() throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        return queryDAO.getMonthlyProfit();

    }
    public static ArrayList<CustomDTO> getAnnualyProfit() throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        return queryDAO.getAnnualyProfit();

    }
}
