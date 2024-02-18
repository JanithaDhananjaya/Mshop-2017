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
public class ModelDTO extends SuperDTO {
    private String brand;
    private String modelName;
    private String modelNo;        
    private int QtyOnHand;    
    private int warrentyPeriod;
    private int year;

    public ModelDTO() {
    }

    public ModelDTO(String brand, String modelName, String modelNo, int QtyOnHand, int warrentyPeriod, int year) {
        this.brand = brand;
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.QtyOnHand = QtyOnHand;
        this.warrentyPeriod = warrentyPeriod;
        this.year = year;
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
     * @return the QtyOnHand
     */
    public int getQtyOnHand() {
        return QtyOnHand;
    }

    /**
     * @param QtyOnHand the QtyOnHand to set
     */
    public void setQtyOnHand(int QtyOnHand) {
        this.QtyOnHand = QtyOnHand;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    
   
   
}
