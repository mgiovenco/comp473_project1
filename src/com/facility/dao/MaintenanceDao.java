package com.facility.dao;

import com.facility.model.*;
import org.hibernate.Query;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Data Access Object for interacting with the facility_problem, maintence_request, and maintenance schedule tables
 */
public class MaintenanceDao {

    public void createMaintenanceRequest(Maintenance maintenance) throws Exception {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            session.save(maintenance);
            session.flush();
            session.clear();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    public List<FacilityProblem> selectAllFacilityProblems(int id) {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            Query getCustQuery = session.createQuery("From FacilityImpl where id=:id");
            getCustQuery.setInteger("id", id);

            List facilityList = getCustQuery.list();
            session.flush();
            session.clear();
            session.getTransaction().commit();
            Facility facility = (FacilityImpl) facilityList.get(0);
            return facility.getFacilityProblemList();
        } finally {
            session.close();
        }
    }


    public List<MaintenanceRequest> selectAllMaintenanceRequests(int id) {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            Query getCustQuery = session.createQuery("From FacilityImpl where id=:id");
            getCustQuery.setInteger("id", id);

            List facilityList = getCustQuery.list();
            session.flush();
            session.clear();
            session.getTransaction().commit();
            Facility facility = (FacilityImpl) facilityList.get(0);
            return facility.getMaintenanceRequestList();
        } finally {
            session.close();
        }
    }

    public void createMaintenceSchedule(MaintenanceSchedule maintenanceSchedule) throws Exception {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            session.save(maintenanceSchedule);
            session.flush();
            session.clear();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    public int getFacilityProblemCount(Facility facility) {
        return facility.getFacilityProblemList().size();
    }

    public List<Maintenance> selectAllMaintenance(Facility facility) {
        return facility.getMaintenanceList();
    }

    public int calculateDownTimeForFacility(Facility facility) {

        int totalDownTimeInMin = 0;

        for (MaintenanceRequest maintenanceRequest : facility.getMaintenanceRequestList()) {
            for (MaintenanceSchedule maintenanceSchedule : maintenanceRequest.getMaintenanceSchedule()) {
                totalDownTimeInMin += TimeUnit.MILLISECONDS.toMinutes(maintenanceSchedule.getEndDateTime().getTime() - maintenanceSchedule.getStartDateTime().getTime());
            }
        }

        return totalDownTimeInMin;
    }

    public BigDecimal calculatePendingMaintenanceCost(Facility facility) {
        BigDecimal totalCost = BigDecimal.ZERO;

        for (MaintenanceRequest maintenanceRequest : facility.getMaintenanceRequestList()) {
            totalCost.add(maintenanceRequest.getMaintenanceCost());
        }
        return totalCost;
    }
}
