package com.facility.view;

import com.facility.dao.FacilityDao;
import com.facility.model.Facility;
import com.facility.model.FacilityDetail;
import com.facility.model.FacilityUse;
import com.facility.service.FacilityService;
import com.facility.service.InspectionService;
import com.facility.service.UseService;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by mgiovenco on 2/7/16.
 */
public class TestClient {

    public static void main(String[] args) {
        System.out.println("Start program...");

        /*
        FacilityDao facilityDao = new FacilityDao();
        //System.out.println(facilityDao.selectFacility(1));

        FacilityService facilityService = new FacilityService();
        Facility facility = new Facility("A", "824 W Superior St", "Unit 402", "Chicago", "IL", "60642", "847-404-0910", 10);

        try {
            facilityService.addNewFacility(facility);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //facilityService.removeFacility(3);
        //System.out.println("###facilityService.listFacilities(): " + facilityService.listFacilities());


        FacilityDetail facilityDetail = new FacilityDetail("this is my 1st comment", 1);

        try {
            facilityService.addFacilityDetail(facilityDetail);
        } catch (Exception e) {
            e.printStackTrace();
        }

         facilityDetail = new FacilityDetail("this is my 2nd comment", 1);

        try {
            facilityService.addFacilityDetail(facilityDetail);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("###select all facility: " + facilityService.listFacilities());
        System.out.println("###facility with details: " + facilityService.getFacilityInformation(1));
        System.out.println("###get capacity: " + facilityService.getFacilityInformation(1));*/

        //InspectionService inspectionService = new InspectionService();
        //System.out.println("###get all inspections: " + inspectionService.listInspections());


        UseService useService = new UseService();
        Date startDate = new Date();
        startDate.setDate(1);
        startDate.setMonth(12);
        startDate.setYear(150);

        Date endDate = new Date();
        endDate.setDate(1);
        endDate.setMonth(12);
        endDate.setYear(150);

        Timestamp startTimestamp = new Timestamp(startDate.getTime());
        Timestamp endTimestamp = new Timestamp(endDate.getTime());
        /*FacilityUse facilityUse = new FacilityUse(startTimestamp, endTimestamp, 1, "PENDING", 1);
        try {
            useService.assignFacilityToUse(facilityUse);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            System.out.println("###in use:" + useService.isInUseDuringInterval(startTimestamp, endTimestamp, 1));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("###useService.listActualUsage(1): " + useService.listActualUsage(1));

        useService.vacateFacility(1);


    }
}
