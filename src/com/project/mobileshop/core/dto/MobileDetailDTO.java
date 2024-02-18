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
public class MobileDetailDTO extends SuperDTO{
   private String IMEIno;
   private String colur;
   private String status;
   private String GRNno;
   private String modelNo;
   private String batchNo;

    public MobileDetailDTO() {
    }

    public MobileDetailDTO(String IMEIno, String colur, String status, String GRNno, String modelNo, String batchNo) {
        this.IMEIno = IMEIno;
        this.colur = colur;
        this.status = status;
        this.GRNno = GRNno;
        this.modelNo = modelNo;
        this.batchNo = batchNo;
    }

   
   
    /**
     * @return the IMEIno
     */
    public String getIMEIno() {
        return IMEIno;
    }

    /**
     * @param IMEIno the IMEIno to set
     */
    public void setIMEIno(String IMEIno) {
        this.IMEIno = IMEIno;
    }

    /**
     * @return the colur
     */
    public String getColur() {
        return colur;
    }

    /**
     * @param colur the colur to set
     */
    public void setColur(String colur) {
        this.colur = colur;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the GRNno
     */
    public String getGRNno() {
        return GRNno;
    }

    /**
     * @param GRNno the GRNno to set
     */
    public void setGRNno(String GRNno) {
        this.GRNno = GRNno;
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

  
}
