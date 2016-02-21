package com.facility.service;


import com.facility.dao.InspectionDao;
import com.facility.model.Inspection;

import java.util.List;

/**
 * Service for handling facility inspection inquiries
 */
public class InspectionService {

    private InspectionDao inspectionDao;

    public InspectionService() {this.inspectionDao = new InspectionDao();}

    /**
     * Return a list of inspections for given facility
     * @return
     */
    public List<Inspection> listInspections() {
        return inspectionDao.selectAll();
    }
}
