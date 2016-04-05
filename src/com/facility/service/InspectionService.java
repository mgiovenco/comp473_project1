package com.facility.service;


import com.facility.dao.InspectionDao;
import com.facility.model.Inspection;

import java.util.List;

/**
 * Service for handling facility inspection inquiries
 */
public class InspectionService {

    private InspectionDao inspectionDao;

    public List<Inspection> getFacilityInformation(int id) throws Exception {
        return inspectionDao.selectAllInspections(id);
    }

    public InspectionDao getInspectionDao() {
        return inspectionDao;
    }

    public void setInspectionDao(InspectionDao inspectionDao) {
        this.inspectionDao = inspectionDao;
    }

}
