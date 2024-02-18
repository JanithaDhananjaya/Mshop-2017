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
public class InvoiceDTO extends SuperDTO {
    private String invoiceId;
    private String orderDate;
    private BigDecimal totalAmount;

    public InvoiceDTO() {
    }

    public InvoiceDTO(String invoiceId, String orderDate, BigDecimal totalAmount) {
        this.invoiceId = invoiceId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    
    
    /**
     * @return the invoiceId
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the totalAmount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    
}
