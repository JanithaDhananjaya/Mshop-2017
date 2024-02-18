/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.InvoiceDTO;
import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.dao.SuperDAO;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface InvoiceDAO extends SuperDAO<InvoiceDTO> {
    public boolean placeOrder(InvoiceDTO dto,MobileDTO mobileDTO,String status,String bathNo,String IMEIno,String modelNo)throws Exception;
}
