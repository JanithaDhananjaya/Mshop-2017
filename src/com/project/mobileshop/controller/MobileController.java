/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.MobileDetailDTO;
import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.core.dto.SupplierDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.MobileDAO;
import com.project.mobileshop.dao.custom.QueryDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Janitha Dhananjaya
 */
public class MobileController { 
   public static CustomDTO getSoldMobileQty(String modelName ) throws Exception{
       QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
       return queryDAO.getSoldMobileCount(modelName);
   }
}
