package com.facility.view;

import com.facility.service.FacilityService;
import com.facility.service.InspectionService;
import com.facility.service.MaintenanceService;
import com.facility.service.UseService;

import java.sql.Timestamp;
import java.util.Date;

public class TestClient {

    public static void main(String[] args) throws Exception {
        System.out.println("###FacilityService###");
        FacilityService facilityService = new FacilityService();
        System.out.println("listFacilities(): " + facilityService.listFacilities());
        System.out.println("getFacilityInformation(1): " + facilityService.getFacilityInformation(1));
        System.out.println("requestAvailableCapacity(1): " + facilityService.requestAvailableCapacity(1));
        System.out.println();
        System.out.println("NOTE: the following service methods were not demonstrated for TestClient repeatability purposes:");
        System.out.println("-addNewFacility(Facility facility)");
        System.out.println("-addFacilityDetail(FacilityDetail facilityDetail)");
        System.out.println("-removeFacility(int id)");
        System.out.println();

        System.out.println("###InspectionService###");
        InspectionService inspectionService = new InspectionService();
        System.out.println("listInspections(1): " + inspectionService.listInspections(1));
        System.out.println();

        System.out.println("###MaintenanceService###");
        MaintenanceService maintenanceService = new MaintenanceService();
        System.out.println("calcMaintanceCostForFacility(1): " + maintenanceService.calcMaintanceCostForFacility(1));
        System.out.println("calcProblemRateForFacility(1): " + maintenanceService.calcProblemRateForFacility(1));
        System.out.println("calcDownTimeForFacility(1): " + maintenanceService.calcDownTimeForFacility(1));
        System.out.println("listMaintRequests(1): " + maintenanceService.listMaintRequests(1));
        System.out.println("listMaintenance(1): " + maintenanceService.listMaintenance(1));
        System.out.println("listFacilityProblems(1): " + maintenanceService.listFacilityProblems(1));
        System.out.println();
        System.out.println("NOTE: the following service methods were not demonstrated for TestClient repeatability purposes:");
        System.out.println("-makeFacilityMaintRequest(int facilityId, String maintenanceDescription, BigDecimal maintenanceCost)");
        System.out.println("-scheduleMaintenance(int facilityId, Timestamp startDateTime, Timestamp endDatetTime, int maintenanceId)");
        System.out.println();

        System.out.println("###UseService###");
        UseService useService = new UseService();
        Date startDate = new Date();
        startDate.setDate(01);
        startDate.setMonth(00);
        startDate.setYear(116);
        startDate.setHours(11);
        startDate.setMinutes(0);
        Timestamp startTime = new Timestamp(startDate.getTime());

        Date endDate = new Date();
        endDate.setDate(01);
        endDate.setMonth(00);
        endDate.setYear(116);
        endDate.setHours(11);
        endDate.setMinutes(30);
        Timestamp endTime = new Timestamp(endDate.getTime());

        System.out.println("isInUseDuringInterval(2016-01-01 11:00:00, 2016-01-01 11:30:00, 1): " + useService.isInUseDuringInterval(startTime, endTime, 1));
        System.out.println("listActualUsage(1): " + useService.listActualUsage(1));
        System.out.println("calcUsageRate(1, 90): " + useService.calcUsageRate(1, 90));
        System.out.println();
        System.out.println("NOTE: the following service methods were not demonstrated for TestClient repeatability purposes:");
        System.out.println("-makeFacilityMaintRequest(int facilityId, String maintenanceDescription, BigDecimal maintenanceCost)");
        System.out.println("-assignFacilityToUse(Timestamp startDatetime, Timestamp endDateTime, int custId, int facilityId)");
        System.out.println("-vacateFacility(int facilityId)");

    }
}
