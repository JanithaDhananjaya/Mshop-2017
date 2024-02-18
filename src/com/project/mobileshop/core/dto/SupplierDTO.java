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
public class SupplierDTO extends SuperDTO {
    private String supplierId;
    private String supplierName;
    private int contactNo;
    private String address;
    private String company;
    private String NICno;

    public SupplierDTO() {
    }

    public SupplierDTO(String supplierId, String supplierName, int contactNo, String address, String company, String NICno) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactNo = contactNo;
        this.address = address;
        this.company = company;
        this.NICno = NICno;
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
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supplierName the supplierName to set
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
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
