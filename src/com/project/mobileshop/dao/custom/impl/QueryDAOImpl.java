/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom.impl;

import com.project.mobileshop.core.dto.BatchDTO;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.CustomerDTO;
import com.project.mobileshop.core.dto.MobileDetailDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.core.dto.SuperDTO;
import com.project.mobileshop.dao.custom.QueryDAO;
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
public class QueryDAOImpl implements QueryDAO {

    @Override
    public boolean add(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SuperDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SuperDTO search(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomDTO> getGoods(String GRNno) throws Exception {

        String sql = "select good.brand,good.modelName,good.modelNo,good.deliveredQty,good.price,\n"
                + "good.warrentyPeriod from good,mobileDetail\n"
                + "where good.modelNo=mobiledetail.modelNo && GRNId='" + GRNno + "';\n"
                + "";

        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();

        ArrayList<CustomDTO> getGood = new ArrayList<>();

        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {
            CustomDTO customDTO = new CustomDTO(
                    rst.getString("brand"), rst.getString("modelName"),
                    rst.getString("modelNo"), Integer.parseInt(rst.getString("deliveredQty")), Double.parseDouble(rst.getString("price")),
                    Integer.parseInt(rst.getString("warrentyPeriod")));
            getGood.add(customDTO);
        }

        return getGood;
    }

    @Override
    public boolean update(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BatchDTO> getBatches(String modelName) throws Exception {
        String sql = "select BatchNo from batch b,model m where m.ModelNo=b.ModelNo && modelName='" + modelName + "'";
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

    @Override
    public CustomDTO getMobileDetails(String IMEIno) throws Exception {
        String sql = "select  Status,originalPrice, sellingPrice,m.Batchno \n"
                + "from mobiledetail m,batch b \n"
                + "where m. BatchNo=b. BatchNo \n"
                + "&& IMEIno='" + IMEIno + "';\n"
                + "";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CustomDTO mobileDetails = new CustomDTO(
                    rst.getString("Status"),
                    new BigDecimal(rst.getString("originalPrice")),
                    new BigDecimal(rst.getString("sellingPrice")),
                    rst.getString("Batchno")
            );
            return mobileDetails;
        } else {
            return null;
        }

    }

    @Override
    public CustomDTO getReturnMobileDetails(String IMEINo) throws Exception {
        String sql = "select m.invoiceId,m.customerId,c.customerName,m.warrentyPeriod,i.Date,s.supplierId,s.supplierName\n"
                + "from mobile m,invoice i,model mo,mobiledetail md,grn g,supplier s,customer c\n"
                + "where m.invoiceId=i.invoiceId && mo.ModelNo=m.ModelNo && mo.ModelNo=md.ModelNo\n"
                + "&& md.GRNno=g.GRNno && g.supplierId=s.supplierId && m.customerId=c.customerId &&\n"
                + "m.IMEIno='" + IMEINo + "' group by invoiceId";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CustomDTO customDTO = new CustomDTO(
                    Integer.parseInt(rst.getString("warrentyPeriod")),
                    rst.getString("customerId"),
                    rst.getString("customerName"),
                    rst.getString("supplierId"),
                    rst.getString("supplierName"),
                    rst.getString("invoiceId"),
                    rst.getString("Date"));

            return customDTO;
        } else {
            return null;
        }

    }

    @Override
    public ArrayList<CustomDTO> getDateInvoices(String Date) throws Exception {
        String sql = "select i.invoiceId,i.Date,md.ModelName,i.totalAmount,c.customerName,md.Brand from \n"
                + "invoice i,customer c,mobile m,model md\n"
                + "where i.invoiceId=m.invoiceId && m.customerId=c.customerId && md.ModelNo=m.ModelNo &&\n"
                + "i.Date=? group by invoiceId;";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Date);
        ResultSet rst = pstm.executeQuery();
        ArrayList<CustomDTO> invoiceList = new ArrayList<>();
        while (rst.next()) {
            CustomDTO customDTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    new BigDecimal(rst.getString("totalAmount")),
                    rst.getString("customerName"),
                    rst.getString("invoiceId")
            );
            invoiceList.add(customDTO);
        }
        return invoiceList;
    }

