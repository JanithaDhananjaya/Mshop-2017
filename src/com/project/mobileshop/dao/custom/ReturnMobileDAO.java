/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ReturnMobileDTO;
import com.project.mobileshop.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface ReturnMobileDAO extends SuperDAO<ReturnMobileDTO> {

    public CustomDTO getCount() throws Exception;

    public ArrayList<ReturnMobileDTO> searchFromModelName(String Key) throws Exception;
    public ArrayList<ReturnMobileDTO> searchFromSupplierName(String Key) throws Exception;
    public ArrayList<ReturnMobileDTO> LoadWarrantyTypes() throws Exception;
    public ArrayList<ReturnMobileDTO> searchFromWarrentyType(String key) throws Exception;
}
