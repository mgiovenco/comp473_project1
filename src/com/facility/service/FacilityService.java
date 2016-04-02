package com.facility.service;

import com.facility.dao.FacilityDao;
import com.facility.model.FacilityDetailImpl;
import com.facility.model.FacilityImpl;

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
    public List<FacilityImpl> listFacilities() {
        return facilityDao.selectAll();
    }

    /**
     * Return facility and facility detail information
     *
     * @return
     */
    public FacilityImpl getFacilityInformation(int id) {
        return facilityDao.selectFacilityWithDetails(id);
    }

    /**
     * Return the facility capacity
     *
     * @param id
     * @return
     */
    public int requestAvailableCapacity(int id) throws Exception {
        return facilityDao.selectFacilityCapacity(id);
    }

    /**
     * Add a new facilityImpl
     *
     * @param facilityImpl
     */
    public void addNewFacility(FacilityImpl facilityImpl) throws Exception {
        facilityDao.createFacility(facilityImpl);
    }

    /**
     * Add a new facility detail
     *
     * @param facilityDetailImpl
     * @throws Exception
     */
    public void addFacilityDetail(FacilityDetailImpl facilityDetailImpl) throws Exception {
        facilityDao.createFacilityDetail(facilityDetailImpl);

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
