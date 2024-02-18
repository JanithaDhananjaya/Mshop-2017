/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.BatchDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.BatchDAO;
import com.project.mobileshop.dao.custom.QueryDAO;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class BatchController {

    private static BatchDAO batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
    
    public static ArrayList<BatchDTO> searchBatch(BatchDTO batchDTO) throws Exception {

        System.out.println("search Batch start");

        
        String modelNo = batchDTO.getModelNo();

        ArrayList<BatchDTO> all = batchDAO.searchBatches(batchDTO);

        return all;
    }

    public static String getBatchs(BatchDTO batchDTO) throws Exception {
        
        BatchDTO batchNo = batchDAO.search(batchDTO);

        if (batchNo == null) {
            String modelNo = batchDTO.getModelNo();
            String batch = ""+modelNo+"-B001";

            return batch;
        }

        BigDecimal b = batchNo.getOriginalPrice();
        double originalPriceOld = b.doubleValue();
        System.out.println("originalPriceOld "+originalPriceOld);

        BigDecimal a = batchDTO.getOriginalPrice();
        double originalPriceNew = a.doubleValue();
        System.out.println("originalPriceNew "+originalPriceNew);

        if (originalPriceOld == originalPriceNew) {
            System.out.println(batchNo.getBatchNo());
            
            return batchNo.getBatchNo();
        } else {
            
            ArrayList<BatchDTO> batchCount = batchDAO.getBatchCount(batchDTO.getModelNo());
            int count=0;
            for (BatchDTO bList : batchCount) {
                count++;
            }
            if(count<10){
                String modelNo = batchDTO.getModelNo();
                String model=modelNo+"-"+"B00"+(count+1);
                return model;
            }else if(count<100){
                String modelNo = batchDTO.getModelNo();
                String model=modelNo+"-"+"B0"+(count+1);
                return model;
            }
            
            return null;
        }

    }

    public static ArrayList<BatchDTO> getAllSelectedBatches() throws Exception {
        
        ArrayList<BatchDTO> allbatches = batchDAO.getAll();
        if (allbatches == null) {
            return null;
        }
        return allbatches;
    }

    public static BatchDTO getSelectedBatchDetails(String batchNo) throws Exception {
        
        ArrayList<BatchDTO> batchList = batchDAO.getAll();
        
        for (BatchDTO b : batchList) {
            String batch = b.getBatchNo();
            System.out.println("Giving batch"+b.getBatchNo());
            System.out.println("Result :"+(batch.equals(batchNo)));
            if (batch.equals(batchNo)) {
                String modelNo = b.getModelNo();
                BigDecimal sellingPrice = b.getSellingPrice();
                BigDecimal originalPrice = b.getOriginalPrice();
                int qty = b.getQty();
                BigDecimal amount = b.getAmount();
                BatchDTO batchDTO = new BatchDTO(batchNo, modelNo, sellingPrice, originalPrice, qty, amount);
                return batchDTO;
            }
        }
        return null;
    }
    public static ArrayList<BatchDTO> getBatch(String modelName) throws Exception{
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        ArrayList<BatchDTO> batchList = queryDAO.getBatches(modelName);
        return batchList;
    }
    public static  BatchDTO BatchDetails(String batchNo) throws Exception{
        BatchDTO batchdetails = batchDAO.getDetails(batchNo);
        return batchdetails;
    }
    public static boolean updateBatch(BatchDTO batchDTO ) throws Exception{
        boolean isUpdated = batchDAO.update(batchDTO);
        return isUpdated;
    }
    public static ArrayList<BatchDTO> modelBatch(String modelName) throws Exception{
        ArrayList<BatchDTO> modelBatch = batchDAO.modelBatch(modelName);
        return modelBatch;
    }
}
