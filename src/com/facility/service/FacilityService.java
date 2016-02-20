package com.facility.service;

import com.facility.dao.FacilityDao;
import com.facility.model.Facility;

import java.util.List;

/**
 * Service for interacting with facility entities.
 */
public class FacilityService {

    private FacilityDao facilityDao;

    public FacilityService() {
        this.facilityDao = new FacilityDao();
    }

    public List<Facility> listFacilities() {
        return facilityDao.selectAll();
    }

    public Facility getFacilityInformation() {
        return null;
    }

    public Facility requestAvailableCapacity() {
        return null;
    }

    /**
     * Add a new facility
     * @param facility
     */
    public void addNewFacility(Facility facility) throws Exception {
        facilityDao.createFacility(facility);
    }

    public void addFacilityDetail() {
    }

    /**
     * Remove a facility
     * @return
     */
    public void removeFacility(int id) {
        facilityDao.deleteFacility(id);
    }
}
