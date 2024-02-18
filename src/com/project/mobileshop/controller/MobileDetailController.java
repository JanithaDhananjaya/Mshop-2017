/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.controller;

import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.core.dto.MobileDetailDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.dao.DAOFactory;
import com.project.mobileshop.dao.SuperDAO;
import com.project.mobileshop.dao.custom.MobileDetailDAO;
import com.project.mobileshop.dao.custom.QueryDAO;
import java.util.ArrayList;

/**
 *
 * @author Janitha Dhananjaya
 */
public class MobileDetailController {

    private static MobileDetailDAO mobileDetailDAO = (MobileDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MOBILEDETAIL);
    private static QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);

    public static boolean addMobiles(ArrayList<MobileDetailDTO> mobileList) throws Exception {

        for (MobileDetailDTO d : mobileList) {
            MobileDetailDTO mobileDetailDTO = new MobileDetailDTO(
                    d.getIMEIno(), d.getColur(), d.getStatus(), d.getGRNno(), d.getModelNo(), d.getBatchNo());

            boolean isAddedMobile = mobileDetailDAO.add(mobileDetailDTO);
            if (isAddedMobile == false) {
                return false;
            }
        }
        return true;

    }

    public static ArrayList<MobileDetailDTO> getMobileDetails(String modelNo) throws Exception {
        ArrayList<MobileDetailDTO> mobileList = mobileDetailDAO.getAll();

        ArrayList<MobileDetailDTO> mobileInfoList = new ArrayList<>();

        for (MobileDetailDTO m : mobileList) {
            String model = m.getModelNo();
            if (model.equals(modelNo)) {
                MobileDetailDTO mobileDetailDTO = new MobileDetailDTO(
                        m.getIMEIno(),
                        m.getColur(),
                        m.getStatus(),
                        m.getGRNno(),
                        m.getModelNo(),
                        m.getBatchNo());
                mobileInfoList.add(m);
            }
        }
        return mobileInfoList;

    }

    public static CustomDTO MobileDetails(String IMEIno) throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        CustomDTO mobileDetails = queryDAO.getMobileDetails(IMEIno);
        return mobileDetails;

    }

    public static int searchModelNo(MobileDetailDTO dTO) throws Exception {
        MobileDetailDTO search = mobileDetailDAO.search(dTO);
        if (search != null) {
            String requiredModelNo = dTO.getModelNo();
            String ImeisModelNo = search.getModelNo();

            if (requiredModelNo.equals(ImeisModelNo)) {
                return 1;

            } else {
                return 2;
            }
        } else {
            return 0;
        }

    }

    public static ArrayList<CustomDTO> mostSoldModel() throws Exception {

        return queryDAO.mostSoldModel();
    }

    public static ArrayList<CustomDTO> lowSoldModel() throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        return queryDAO.lowSoldModel();
    }

    public static ArrayList<CustomDTO> notSellModel() throws Exception {
        QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
        return queryDAO.notSellModel();
    }

    public static ArrayList<MobileDetailDTO> getChoosedIMEINo(String modelName) throws Exception {
        return mobileDetailDAO.getChoosedIMEINo(modelName);
    }

    public static boolean update(MobileDetailDTO dTO, String backUpIMEI) throws Exception {
        return mobileDetailDAO.updateIEMINo(dTO, backUpIMEI);
    }

    public static MobileDetailDTO getColour(MobileDetailDTO IMEINo) throws Exception {
        return mobileDetailDAO.search(IMEINo);
    }

    public static CustomDTO getMobileCount(String ModelName) throws Exception {
        return queryDAO.getMobileCount(ModelName);
    }

    public static ArrayList<CustomDTO> allSoldModels() throws Exception {

        return queryDAO.allSoldModels();
    }
    public static ArrayList<CustomDTO> allNotSellModels() throws Exception {

        return queryDAO.notSellModel();
    }
    public static ArrayList<CustomDTO> allModels() throws Exception {

        return queryDAO.allModels();
    }

}
