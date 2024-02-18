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
public class CustomerDTO extends SuperDTO{
    private String customerId;
    private String customerName;
    private int contactNo;
    private String NICno;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerId, String customerName, int contactNo, String NICno) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNo = contactNo;
        this.NICno = NICno;
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
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the contactNo
     */
    public int getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the NICno
     */
    public String getNICno() {
        return NICno;
    }

    /**
     * @param NICno the NICno to set
     */
    public void setNICno(String NICno) {
        this.NICno = NICno;
    }
    
    
}
