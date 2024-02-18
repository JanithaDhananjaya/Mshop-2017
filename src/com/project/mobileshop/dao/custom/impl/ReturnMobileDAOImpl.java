/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ReturnMobileDTO;
import com.project.mobileshop.dao.custom.ReturnMobileDAO;
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
public class ReturnMobileDAOImpl implements ReturnMobileDAO {

    @Override
    public boolean add(ReturnMobileDTO dto) throws Exception {
        String sql = "insert into returnmobile values(?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getReturnId());
        pstm.setObject(2, dto.getIMEINo());
        pstm.setObject(3, dto.getCurDate());
        pstm.setObject(4, dto.getSoldDate());
        pstm.setObject(5, dto.getWarranty());
        pstm.setObject(6, dto.getIssue());
        pstm.setObject(7, dto.getCustomerId());
        pstm.setObject(8, dto.getSupplierId());
        pstm.setObject(9, dto.getSoldInvId());
        return pstm.executeUpdate() > 0;

    }

    @Override
    public ArrayList<ReturnMobileDTO> getAll() throws Exception {
        String sql = "select * from returnmobile";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<ReturnMobileDTO> returnList = new ArrayList<>();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            ReturnMobileDTO dTO = new ReturnMobileDTO(
                    rst.getString("retrunId"),
                    rst.getString("IMEIno"),
                    rst.getString("Date"),
                    rst.getString("soldDate"),
                    rst.getString("warrentyPeriod"),
                    rst.getString("Issue"),
                    rst.getString("customerId"),
                    rst.getString("supplierId"),
                    rst.getString("soldInvoiceId")
            );
            returnList.add(dTO);
        }
        return returnList;
    }

    @Override
    public ReturnMobileDTO search(ReturnMobileDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ReturnMobileDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomDTO getCount() throws Exception {
        String sql = "select count(IMEIno) as counts from returnmobile";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CustomDTO customDTO = new CustomDTO(rst.getInt("counts"));
            return customDTO;
        } else {
            return null;
        }

    }

    @Override
    public ArrayList<ReturnMobileDTO> searchFromModelName(String modelName) throws Exception {
        String sql = "select * from returnmobile r,mobiledetail mobd,model md\n"
                + "where r.IMEIno=mobd.IMEIno && mobd.ModelNo=md.ModelNo\n"
                + "&& modelName=?;\n"
                + "";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, modelName);
        ResultSet rst = pstm.executeQuery();
        ArrayList<ReturnMobileDTO> list = new ArrayList<>();
        while (rst.next()) {
            ReturnMobileDTO dTO = new ReturnMobileDTO(
                    rst.getString("retrunId"),
                    rst.getString("IMEIno"),
                    rst.getString("Date"),
                    rst.getString("soldDate"),
                    rst.getString("warrentyPeriod"),
                    rst.getString("Issue"),
                    rst.getString("customerId"),
                    rst.getString("supplierId"),
                    rst.getString("soldInvoiceId")
            );
            list.add(dTO);
        }
        return list;
    }

    @Override
    public ArrayList<ReturnMobileDTO> searchFromSupplierName(String name) throws Exception {
        String sql = "select * from returnmobile r,mobiledetail mobd,model md,supplier s\n"
                + "where r.IMEIno=mobd.IMEIno && mobd.ModelNo=md.ModelNo && s.supplierId=r.supplierId\n"
                + "&& supplierName=?;";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, name);
        ResultSet rst = pstm.executeQuery();
        ArrayList<ReturnMobileDTO> list = new ArrayList<>();
        while (rst.next()) {
            ReturnMobileDTO dTO = new ReturnMobileDTO(
                    rst.getString("retrunId"),
                    rst.getString("IMEIno"),
                    rst.getString("Date"),
                    rst.getString("soldDate"),
                    rst.getString("warrentyPeriod"),
                    rst.getString("Issue"),
                    rst.getString("customerId"),
                    rst.getString("supplierId"),
                    rst.getString("soldInvoiceId")
            );
            list.add(dTO);
        }
        return list;
    }

    @Override
    public ArrayList<ReturnMobileDTO> LoadWarrantyTypes() throws Exception {
        String sql = "select warrentyPeriod from returnmobile group by warrentyPeriod";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ReturnMobileDTO> list = new ArrayList<>();
        while (rst.next()) {
            ReturnMobileDTO dTO = new ReturnMobileDTO();
            dTO.setWarranty(rst.getString("warrentyPeriod"));
            list.add(dTO);
        }
        return list;
    }

    @Override
    public ArrayList<ReturnMobileDTO> searchFromWarrentyType(String warrantyType) throws Exception {
        String sql = "select * from returnmobile r,mobiledetail mobd,model md,supplier s\n"
                + "where r.IMEIno=mobd.IMEIno && mobd.ModelNo=md.ModelNo && s.supplierId=r.supplierId\n"
                + "&& r.warrentyPeriod=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, warrantyType);
        ResultSet rst = pstm.executeQuery();
        ArrayList<ReturnMobileDTO> list = new ArrayList<>();
        while (rst.next()) {
            ReturnMobileDTO dTO = new ReturnMobileDTO(
                    rst.getString("retrunId"),
                    rst.getString("IMEIno"),
                    rst.getString("Date"),
                    rst.getString("soldDate"),
                    rst.getString("warrentyPeriod"),
                    rst.getString("Issue"),
                    rst.getString("customerId"),
                    rst.getString("supplierId"),
                    rst.getString("soldInvoiceId")
            );
            list.add(dTO);
        }
        return list;
    }

}
