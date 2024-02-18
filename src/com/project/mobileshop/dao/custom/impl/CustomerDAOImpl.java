/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.CustomerDTO;
import com.project.mobileshop.dao.custom.CustomerDAO;
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
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean add(CustomerDTO customerDTO) throws Exception {
        String sql = "insert into customer values(?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, customerDTO.getCustomerId());
        stm.setObject(2, customerDTO.getCustomerName());
        stm.setObject(3, customerDTO.getContactNo());
        stm.setObject(4, customerDTO.getNICno());
        int result = stm.executeUpdate();
        return result > 0;

    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        String sql = "select * from customer";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);

        ArrayList<CustomerDTO> getIds = new ArrayList<>();

        ResultSet rst = pstm.executeQuery();

        while (rst.next()) {
            CustomerDTO supplierDTO = new CustomerDTO(rst.getString("customerId"), rst.getString("customerName"),
                    Integer.parseInt(rst.getString("contactno")),
                    rst.getString("NICno"));

            getIds.add(supplierDTO);
        }
        return getIds;

    }

    @Override
    public CustomerDTO search(CustomerDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public boolean update(CustomerDTO dto) throws Exception {
        String sql="update customer set customerName=?,contactno=?,NICno=? where customerId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getCustomerName());
        pstm.setObject(2, dto.getContactNo());
        pstm.setObject(3, dto.getNICno());
        pstm.setObject(4, dto.getCustomerId());
        return pstm.executeUpdate()>0;
    }

    @Override
    public CustomerDTO searchFromID(CustomerDTO dto) throws Exception {
        String sql = "select * from customer where customerId='" + dto.getCustomerId() + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CustomerDTO customerDTO = new CustomerDTO(dto.getCustomerId(),
                    rst.getString("customerName"), Integer.parseInt(rst.getString("contactno")), rst.getString("NICno"));
            return customerDTO;
        }
        return null;
    }

    @Override
    public CustomerDTO searchFromName(CustomerDTO dto) throws Exception {
        String sql = "select * from customer where customerName='" + dto.getCustomerName() + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CustomerDTO customerDTO = new CustomerDTO(rst.getString("customerId"),
                    dto.getCustomerName(), Integer.parseInt(rst.getString("contactno")), rst.getString("NICno"));
            return customerDTO;
        }
        return null;
    }

}
