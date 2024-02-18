/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.SuperDTO;
import com.project.mobileshop.core.dto.SupplierDTO;
import com.project.mobileshop.dao.custom.SupplierDAO;
import com.project.mobileshop.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 *
 * @author Janitha Dhananjaya
 */
public class SupplierDAOImpl implements SupplierDAO {

    @Override
    public boolean add(SupplierDTO supplierdto) throws Exception {
        String sql = "insert into supplier values(?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, supplierdto.getSupplierId());
        stm.setObject(2, supplierdto.getSupplierName());
        stm.setObject(3, supplierdto.getContactNo());
        stm.setObject(4, supplierdto.getAddress());
        stm.setObject(5, supplierdto.getCompany());
        stm.setObject(6, supplierdto.getNICno());
        int result = stm.executeUpdate();
        return result > 0;
    }

    @Override
    public ArrayList<SupplierDTO> getAll() throws Exception {
        String sql = "select * from supplier";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<SupplierDTO> supplierInfo = new ArrayList<>();
        while (rst.next()) {
            SupplierDTO supplierDTO = new SupplierDTO(
                    rst.getString("supplierId"),
                    rst.getString("supplierName"),
                    Integer.parseInt(rst.getString("contactNo")),
                    rst.getString("address"),
                    rst.getString("company"),
                    rst.getString("NICno"));
            supplierInfo.add(supplierDTO);
        }
        return supplierInfo;

    }

    @Override
    public SupplierDTO search(SupplierDTO dto) throws Exception {
        String sql = "select * from supplier where supplierId ='" + dto.getSupplierId() + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            SupplierDTO supplierDTO = new SupplierDTO(
                    rst.getString("supplierId"),
                    rst.getString("supplierName"),
                    Integer.parseInt(rst.getString("contactNo")),
                    rst.getString("address"),
                    rst.getString("company"),
                    rst.getString("NICno"));
            return supplierDTO;
        } else {
            return null;
        }

    }

    @Override
    public boolean update(SupplierDTO supplierdto) throws Exception {
        String sql = "update supplier set supplierName=? ,contactNo=? ,address=? , company=? ,NICno=? where supplierId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setObject(1, supplierdto.getSupplierName());
        stm.setObject(2, supplierdto.getContactNo());
        stm.setObject(3, supplierdto.getAddress());
        stm.setObject(4, supplierdto.getCompany());
        stm.setObject(5, supplierdto.getNICno());
        stm.setObject(6, supplierdto.getSupplierId());
        int result = stm.executeUpdate();
        return result > 0;

    }

    @Override
    public SupplierDTO serachFromName(String Name) throws Exception {
        String sql = "select * from supplier where supplierName ='" + Name + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            SupplierDTO supplierDTO = new SupplierDTO(
                    rst.getString("supplierId"),
                    rst.getString("supplierName"),
                    Integer.parseInt(rst.getString("contactNo")),
                    rst.getString("address"),
                    rst.getString("company"),
                    rst.getString("NICno"));
            return supplierDTO;
        } else {
            return null;
        }
    }

    @Override
    public SupplierDTO serachFromCompany(String Company) throws Exception {
        String sql = "select * from supplier where company ='" + Company + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            SupplierDTO supplierDTO = new SupplierDTO(
                    rst.getString("supplierId"),
                    rst.getString("supplierName"),
                    Integer.parseInt(rst.getString("contactNo")),
                    rst.getString("address"),
                    rst.getString("company"),
                    rst.getString("NICno"));
            return supplierDTO;
        } else {
            return null;
        }
    }

}
