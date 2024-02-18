/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.UserDTO;
import com.project.mobileshop.dao.custom.UserDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public boolean add(UserDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO search(UserDTO dto) throws Exception {
        System.out.println("password :"+dto.getPassword());
        String sql = "select * from user where password='"+dto.getPassword()+"'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            UserDTO userDTO = new UserDTO(
                    rst.getString("name"),
                    rst.getString("password"));

            return userDTO;
        }
        return null;
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO getUserName() throws Exception {
        String sql = "select * from user";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            UserDTO userDTO = new UserDTO(
                    rst.getString("name"),
                    rst.getString("password"));

            return userDTO;
        }
        return null;
    }

}
