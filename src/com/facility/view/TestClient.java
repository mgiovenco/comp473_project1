package com.facility.view;

import com.facility.dao.DBHelper;
import com.facility.dao.FacilityDao;

import java.sql.Connection;

/**
 * Created by mgiovenco on 2/7/16.
 */
public class TestClient {

    public static void main(String[] args) {
        System.out.println("Start program...");

        FacilityDao facilityDao = new FacilityDao();

        System.out.println(facilityDao.selectFacility(1));
    }
}
