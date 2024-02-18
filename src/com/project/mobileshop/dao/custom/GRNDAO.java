/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.GRNDTO;
import com.project.mobileshop.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface GRNDAO extends SuperDAO<GRNDTO> {
    public ArrayList<GRNDTO> getGRNFromDate(String Key)throws Exception;
    public ArrayList<GRNDTO> getGRNFromSupplierID(String Key)throws Exception;
    public ArrayList<GRNDTO> getGRNFromSupplierName(String Key)throws Exception;
    public ArrayList<GRNDTO> getGRNFromCompany(String Key)throws Exception;
    public GRNDTO getGRNFromGRNId(String Key)throws Exception;
    public ArrayList<CustomDTO> getGRNDetails(String Key)throws Exception;
}
