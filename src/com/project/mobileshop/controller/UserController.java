/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.UserDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.UserDAO;

/**
 *
 * @author Janitha Dhananjaya
 */
public class UserController {
    
    private static UserDAO dAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);
    
    public static UserDTO getAll() throws Exception {
        
        return dAO.getUserName();
    }
    
    public static UserDTO search(UserDTO dTO) throws Exception {
        
        return dAO.search(dTO);
    }
}
