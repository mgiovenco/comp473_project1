package com.facility.view;

import com.facility.dao.DBHelper;
import com.facility.dao.FacilityDao;
import com.facility.model.Facility;
import com.facility.service.FacilityService;

import java.sql.Connection;

/**
 * Created by mgiovenco on 2/7/16.
 */
public class TestClient {

    public static void main(String[] args) {
        System.out.println("Start program...");

        //FacilityDao facilityDao = new FacilityDao();
        //System.out.println(facilityDao.selectFacility(1));

        FacilityService facilityService = new FacilityService();

        /*Facility facility = new Facility(3, "third");
        try {
            facilityService.addNewFacility(facility);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        facilityService.removeFacility(3);

        System.out.println("###facilityService.listFacilities(): " + facilityService.listFacilities());
    }
}
