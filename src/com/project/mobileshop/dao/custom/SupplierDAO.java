/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.SuperDTO;
import com.project.mobileshop.core.dto.SupplierDTO;
import com.project.mobileshop.dao.SuperDAO;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface SupplierDAO extends SuperDAO<SupplierDTO> {

    public SupplierDTO serachFromName(String Name)throws Exception;
    public SupplierDTO serachFromCompany(String Company)throws Exception;
}
