/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao;

import com.project.mobileshop.core.dto.SuperDTO;
import com.project.mobileshop.core.dto.SupplierDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface SuperDAO<T extends SuperDTO> {
    public  boolean add(T dto) throws Exception;
    public ArrayList<T> getAll() throws Exception;
    public T search(T dto) throws Exception;
    public boolean update(T dto) throws Exception;
    
}
