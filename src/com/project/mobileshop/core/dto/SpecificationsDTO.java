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
public class SpecificationsDTO extends SuperDTO {
    private String specifyId;
    private String modelNo;
    private String displaySize;
    private String operatingSys;
    private String memory;
    private String network;
    private String primaryCam;
    private String secondaryCam;
    private String ram;
    private String sim;
    private String cpu;
    private String sensor;

    public SpecificationsDTO() {
    }

    public SpecificationsDTO(String specifyId, String modelNo, String displaySize, String operatingSys, String memory, String network, String primaryCam, String secondaryCam, String ram, String sim, String cpu, String sensor) {
        this.specifyId = specifyId;
        this.modelNo = modelNo;
        this.displaySize = displaySize;
        this.operatingSys = operatingSys;
        this.memory = memory;
        this.network = network;
        this.primaryCam = primaryCam;
        this.secondaryCam = secondaryCam;
        this.ram = ram;
        this.sim = sim;
        this.cpu = cpu;
        this.sensor = sensor;
    }

    
    
    /**
     * @return the specifyId
     */
    public String getSpecifyId() {
        return specifyId;
    }

    /**
     * @param specifyId the specifyId to set
     */
    public void setSpecifyId(String specifyId) {
        this.specifyId = specifyId;
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
     * @return the displaySize
     */
    public String getDisplaySize() {
        return displaySize;
    }

    /**
     * @param displaySize the displaySize to set
     */
    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    /**
     * @return the operatingSys
     */
    public String getOperatingSys() {
        return operatingSys;
    }

    /**
     * @param operatingSys the operatingSys to set
     */
    public void setOperatingSys(String operatingSys) {
        this.operatingSys = operatingSys;
    }

    /**
     * @return the memory
     */
    public String getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * @return the network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * @param network the network to set
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * @return the primaryCam
     */
    public String getPrimaryCam() {
        return primaryCam;
    }

    /**
     * @param primaryCam the primaryCam to set
     */
    public void setPrimaryCam(String primaryCam) {
        this.primaryCam = primaryCam;
    }

    /**
     * @return the secondaryCam
     */
    public String getSecondaryCam() {
        return secondaryCam;
    }

    /**
     * @param secondaryCam the secondaryCam to set
     */
    public void setSecondaryCam(String secondaryCam) {
        this.secondaryCam = secondaryCam;
    }

    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * @return the sim
     */
    public String getSim() {
        return sim;
    }

    /**
     * @param sim the sim to set
     */
    public void setSim(String sim) {
        this.sim = sim;
    }

    /**
     * @return the cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * @param cpu the cpu to set
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * @return the sensor
     */
    public String getSensor() {
        return sensor;
    }

    /**
     * @param sensor the sensor to set
     */
    public void setSensor(String sensor) {
        this.sensor = sensor;
    }
   

    
   }
