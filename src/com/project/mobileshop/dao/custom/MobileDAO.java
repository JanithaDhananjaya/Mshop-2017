/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface MobileDAO extends SuperDAO<MobileDTO> {

    @Override
    public default boolean add(MobileDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean add(ArrayList<MobileDTO> mobile)throws Exception;
}
