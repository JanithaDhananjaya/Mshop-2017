/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.UserDTO;
import com.project.mobileshop.dao.SuperDAO;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface UserDAO extends SuperDAO<UserDTO>{
    public UserDTO getUserName()throws Exception;
}
