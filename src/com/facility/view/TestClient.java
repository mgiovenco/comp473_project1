package com.facility.view;

import com.facility.dao.FacilityDao;
import com.facility.model.Facility;
import com.facility.model.FacilityDetail;
import com.facility.service.FacilityService;

/**
 * Created by mgiovenco on 2/7/16.
 */
public class TestClient {

    public static void main(String[] args) {
        System.out.println("Start program...");

        FacilityDao facilityDao = new FacilityDao();
        //System.out.println(facilityDao.selectFacility(1));

        //FacilityService facilityService = new FacilityService();
        //Facility facility = new Facility("5th", "824 W Superior St", "Unit 402", "Chicago", "IL", "60642", "847-404-0910");

        /*try {
            facilityService.addNewFacility(facility);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //facilityService.removeFacility(3);
        //System.out.println("###facilityService.listFacilities(): " + facilityService.listFacilities());


        /*FacilityDetail facilityDetail = new FacilityDetail("this is my second comment", 1);

        try {
            facilityDao.createFacilityDetail(facilityDetail);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        System.out.println("###facilityDao.selectFacilityWithDetails(1): " + facilityDao.selectFacilityWithDetails(1));


    }
}
