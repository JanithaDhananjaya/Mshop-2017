/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface ModelDAO extends SuperDAO<ModelDTO> {

    public ArrayList<ModelDTO> getBrands() throws Exception;

    public ArrayList<CustomDTO> getModelNames(String Brand) throws Exception;

    public ModelDTO getModelDetails(String modelName) throws Exception;

    public ArrayList<CustomDTO> searchFromYear(String year) throws Exception;

    public ArrayList<CustomDTO> loadAll() throws Exception;

    public ModelDTO FillBrandName(String Name) throws Exception;

}
