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
public class GRNDTO extends SuperDTO{
    private String GRNId;
    private String supplierId;
    private String GRNDate;
    private double totalAmount;

    public GRNDTO() {
    }

    public GRNDTO(String GRNId, String supplierId, String GRNDate, double totalAmount) {
        this.GRNId = GRNId;
        this.supplierId = supplierId;
        this.GRNDate = GRNDate;
        this.totalAmount = totalAmount;
    }

    
    /**
     * @return the GRNId
     */
    public String getGRNId() {
        return GRNId;
    }

    /**
     * @param GRNId the GRNId to set
     */
    public void setGRNId(String GRNId) {
        this.GRNId = GRNId;
    }

    /**
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the GRNDate
     */
    public String getGRNDate() {
        return GRNDate;
    }

    /**
     * @param GRNDate the GRNDate to set
     */
    public void setGRNDate(String GRNDate) {
        this.GRNDate = GRNDate;
    }

    /**
     * @return the totalAmount
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    
}
