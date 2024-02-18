/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.core.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Janitha Dhananjaya
 */
public class CustomDTO {

    private String brand;
    private String modelName;
    private String modelNo;
    private int deliveredQty;
    private double originalPrice;
    private int warrentyPeriod;
    private String status;
    private BigDecimal unitPrice;
    private BigDecimal sellingPrice;
    private String bathcNo;

    private String customerId;
    private String customerName;
    private String supplierId;
    private String supplierName;
    private String soldInvoiceNo;
    private String soldInvoiceDate;
    
    private double itemPrice;
    private int soldQty;
    private int qtyOnHand;
    private int year;
    
    private BigDecimal profit;
    private BigDecimal totalAmount;
    private int count;

    
    
    public CustomDTO(int count) {
        this.count = count;
    }

    public CustomDTO(String brand, String modelName, String modelNo, int deliveredQty, int soldQty) {
        this.brand = brand;
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.deliveredQty = deliveredQty;
        this.soldQty = soldQty;
    }
    
    
    
    public CustomDTO(String brand, String modelName, BigDecimal sellingPrice, String customerName, String soldInvoiceNo) {
        this.brand = brand;
        this.modelName = modelName;
        this.sellingPrice = sellingPrice;
        this.customerName = customerName;
        this.soldInvoiceNo = soldInvoiceNo;
    }

    public CustomDTO(String brand, String modelName, String modelNo, int warrentyPeriod, BigDecimal sellingPrice, int qtyOnHand, int year) {
        this.brand = brand;
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.warrentyPeriod = warrentyPeriod;
        this.sellingPrice = sellingPrice;
        this.qtyOnHand = qtyOnHand;
        this.year = year;
    }

    public CustomDTO(int warrentyPeriod, String customerId, String customerName, String supplierId, String supplierName, String soldInvoiceNo, String soldInvoiceDate) {
        this.warrentyPeriod = warrentyPeriod;
        this.customerId = customerId;
        this.customerName = customerName;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.soldInvoiceNo = soldInvoiceNo;
        this.soldInvoiceDate = soldInvoiceDate;
    }

    public CustomDTO(String modelName, String modelNo, int deliveredQty, double itemPrice) {
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.deliveredQty = deliveredQty;
        this.itemPrice = itemPrice;
    }

    
    
    public CustomDTO() {
    }

    public CustomDTO(String brand, String modelName, String modelNo, int deliveredQty, double originalPrice, int warrentyPeriod) {
        this.brand = brand;
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.deliveredQty = deliveredQty;
        this.originalPrice = originalPrice;
        this.warrentyPeriod = warrentyPeriod;
    }

    public CustomDTO(String status, BigDecimal unitPrice, BigDecimal sellingPrice, String bathcNo) {
        this.status = status;
        this.unitPrice = unitPrice;
        this.sellingPrice = sellingPrice;
        this.bathcNo = bathcNo;
    }

    public CustomDTO(double originalPrice, BigDecimal profit, BigDecimal totalAmount) {
        this.originalPrice = originalPrice;
        this.profit = profit;
        this.totalAmount = totalAmount;
    }

    
    
    

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName the modelName to set
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
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
     * @return the deliveredQty
     */
    public int getDeliveredQty() {
        return deliveredQty;
    }

    /**
     * @param deliveredQty the deliveredQty to set
     */
    public void setDeliveredQty(int deliveredQty) {
        this.deliveredQty = deliveredQty;
    }

    /**
     * @return the originalPrice
     */
    public double getOriginalPrice() {
        return originalPrice;
    }

    /**
     * @param originalPrice the originalPrice to set
     */
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * @return the warrentyPeriod
     */
    public int getWarrentyPeriod() {
        return warrentyPeriod;
    }

    /**
     * @param warrentyPeriod the warrentyPeriod to set
     */
    public void setWarrentyPeriod(int warrentyPeriod) {
        this.warrentyPeriod = warrentyPeriod;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * @return the sellingPrice
     */
    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @return the bathcNo
     */
    public String getBathcNo() {
        return bathcNo;
    }

    /**
     * @param bathcNo the bathcNo to set
     */
    public void setBathcNo(String bathcNo) {
        this.bathcNo = bathcNo;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @return the soldInvoiceNo
     */
    public String getSoldInvoiceNo() {
        return soldInvoiceNo;
    }

    /**
     * @return the soldInvoiceDate
     */
    public String getSoldInvoiceDate() {
        return soldInvoiceDate;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * @return the soldQty
     */
    public int getSoldQty() {
        return soldQty;
    }

    /**
     * @return the qtyOnHand
     */
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @return the profit
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * @return the totalAmount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

}
