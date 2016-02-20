package com.facility.service;

import com.facility.dao.FacilityDao;
import com.facility.model.Facility;
import com.facility.model.FacilityDetail;

import java.util.List;

/**
 * Service for interacting with facility entities.
 */
public class FacilityService {

    private FacilityDao facilityDao;

    public FacilityService() {
        this.facilityDao = new FacilityDao();
    }

    /**
     * List all facilities with basic info
     *
     * @return
     */
    public List<Facility> listFacilities() {
        return facilityDao.selectAll();
    }

    /**
     * Return facility and facility detail information
     *
     * @return
     */
    public Facility getFacilityInformation(int id) {
        return facilityDao.selectFacilityWithDetails(id);
    }

    public Facility requestAvailableCapacity() {
        return null;
    }

    /**
     * Add a new facility
     *
     * @param facility
     */
    public void addNewFacility(Facility facility) throws Exception {
        facilityDao.createFacility(facility);
    }

    /**
     * Add a new facility detail
     * @param facilityDetail
     * @throws Exception
     */
    public void addFacilityDetail(FacilityDetail facilityDetail) throws Exception {
        facilityDao.createFacilityDetail(facilityDetail);

    }

    /**
     * Remove a facility
     *
     * @return
     */
    public void removeFacility(int id) {
        facilityDao.deleteFacility(id);
    }
}
