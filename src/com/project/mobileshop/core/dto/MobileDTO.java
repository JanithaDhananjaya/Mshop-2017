/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.core.dto;

/**
 *
 * @author Janitha Dhananjaya
 */
public class MobileDTO extends SuperDTO {
    private String mobileNo;
    private String IEMIno;
    private String customerID;
    private String modelNo;
    private String invoiceID;
    private int warrentyPeriod;

    public MobileDTO() {
    }

    public MobileDTO(String mobileNo, String IEMIno, String customerID, String modelNo, String invoiceID, int warrentyPeriod) {
        this.mobileNo = mobileNo;
        this.IEMIno = IEMIno;
        this.customerID = customerID;
        this.modelNo = modelNo;
        this.invoiceID = invoiceID;
        this.warrentyPeriod = warrentyPeriod;
    }

    
    
    /**
     * @return the mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the IEMIno
     */
    public String getIEMIno() {
        return IEMIno;
    }

    /**
     * @param IEMIno the IEMIno to set
     */
    public void setIEMIno(String IEMIno) {
        this.IEMIno = IEMIno;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
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
     * @return the invoiceID
     */
    public String getInvoiceID() {
        return invoiceID;
    }

    /**
     * @param invoiceID the invoiceID to set
     */
    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
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
    
    
    
}
