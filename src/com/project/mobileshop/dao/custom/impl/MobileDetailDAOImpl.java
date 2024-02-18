/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.core.dto.MobileDetailDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.dao.custom.MobileDetailDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class MobileDetailDAOImpl implements MobileDetailDAO {

    @Override
    public boolean add(MobileDetailDTO mobileDetaildto) throws Exception {
        String sql = "insert into mobileDetail values(?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, mobileDetaildto.getIMEIno());
        pstm.setObject(2, mobileDetaildto.getColur());
        pstm.setObject(3, mobileDetaildto.getStatus());
        pstm.setObject(4, mobileDetaildto.getGRNno());
        pstm.setObject(5, mobileDetaildto.getModelNo());
        pstm.setObject(6, mobileDetaildto.getBatchNo());
        return pstm.executeUpdate() > 0;
    }

    @Override
    public ArrayList<MobileDetailDTO> getAll() throws Exception {
        String sql = "select * from mobiledetail";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<MobileDetailDTO> mobileList = new ArrayList<>();
        while (rst.next()) {
            MobileDetailDTO mobileDTO = new MobileDetailDTO(
                    rst.getString("IMEIno"),
                    rst.getString("Colour"),
                    rst.getString("Status"),
                    rst.getString("GRNno"),
                    rst.getString("ModelNo"),
                    rst.getString("Batchno")
            );
            mobileList.add(mobileDTO);
        }
        return mobileList;
    }

    @Override
    public MobileDetailDTO search(MobileDetailDTO dto) throws Exception {
        String imeIno = dto.getIMEIno();
        String sql = "select * from mobiledetail where IMEIno='" + imeIno + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            MobileDetailDTO dTO = new MobileDetailDTO(
                    rst.getString("IMEIno"),
                    rst.getString("Colour"),
                    rst.getString("Status"),
                    rst.getString("GRNno"),
                    rst.getString("ModelNo"),
                    rst.getString("Batchno")
            );
            return dTO;
        } else {
            return null;
        }
    }

    @Override
    public boolean update(MobileDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MobileDetailDTO> getChoosedIMEINo(String modelName) throws Exception {
        String sql = "select IMEIno,colour,status,b.batchNo,GRNno,mb.ModelNo\n"
                + "from mobiledetail mb,model md,batch b\n"
                + "where mb.ModelNo=md.ModelNo && b.BatchNo=mb.Batchno && md.ModelName='" + modelName + "'\n"
                + "group by IMEIno order by status asc";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement pstm = connection.createStatement();
        ResultSet rst = pstm.executeQuery(sql);
        ArrayList<MobileDetailDTO> mobileList = new ArrayList<>();
        while (rst.next()) {
            MobileDetailDTO mobileDetailDTO = new MobileDetailDTO(
                    rst.getString("IMEIno"),
                    rst.getString("Colour"),
                    rst.getString("Status"),
                    rst.getString("GRNno"),
                    rst.getString("ModelNo"),
                    rst.getString("Batchno")
            );
            mobileList.add(mobileDetailDTO);
        }
        return mobileList;
    }

    @Override
    public boolean updateIEMINo(MobileDetailDTO dto, String oldIMEINo) throws Exception {

        String sql = "update mobiledetail set IMEIno=?,Colour=? where IMEIno=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getIMEIno());
        pstm.setObject(2, dto.getColur());
        pstm.setObject(3, oldIMEINo);
        return pstm.executeUpdate() > 0;
    }

}
