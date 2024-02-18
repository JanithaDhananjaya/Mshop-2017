/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.SpecificationsDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.SpecificationsDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class SpecificationController {

    private static SpecificationsDAO specificationsDAO = (SpecificationsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SPECIFICATONS);

    public static boolean addSpecifications(SpecificationsDTO dTO) throws Exception {

        return specificationsDAO.add(dTO);
    }

    public static SpecificationsDTO search(SpecificationsDTO dTO) throws Exception {
        return specificationsDAO.search(dTO);
    }
    public static boolean updateSpecifications(SpecificationsDTO dTO) throws Exception {
        return specificationsDAO.update(dTO);
    }
}
