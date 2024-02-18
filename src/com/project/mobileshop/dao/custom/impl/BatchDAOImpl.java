/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.BatchDTO;
import com.project.mobileshop.dao.custom.BatchDAO;
import com.project.mobileshop.db.DBConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class BatchDAOImpl implements BatchDAO {

    @Override
    public boolean add(BatchDTO batchdto) throws Exception {
        String sql = "insert into batch values(?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, batchdto.getBatchNo());
        System.out.println("--------------------------");
        System.out.println(batchdto.getBatchNo());
        System.out.println("---------------------------");
        pstm.setObject(2, batchdto.getModelNo());
        pstm.setObject(3, batchdto.getQty());
        pstm.setObject(4, batchdto.getSellingPrice());
        pstm.setObject(5, batchdto.getOriginalPrice());
        pstm.setObject(6, batchdto.getAmount());
        boolean result = pstm.executeUpdate() > 0;
        System.out.println("batch added success" + result);
        return result;

    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        String sql = "select * from batch";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<BatchDTO> batchList = new ArrayList<>();

        while (rst.next()) {
            String batchNo = rst.getString("BatchNo");
            String modelNo = rst.getString("ModelNo");
            int qty = Integer.parseInt(rst.getString("Qty"));
            BigDecimal sellingPrice = new BigDecimal(rst.getString("sellingPrice"));
            BigDecimal originalPrice = new BigDecimal(rst.getString("originalPrice"));
            BigDecimal amount = new BigDecimal(rst.getString("Amount"));

            BatchDTO batchDTO = new BatchDTO(batchNo, modelNo, sellingPrice, originalPrice, qty, amount);
            batchList.add(batchDTO);
        }
        return batchList;
    }

    @Override
    public ArrayList<BatchDTO> searchBatches(BatchDTO batchDTO) throws Exception {

        System.out.println("batchImpl search method");

        String modelNo = batchDTO.getModelNo();
        System.out.println(modelNo);

        String sql = "select * from batch where ModelNo='" + modelNo + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<BatchDTO> list = new ArrayList<>();
        while (rst.next()) {

            BatchDTO DTO = new BatchDTO(
                    rst.getString("BatchNo"),
                    rst.getString("ModelNo"),
                    new BigDecimal(rst.getString("sellingPrice")),
                    new BigDecimal(rst.getString("originalPrice")),
                    Integer.parseInt(rst.getString("Qty")),
                    new BigDecimal(rst.getString("Amount"))
            );
            list.add(DTO);
        }
        return list;

    }

    @Override
    public boolean update(BatchDTO dto) throws Exception {
        String sql = "update batch set modelNo=?,Qty=?,sellingPrice=?,originalPrice=?,Amount=? where batchNo=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getModelNo());
        pstm.setObject(2, dto.getQty());
        pstm.setObject(3, dto.getSellingPrice());
        pstm.setObject(4, dto.getOriginalPrice());
        pstm.setObject(5, dto.getAmount());
        pstm.setObject(6, dto.getBatchNo());
        return pstm.executeUpdate() > 0;
    }

    @Override
    public BatchDTO getDetails(String bathcNo) throws Exception {
        String sql = "select * from batch where  BatchNo='" + bathcNo + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            BatchDTO batchDTO = new BatchDTO(
                    bathcNo,
                    rst.getString("ModelNo"),
                    new BigDecimal(rst.getString("sellingPrice")),
                    new BigDecimal(rst.getString("originalPrice")),
                    Integer.parseInt(rst.getString("Qty")),
                    new BigDecimal(rst.getString("Amount"))
            );
            return batchDTO;
        }
        return null;
    }

    @Override
    public BatchDTO searchBatchNo(String batchNo) throws Exception {
        System.out.println("batchImpl search batch method");

        String sql = "select * from batch where BatchNo='" + batchNo + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            System.out.println("have batch already for this model name in batch DTO");
            return new BatchDTO(
                    rst.getString("BatchNo"),
                    rst.getString("ModelNo"),
                    new BigDecimal(rst.getString("sellingPrice")),
                    new BigDecimal(rst.getString("originalPrice")),
                    Integer.parseInt(rst.getString("Qty")),
                    new BigDecimal(rst.getString("Amount"))
            );
        }

        System.out.println("no any batch for this model");
        return null;

    }

    @Override
    public boolean updateBatch(BatchDTO batchDTO) throws Exception {
        String sql = "update batch set Qty=?,Amount=? where BatchNo=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, batchDTO.getQty());
        pstm.setObject(2, batchDTO.getAmount());
        pstm.setObject(3, batchDTO.getBatchNo());
        return pstm.executeUpdate() > 0;
    }

    @Override
    public ArrayList<BatchDTO> getBatchCount(String modelNo) throws Exception {
        String sql = "select BatchNo from batch where ModelNo='" + modelNo + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<BatchDTO> batchList = new ArrayList<>();
        while (rst.next()) {
            BatchDTO batchDTO = new BatchDTO();
            batchDTO.setBatchNo(rst.getString("BatchNo"));
            batchList.add(batchDTO);
        }
        return batchList;

    }

    public ArrayList<BatchDTO> modelBatch(String modelNo) throws SQLException {
        String sql = "select * from batch where ModelNo='" + modelNo + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<BatchDTO> batchInfoList = new ArrayList<>();
        while (rst.next()) {
            BatchDTO batchDTO = new BatchDTO(
                    rst.getString("BatchNo"),
                    rst.getString("ModelNo"),
                    new BigDecimal(rst.getString("sellingPrice")),
                    new BigDecimal(rst.getString("originalPrice")),
                    Integer.parseInt(rst.getString("Qty")),
                    new BigDecimal(rst.getString("Amount"))
            );

            batchInfoList.add(batchDTO);
        }
        return batchInfoList;

    }

    @Override
    public BatchDTO search(BatchDTO batchDTO) throws Exception {
        System.out.println("batchImpl search method");

        String modelNo = batchDTO.getModelNo();
        System.out.println(modelNo);

        String sql = "select * from batch where ModelNo='" + modelNo + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {

            BatchDTO DTO = new BatchDTO(
                    rst.getString("BatchNo"),
                    rst.getString("ModelNo"),
                    new BigDecimal(rst.getString("sellingPrice")),
                    new BigDecimal(rst.getString("originalPrice")),
                    Integer.parseInt(rst.getString("Qty")),
                    new BigDecimal(rst.getString("Amount"))
            );

            return DTO;
        } else {
            return null;
        }

    }

}
