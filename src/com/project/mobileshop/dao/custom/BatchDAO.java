/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao.custom;

import com.project.mobileshop.core.dto.BatchDTO;
import com.project.mobileshop.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public interface BatchDAO extends SuperDAO<BatchDTO> {
    public BatchDTO getDetails(String batchNo)throws Exception;
    public BatchDTO searchBatchNo(String batchNo)throws Exception;
    public boolean updateBatch(BatchDTO batchDTO)throws Exception;
    public ArrayList<BatchDTO> getBatchCount(String modelNo)throws Exception;
    public ArrayList<BatchDTO> modelBatch(String modelNo)throws Exception;
    public ArrayList<BatchDTO> searchBatches(BatchDTO dto)throws Exception;
    
    
}