    @Override
    public CustomDTO searchFromIMEINo(String IMEIno) throws Exception {
        String sql = "select m.brand,m.modelNo,m.modelName,m.year,m.QtyOnHand,m.year,m.warrentyPeriod,b.sellingPrice\n"
                + "from mobiledetail md,model m, batch b\n"
                + "where md.ModelNo=m.ModelNo && m.ModelNo=b.ModelNo && \n"
                + "IMEIno=? group by m.modelName;";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, IMEIno);
        ResultSet rst = pstm.executeQuery();

        if (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("warrentyPeriod")),
                    new BigDecimal(rst.getString("sellingPrice")),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("year"))
            );

            return dTO;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<CustomDTO> mostSoldModel() throws Exception {
        String sql = "select Brand,ModelName,md.ModelNo,\n"
                + "count(Status) as Sold_Qty ,md.QtyOnHand\n"
                + "from mobiledetail mob,model md where\n"
                + "mob.ModelNo=md.ModelNo && Status='Sold'\n"
                + "group by ModelNo order by Sold_Qty desc limit 10";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> modelList = new ArrayList<>();
        while (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("Sold_Qty"))
            );
            modelList.add(dTO);
        }
        return modelList;
    }

    @Override
    public ArrayList<CustomDTO> lowSoldModel() throws Exception {
        String sql = "select Brand,ModelName,md.ModelNo,\n"
                + "count(Status) as Sold_Qty ,md.QtyOnHand\n"
                + "from mobiledetail mob,model md where\n"
                + "mob.ModelNo=md.ModelNo && Status='Sold'\n"
                + "group by ModelNo order by Sold_Qty asc limit 10";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> modelList = new ArrayList<>();
        while (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("Sold_Qty"))
            );
            modelList.add(dTO);
        }
        return modelList;
    }

    @Override
    public ArrayList<CustomDTO> serachFromPrice(String Price) throws Exception {
        String sql = "select b.ModelNo,b.sellingPrice, m.Brand,\n"
                + "m.modelName,m.QtyOnHand,m.warrentyPeriod,m.year \n"
                + "from batch b,model m \n"
                + "where m.ModelNo=b.ModelNo &&\n"
                + "sellingPrice<='" + Price + "' \n"
                + "group by ModelNo \n"
                + "order by originalPrice desc";
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
    public CustomDTO getMobileCount(String modelName) throws Exception {
        String sql = "select count(mbd.IMEIno) as counts \n"
                + "from mobiledetail mbd,model md \n"
                + "where mbd.ModelNo=md.ModelNo \n"
                + "&& modelName='" + modelName + "'\n"
                + "";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> list = new ArrayList<>();

        if (rst.next()) {
            CustomDTO customDTO = new CustomDTO(rst.getInt("counts"));
            return customDTO;
        }
        return null;
    }

    @Override
    public CustomDTO getSoldMobileCount(String modelName) throws Exception {
        String sql = "select count(IMEIno) as sold_Qty from mobile m,model md\n"
                + "where m.ModelNo=md.ModelNo && ModelName='" + modelName + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CustomDTO customDTO = new CustomDTO(rst.getInt("sold_Qty"));
            return customDTO;
        }
        return null;
    }

    @Override
    public CustomDTO getReturnMobileCount(String modelName) throws Exception {
        String sql = "select count(r.IMEIno) as return_Qty from returnmobile r,model m,mobiledetail mobd\n"
                + "where mobd.IMEIno=r.IMEIno && mobd.ModelNo=m.ModelNo\n"
                + "&& modelName='" + modelName + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            CustomDTO customDTO = new CustomDTO(rst.getInt("return_Qty"));
            return customDTO;
        }
        return null;
    }

    @Override
    public ArrayList<CustomDTO> getDailyProfit(String date) throws Exception {
        String sql = "select i.totalAmount as totalAmount,b.originalPrice as originalPrice,((i.totalAmount)-(b.originalPrice)) as profit from\n"
                + "invoice i,batch b, mobile m,model md,mobiledetail mobd\n"
                + "where i.invoiceId=m.invoiceId && m.ModelNo=md.ModelNo && md.ModelNo=mobd.ModelNo\n"
                + "&& b.BatchNo=mobd.Batchno && Date='" + date + "' group by i.invoiceId;\n"
                + "";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> list = new ArrayList<>();
        System.out.println("enwa");
        while (rst.next()) {
            System.out.println("while");
            CustomDTO customDTO = new CustomDTO(
                    rst.getDouble("originalPrice"),
                    rst.getBigDecimal("profit"),
                    rst.getBigDecimal("totalAmount")
            );
            System.out.println(rst.getBigDecimal("profit"));
            list.add(customDTO);
        }
        return list;
    }

    @Override
    public ArrayList<CustomDTO> getMonthlyProfit() throws Exception {
        String sql = "select i.totalAmount,b.originalPrice,((i.totalAmount)-(b.originalPrice)) as profit from\n"
                + "invoice i,batch b, mobile m,model md,mobiledetail mobd\n"
                + "where i.invoiceId=m.invoiceId && m.ModelNo=md.ModelNo && md.ModelNo=mobd.ModelNo\n"
                + "&& b.BatchNo=mobd.Batchno && year(Date)=year(curDate()) && month(Date)=month(curDate()) group by i.invoiceId;";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> list = new ArrayList<>();
        while (rst.next()) {

            CustomDTO customDTO = new CustomDTO(
                    rst.getDouble("originalPrice"),
                    rst.getBigDecimal("profit"),
                    rst.getBigDecimal("totalAmount")
            );
            System.out.println(rst.getBigDecimal("profit"));
            list.add(customDTO);
        }
        return list;
    }

    @Override
    public ArrayList<CustomDTO> getAnnualyProfit() throws Exception {
        String sql = "select i.totalAmount,b.originalPrice,((i.totalAmount)-(b.originalPrice)) as profit from\n"
                + "invoice i,batch b, mobile m,model md,mobiledetail mobd\n"
                + "where i.invoiceId=m.invoiceId && m.ModelNo=md.ModelNo && md.ModelNo=mobd.ModelNo\n"
                + "&& b.BatchNo=mobd.Batchno && year(Date)=year(curDate()) group by i.invoiceId;\n"
                + "";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> list = new ArrayList<>();
        while (rst.next()) {

            CustomDTO customDTO = new CustomDTO(
                    rst.getDouble("originalPrice"),
                    rst.getBigDecimal("profit"),
                    rst.getBigDecimal("totalAmount")
            );
            System.out.println(rst.getBigDecimal("profit"));
            list.add(customDTO);
        }
        return list;
    }

    @Override
    public ArrayList<CustomDTO> allSoldModels() throws Exception {
        String sql = "select Brand,ModelName,md.ModelNo,\n"
                + "count(Status) as Sold_Qty ,md.QtyOnHand\n"
                + "from mobiledetail mob,model md where\n"
                + "mob.ModelNo=md.ModelNo && Status='Sold'\n"
                + "group by ModelNo order by Sold_Qty desc;";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> modelList = new ArrayList<>();
        while (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("Sold_Qty"))
            );
            modelList.add(dTO);
        }
        return modelList;
    }

    

    @Override
    public ArrayList<CustomDTO> notSellModel() throws Exception {
        String sql = "select Brand,ModelName,md.ModelNo,\n"
                + "count(Status) as Sold_Qty ,md.QtyOnHand\n"
                + "from mobiledetail mob,model md where\n"
                + "mob.ModelNo=md.ModelNo && Status='not sell'\n"
                + "group by ModelNo order by Sold_Qty\n"
                + "";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> modelList = new ArrayList<>();
        while (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("Sold_Qty"))
            );
            modelList.add(dTO);
        }
        return modelList;
    }

    @Override
    public ArrayList<CustomDTO> allModels() throws Exception {
        String sql = "";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CustomDTO> modelList = new ArrayList<>();
        while (rst.next()) {
            CustomDTO dTO = new CustomDTO(
                    rst.getString("Brand"),
                    rst.getString("ModelName"),
                    rst.getString("ModelNo"),
                    Integer.parseInt(rst.getString("QtyOnHand")),
                    Integer.parseInt(rst.getString("Not_Sold_Qty"))
            );
            modelList.add(dTO);
        }
        return modelList;
    }

}
