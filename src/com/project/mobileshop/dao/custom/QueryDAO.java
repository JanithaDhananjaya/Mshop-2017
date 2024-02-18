/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.BatchDTO;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.core.dto.SuperDTO;
import com.project.mobileshop.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface QueryDAO extends SuperDAO<SuperDTO>{
    
    public ArrayList<CustomDTO> getGoods(String Key)throws Exception;
    public ArrayList<BatchDTO> getBatches(String Key)throws Exception;
    public CustomDTO getMobileDetails(String Key)throws Exception;
    public CustomDTO getReturnMobileDetails(String Key)throws Exception;
    public ArrayList<CustomDTO> getDateInvoices(String Date)throws Exception;
    public CustomDTO searchFromIMEINo(String IMEIno)throws Exception;
    public ArrayList<CustomDTO> mostSoldModel()throws Exception;
    public ArrayList<CustomDTO> lowSoldModel()throws Exception;
    public ArrayList<CustomDTO> allSoldModels()throws Exception;
    public ArrayList<CustomDTO> notSellModel()throws Exception;
    public ArrayList<CustomDTO> serachFromPrice(String Price)throws Exception;
    public CustomDTO getMobileCount(String Name)throws Exception;
    public CustomDTO getSoldMobileCount(String Name)throws Exception;
    public CustomDTO getReturnMobileCount(String Name)throws Exception;
    public ArrayList<CustomDTO> getDailyProfit(String date)throws Exception;
    public ArrayList<CustomDTO> getMonthlyProfit()throws Exception;
    public ArrayList<CustomDTO> getAnnualyProfit()throws Exception;
    public ArrayList<CustomDTO> allModels()throws Exception;
}
