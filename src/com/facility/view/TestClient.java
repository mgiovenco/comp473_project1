package com.facility.view;

import com.facility.model.Facility;
import com.facility.model.FacilityDetail;
import com.facility.model.FacilityDetailImpl;
import com.facility.model.FacilityImpl;
import com.facility.service.FacilityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestClient {

    public static void main(String[] args) throws Exception {

        System.out.println("###FacilityService###");
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("###facility: " + context.getBean("facility"));

        /*FacilityDetail facilityDetail = new FacilityDetailImpl();
        facilityDetail.setDetail("test detail2");

        List<FacilityDetail> facilityDetailList = new ArrayList<>();
        facilityDetailList.add(facilityDetail);

        FacilityService facilityService = (FacilityService) context.getBean("facilityService");
        System.out.println("###facilityService: " + facilityService);
        Facility facility = new FacilityImpl();
        facility.setCapacity(10);
        facility.setCity("Chicago");
        facility.setLine1("line 1");
        facility.setLine2("line 2");
        facility.setName("Cobs Sports Center");
        facility.setPhone("1112223333");
        facility.setState("IL");
        facility.setZip("60643");
        facility.setFacilityDetailList(facilityDetailList);

        facilityService.getFacilityInformation(facility);*/

        FacilityService facilityService = (FacilityService) context.getBean("facilityService");
        System.out.println("###get(1): " + facilityService.getFacilityInformation(1));

        System.out.println("###after save");
        System.exit(0);
    }
}
