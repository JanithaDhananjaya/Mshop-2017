/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.core.dto;

import java.math.BigDecimal;

/**
 *
 * @author Janitha Dhananjaya
 */
public class BatchDTO extends SuperDTO {

    private String batchNo;
    private String modelNo;
    private BigDecimal sellingPrice;
    private BigDecimal originalPrice;
    private int qty;
    private BigDecimal amount;

    public BatchDTO() {
    }

    public BatchDTO(String batchNo, String modelNo, BigDecimal sellingPrice, BigDecimal originalPrice, int qty, BigDecimal amount) {
        this.batchNo = batchNo;
        this.modelNo = modelNo;
        this.sellingPrice = sellingPrice;
        this.originalPrice = originalPrice;
        this.qty = qty;
        this.amount = amount;
    }

     
    
    
    /**
     * @return the batchNo
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * @param batchNo the batchNo to set
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * @return the modelNo
     */
    public String getModelNo() {
        return modelNo;
    }

    /**
     * @param modelNo the modelNo to set
     */
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    /**
     * @return the sellingPrice
     */
    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * @return the originalPrice
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * @param originalPrice the originalPrice to set
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    

}
