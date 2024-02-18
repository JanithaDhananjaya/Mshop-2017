/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.SpecificationsDTO;
import com.project.mobileshop.dao.custom.SpecificationsDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class SpecificationsDAOImpl implements SpecificationsDAO {

    @Override
    public boolean add(SpecificationsDTO dto) throws Exception {
        String sql = "insert into specifications values(?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getSpecifyId());
        pstm.setObject(2, dto.getModelNo());
        pstm.setObject(3, dto.getDisplaySize());
        pstm.setObject(4, dto.getOperatingSys());
        pstm.setObject(5, dto.getMemory());
        pstm.setObject(6, dto.getNetwork());
        pstm.setObject(7, dto.getPrimaryCam());
        pstm.setObject(8, dto.getSecondaryCam());
        pstm.setObject(9, dto.getRam());
        pstm.setObject(10, dto.getSim());
        pstm.setObject(11, dto.getCpu());
        pstm.setObject(12, dto.getSensor());
        return pstm.executeUpdate() > 0;

    }

    @Override
    public ArrayList<SpecificationsDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SpecificationsDTO search(SpecificationsDTO dto) throws Exception {
        String sql = "select * from specifications where ModelNo=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getModelNo());
        ResultSet rst = pstm.executeQuery();
        SpecificationsDTO specificationsDTO = null;
        if (rst.next()) {
            specificationsDTO = new SpecificationsDTO(
                    rst.getString("specifyId"),
                    rst.getString("ModelNo"),
                    rst.getString("displaySize"),
                    rst.getString("OS"),
                    rst.getString("Memory"),
                    rst.getString("network"),
                    rst.getString("primarycam"),
                    rst.getString("secondarycam"),
                    rst.getString("Ram"),
                    rst.getString("sim"),
                    rst.getString("cpu"),
                    rst.getString("sensor")
            );

        }
        return specificationsDTO;
    }

    @Override
    public boolean update(SpecificationsDTO dto) throws Exception {
        String sql = "update specifications set displaySize=?,OS=?,Memory=?,"
                + "network=?,primarycam=?,secondarycam=?,Ram=?,sim=?,cpu=?,sensor=? where ModelNo=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getDisplaySize());
        pstm.setObject(2, dto.getOperatingSys());
        pstm.setObject(3, dto.getMemory());
        pstm.setObject(4, dto.getNetwork());
        pstm.setObject(5, dto.getPrimaryCam());
        pstm.setObject(6, dto.getSecondaryCam());
        pstm.setObject(7, dto.getRam());
        pstm.setObject(8, dto.getSim());
        pstm.setObject(9, dto.getCpu());
        pstm.setObject(10, dto.getSensor());
        pstm.setObject(11, dto.getModelNo());
        return pstm.executeUpdate() > 0;

    }

}
