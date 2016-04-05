package com.facility.service;

import com.facility.dao.FacilityDao;
import com.facility.model.Facility;

import java.util.List;

/**
 * Service for interacting with facility entities.
 */
public class FacilityService {

    private FacilityDao facilityDao;

    public Facility getFacilityInformation(int id) throws Exception {
        return facilityDao.selectFacility(id);
    }

    public List<Facility> listFacilities() {
        return facilityDao.selectAll();
    }

    public int requestAvailableCapacity(int id) throws Exception {
        return facilityDao.selectAvailableCapacity(id);
    }

    public void removeFacility(Facility facility) {
        facilityDao.deleteFacility(facility);
    }

    public FacilityDao getFacilityDao() {
        return facilityDao;
    }

    public void setFacilityDao(FacilityDao facilityDao) {
        this.facilityDao = facilityDao;
    }

}
