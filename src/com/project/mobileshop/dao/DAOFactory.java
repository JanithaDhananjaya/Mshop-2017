/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.dao;

import static com.project.mobileshop.dao.DAOFactory.DAOTypes.RETURNMOBILE;
import com.project.mobileshop.dao.custom.ModelDAO;
import com.project.mobileshop.dao.custom.SpecificationsDAO;
import com.project.mobileshop.dao.custom.impl.BatchDAOImpl;
import com.project.mobileshop.dao.custom.impl.CustomerDAOImpl;
import com.project.mobileshop.dao.custom.impl.GRNDAOImpl;
import com.project.mobileshop.dao.custom.impl.InvoiceDAOImpl;
import com.project.mobileshop.dao.custom.impl.MobileDAOImpl;
import com.project.mobileshop.dao.custom.impl.MobileDetailDAOImpl;
import com.project.mobileshop.dao.custom.impl.ModelDAOImpl;
import com.project.mobileshop.dao.custom.impl.QueryDAOImpl;
import com.project.mobileshop.dao.custom.impl.ReturnMobileDAOImpl;
import com.project.mobileshop.dao.custom.impl.SpecificationsDAOImpl;
import com.project.mobileshop.dao.custom.impl.SupplierDAOImpl;
import com.project.mobileshop.dao.custom.impl.UserDAOImpl;

/**
 *
 * @author Janitha Dhananjaya
 */
public class DAOFactory {

    public enum DAOTypes {

        SUPPLIER,GRN,QUERY,MODEL,CUSTOMER,MOBILE,MOBILEDETAIL,BATCH,INVOICE,RETURNMOBILE,SPECIFICATONS,USER;
    }

    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public SuperDAO getDAO(DAOTypes daoType) {
        switch (daoType) {
            case SUPPLIER:
                return new SupplierDAOImpl();
            case GRN:
                return new GRNDAOImpl();         
            case QUERY:
                return new QueryDAOImpl();
            case MODEL:
                return new ModelDAOImpl();
            case MOBILE:
                return new MobileDAOImpl();
                case MOBILEDETAIL:
                    return new MobileDetailDAOImpl();
                case BATCH:
                    return new BatchDAOImpl();
                case INVOICE:
                    return new InvoiceDAOImpl();
                case RETURNMOBILE:
                    return new ReturnMobileDAOImpl();
                case CUSTOMER:
                    return new CustomerDAOImpl();
                case SPECIFICATONS:
                    return new SpecificationsDAOImpl();
                case USER:
                    return new UserDAOImpl();
            default:
                return null;
        }
    }

}
