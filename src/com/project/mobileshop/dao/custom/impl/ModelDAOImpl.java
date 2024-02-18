/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.core.dto.SuperDTO;
import com.project.mobileshop.dao.custom.ModelDAO;
import com.project.mobileshop.db.DBConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class ModelDAOImpl implements ModelDAO {

    @Override
    public boolean add(ModelDTO modeldto) throws Exception {
        String sql = "insert into model values(?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, modeldto.getModelNo());
        pstm.setObject(2, modeldto.getBrand());
        pstm.setObject(3, modeldto.getModelName());
        pstm.setObject(4, modeldto.getQtyOnHand());
        pstm.setObject(5, modeldto.getWarrentyPeriod());
        pstm.setObject(6, modeldto.getYear());
        boolean result = pstm.executeUpdate() > 0;
        System.out.println("model added suucees" + result);
        return result;
    }

    @Override
    public ArrayList<ModelDTO> getAll() throws Exception {
        String sql = "select * from model";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ModelDTO> list = new ArrayList<>();
        while (rst.next()) {
            ModelDTO dTO = new ModelDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("warrentyPeriod")),
                    Integer.parseInt(rst.getString("year"))
            );
            list.add(dTO);
        }
        return list;
    }

    @Override
    public ModelDTO search(ModelDTO dto) throws Exception {
        String modelNo = dto.getModelNo();
        String sql = "select * from model where ModelNo='" + modelNo + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            ModelDTO dTO = new ModelDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("warrentyPeriod")),
                    Integer.parseInt(rst.getString("year")));

            return dTO;
        } else {
            return null;
        }

    }

    @Override
    public boolean update(ModelDTO dto) throws Exception {
        String sql = "update model set QtyOnHand=? where ModelNo=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getQtyOnHand());
        pstm.setObject(2, dto.getModelNo());
        return pstm.executeUpdate() > 0;
    }

    @Override
    public ArrayList<ModelDTO> getBrands() throws Exception {
        String sql = "select distinct brand from model";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ModelDTO> brandList = new ArrayList<>();

        while (rst.next()) {
            ModelDTO brand = new ModelDTO();
            brand.setBrand(rst.getString("Brand"));
            brandList.add(brand);

        }
        return brandList;
    }

    @Override
    public ArrayList<CustomDTO> getModelNames(String Brand) throws Exception {
        String sql = "select  b.ModelNo,b.sellingPrice, m.Brand,m.modelName,m.QtyOnHand,m.warrentyPeriod,m.year\n"
                + " from model m,batch b \n"
                + "where m.ModelNo=b.ModelNo && Brand='" + Brand + "' \n"
                + "group by modelName order by originalPrice desc;";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<CustomDTO> modelList = new ArrayList<>();

        while (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("warrentyPeriod")),
                    new BigDecimal(rst.getString("sellingPrice")),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("year"))
            );

            modelList.add(dTO);
        }
        return modelList;
    }

    @Override
    public ModelDTO getModelDetails(String modelName) throws Exception {
        String sql = "select * from model where ModelName='" + modelName + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            ModelDTO modelDTO = new ModelDTO(
                    rst.getString("Brand"), modelName,
                    rst.getString("ModelNo"), Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("warrentyPeriod")), Integer.parseInt(rst.getString("year")));
            return modelDTO;
        }
        return null;

    }

    @Override
    public ArrayList<CustomDTO> searchFromYear(String year) throws Exception {
        String sql = "select m.brand,m.modelNo,m.modelName,m.year,m.QtyOnHand,m.year,m.warrentyPeriod,b.sellingPrice\n"
                + "from mobiledetail md,model m, batch b\n"
                + "where md.ModelNo=m.ModelNo && m.ModelNo=b.ModelNo && \n"
                + "year='" + year + "' group by m.modelName;";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<CustomDTO> modelList = new ArrayList<>();

        while (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("warrentyPeriod")),
                    new BigDecimal(rst.getString("sellingPrice")),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("year"))
            );

            modelList.add(dTO);
        }
        return modelList;
    }

    @Override
    public ArrayList<CustomDTO> loadAll() throws Exception {

        String sql = "select m.brand,m.modelNo,m.modelName,m.year,m.QtyOnHand,m.year,m.warrentyPeriod,b.sellingPrice\n"
                + "from mobiledetail md,model m, batch b\n"
                + "where md.ModelNo=m.ModelNo && m.ModelNo=b.ModelNo \n"
                + "group by m.modelName;";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<CustomDTO> modelList = new ArrayList<>();

        while (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("warrentyPeriod")),
                    new BigDecimal(rst.getString("sellingPrice")),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("year"))
            );
            modelList.add(dTO);
        }
        return modelList;

    }

    @Override
    public ModelDTO FillBrandName(String Name) throws Exception {
        String sql = "select Brand from model where Brand like '"+Name+"%' group by Brand";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            ModelDTO dTO=new ModelDTO();
            dTO.setBrand(rst.getString("Brand"));
            return dTO;
        }else{
            return null;
        }
        

    }

}
