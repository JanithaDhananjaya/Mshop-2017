/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.MobileDetailDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface MobileDetailDAO extends SuperDAO<MobileDetailDTO> {
    public ArrayList<MobileDetailDTO> getChoosedIMEINo(String key)throws Exception;
    public boolean updateIEMINo(MobileDetailDTO dTO,String No)throws Exception;
}
