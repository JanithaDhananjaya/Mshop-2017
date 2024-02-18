/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.GRNDTO;
import com.project.mobileshop.dao.custom.GRNDAO;
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
public class GRNDAOImpl implements GRNDAO {

    @Override
    public boolean add(GRNDTO grndto) throws Exception {
        String sql = "INSERT INTO grn values(?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, grndto.getGRNId());
        pstm.setObject(2, grndto.getGRNDate());
        pstm.setObject(3, grndto.getTotalAmount());
        pstm.setObject(4, grndto.getSupplierId());
        boolean result = pstm.executeUpdate() > 0;

        System.out.println("added grn success" + result);
        return result;

    }

    @Override
    public ArrayList<GRNDTO> getAll() throws Exception {
        String sql = "select * from grn";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<GRNDTO> grnList = new ArrayList<>();

        while (rst.next()) {
            GRNDTO grndto = new GRNDTO(
                    rst.getString("GRNno"), rst.getString("supplierId"), rst.getString("Date"), Double.parseDouble(rst.getString("totalAmount")));
            grnList.add(grndto);
        }
        return grnList;
    }

    @Override
    public GRNDTO search(GRNDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(GRNDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<GRNDTO> getGRNFromDate(String Date) throws Exception {
        System.out.println("Date " + Date);
        String sql = "select * from grn where Date=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Date);
        ResultSet rst = pstm.executeQuery();
        ArrayList<GRNDTO> grnList = new ArrayList<>();
        while (rst.next()) {
            GRNDTO grndto = new GRNDTO(
                    rst.getString("GRNno"),
                    rst.getString("supplierId"),
                    rst.getString("Date"),
                    Double.parseDouble(rst.getString("totalAmount")));
            grnList.add(grndto);
        }
        return grnList;

    }

    @Override
    public GRNDTO getGRNFromGRNId(String GRNID) throws Exception {

        String sql = "select * from grn where GRNno=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, GRNID);
        ResultSet rst = pstm.executeQuery();

        if (rst.next()) {
            GRNDTO grndto = new GRNDTO(
                    rst.getString("GRNno"),
                    rst.getString("supplierId"),
                    rst.getString("Date"),
                    Double.parseDouble(rst.getString("totalAmount")));
            return grndto;
        }
        return null;
    }

    @Override
    public ArrayList<GRNDTO> getGRNFromSupplierID(String ID) throws Exception {
        String sql = "select * from grn where supplierId=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, ID);
        ResultSet rst = pstm.executeQuery();
        ArrayList<GRNDTO> grnList = new ArrayList<>();
        while (rst.next()) {
            GRNDTO grndto = new GRNDTO(
                    rst.getString("GRNno"),
                    rst.getString("supplierId"),
                    rst.getString("Date"),
                    Double.parseDouble(rst.getString("totalAmount")));
            grnList.add(grndto);
        }
        return grnList;
    }

    @Override
    public ArrayList<GRNDTO> getGRNFromSupplierName(String Name) throws Exception {

        String sql = "select * from grn g,supplier s where \n"
                + "g.supplierId=s.supplierId && supplierName=?";

        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Name);
        ResultSet rst = pstm.executeQuery();
        ArrayList<GRNDTO> grnList = new ArrayList<>();
        while (rst.next()) {
            GRNDTO grndto = new GRNDTO(
                    rst.getString("GRNno"),
                    rst.getString("supplierId"),
                    rst.getString("Date"),
                    Double.parseDouble(rst.getString("totalAmount")));
            grnList.add(grndto);
        }
        return grnList;
    }

    @Override
    public ArrayList<GRNDTO> getGRNFromCompany(String Company) throws Exception {
        String sql = "select * from grn g,supplier s where \n"
                + "g.supplierId=s.supplierId && company=?";

        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Company);
        ResultSet rst = pstm.executeQuery();
        ArrayList<GRNDTO> grnList = new ArrayList<>();
        while (rst.next()) {
            GRNDTO grndto = new GRNDTO(
                    rst.getString("GRNno"),
                    rst.getString("supplierId"),
                    rst.getString("Date"),
                    Double.parseDouble(rst.getString("totalAmount")));
            grnList.add(grndto);
        }
        return grnList;
    }

    @Override
    public ArrayList<CustomDTO> getGRNDetails(String GRNNo) throws Exception {
        String sql = "select mo.ModelNo,modelName,count(mo.ModelNo) as Qty,b.originalPrice from \n"
                + "grn g,mobiledetail md,model mo,batch b where\n"
                + " g.GRNno=md.GRNno && mo.ModelNo=md.ModelNo \n"
                + "&& b.BatchNo=md.Batchno &&\n"
                + "g.GRNno=? \n"
                + "group by modelNo;";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, GRNNo);
        ResultSet rst = pstm.executeQuery();
        ArrayList<CustomDTO> grnList = new ArrayList<>();
        while (rst.next()) {
            CustomDTO customDTO = new CustomDTO(
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("Qty")),
                    Double.parseDouble(rst.getString("originalPrice")));
            grnList.add(customDTO);
        }
        return grnList;
    }

}
