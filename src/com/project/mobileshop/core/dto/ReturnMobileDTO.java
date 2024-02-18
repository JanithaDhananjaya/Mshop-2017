/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.core.dto;

import java.util.Date;

/**
 *
 * @author Janitha Dhananjaya
 */
public class ReturnMobileDTO extends SuperDTO {

    private String returnId;
    private String IMEINo;
    private String curDate;
    private String soldDate;
    private String warranty;
    private String issue;
    private String customerId;
    private String supplierId;
    private String soldInvId;

    public ReturnMobileDTO() {
    }

    public ReturnMobileDTO(String returnId, String IMEINo, String curDate, String soldDate, String warranty, String issue, String customerId, String supplierId, String soldInvId) {
        this.returnId = returnId;
        this.IMEINo = IMEINo;
        this.curDate = curDate;
        this.soldDate = soldDate;
        this.warranty = warranty;
        this.issue = issue;
        this.customerId = customerId;
        this.supplierId = supplierId;
        this.soldInvId = soldInvId;
    }

    
    
    /**
     * @return the returnId
     */
    public String getReturnId() {
        return returnId;
    }

    /**
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    /**
     * @return the IMEINo
     */
    public String getIMEINo() {
        return IMEINo;
    }

    /**
     * @param IMEINo the IMEINo to set
     */
    public void setIMEINo(String IMEINo) {
        this.IMEINo = IMEINo;
    }

    /**
     * @return the curDate
     */
    public String getCurDate() {
        return curDate;
    }

    /**
     * @param curDate the curDate to set
     */
    public void setCurDate(String curDate) {
        this.curDate = curDate;
    }

    /**
     * @return the soldDate
     */
    public String getSoldDate() {
        return soldDate;
    }

    /**
     * @param soldDate the soldDate to set
     */
    public void setSoldDate(String soldDate) {
        this.soldDate = soldDate;
    }

    /**
     * @return the warranty
     */
    public String getWarranty() {
        return warranty;
    }

    /**
     * @param warranty the warranty to set
     */
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    /**
     * @return the issue
     */
    public String getIssue() {
        return issue;
    }

    /**
     * @param issue the issue to set
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
     * @return the soldInvId
     */
    public String getSoldInvId() {
        return soldInvId;
    }

    /**
     * @param soldInvId the soldInvId to set
     */
    public void setSoldInvId(String soldInvId) {
        this.soldInvId = soldInvId;
    }

   
}
