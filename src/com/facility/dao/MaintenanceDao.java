package com.facility.dao;

import com.facility.model.FacilityProblemImpl;
import com.facility.model.MaintenanceImpl;
import com.facility.model.MaintenanceRequestImpl;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Data Access Object for interacting with the facility_problem, maintence_request, and maintenance schedule tables
 */
public class MaintenanceDao {

    /*private static final String SELECT_FACILITY_PROBLEM_COUNT = "SELECT COUNT(*) as problem_count from facility_problem where facility_id = ?";
    private static final String SELECT_ALL_FACILITY_PROBLEM = "SELECT id, problem_description, repair_cost, status, facility_id from facility_problem where facility_id = ?";
    private static final String SELECT_ALL_MAINTENANCE_REQUEST = "SELECT id, maintenance_description, requested_datetime, maintenance_cost, status, facility_id from maintenance_request where facility_id = ?";
    private static final String SELECT_ALL_MAINTENANCE = "SELECT id, maintenance_description, last_occurence_datetime, maintenance_cost, status, recommended_occurence_rate, facility_id from maintenance where facility_id = ?";
    private static final String SELECT_PENDING_MAINTENANCE_COST = "SELECT sum(m.maintenance_cost) as total_cost from maintenance m join maintenance_schedule ms on (m.id = ms.maintenance_id) where m.facility_id = ? and ms.status = 'PENDING'";
    private static final String SELECT_TOTAL_MAINTENANCE_DOWNTIME = "SELECT sum(TIMESTAMPDIFF(MINUTE, start_datetime, end_datetime)) as total_downtime from maintenance_schedule where facility_id = ? and status = 'PENDING'";

    private static final String INSERT_MAINTENANCE_REQUEST = "INSERT into maintenance_request (maintenance_description, requested_datetime, maintenance_cost, status, facility_id) values (?, now(), ?, 'PENDING', ?)";
    private static final String INSERT_MAINTENANCE_SCHEDULE = "INSERT into maintenance_schedule (start_datetime, end_datetime, status, facility_id, maintenance_id) values (?, ?, 'PENDING', ?, ?)";

    public int getFacilityProblemCount(int facilityId) {
        int facilityProblemCount = 0;

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_FACILITY_PROBLEM_COUNT);
            ps.setInt(1, facilityId);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                facilityProblemCount = resultSet.getInt("problem_count");
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return facilityProblemCount;
    }

    public List<FacilityProblemImpl> selectAllFacilityProblems(int facilityId) {
        List<FacilityProblemImpl> facilityProblemImplList = new ArrayList<>();

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_FACILITY_PROBLEM);
            ps.setInt(1, facilityId);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                facilityProblemImplList.add(new FacilityProblemImpl(resultSet.getInt("id"), resultSet.getString("problem_description"), resultSet.getBigDecimal("repair_cost"), resultSet.getString("status"), resultSet.getInt("facility_id")));
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return facilityProblemImplList;
    }

    public List<MaintenanceRequestImpl> selectAllMaintenanceRequests(int facilityId) {
        List<MaintenanceRequestImpl> maintenanceRequestImplList = new ArrayList<>();

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_MAINTENANCE_REQUEST);
            ps.setInt(1, facilityId);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                maintenanceRequestImplList.add(new MaintenanceRequestImpl(resultSet.getInt("id"), resultSet.getString("maintenance_description"), resultSet.getTimestamp("requested_datetime"), resultSet.getBigDecimal("maintenance_cost"), resultSet.getString("status"), resultSet.getInt("facility_id")));
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return maintenanceRequestImplList;
    }

    public List<MaintenanceImpl> selectAllMaintenance(int facilityId) {
        List<MaintenanceImpl> maintenanceImplList = new ArrayList<>();

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_MAINTENANCE);
            ps.setInt(1, facilityId);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                maintenanceImplList.add(new MaintenanceImpl(resultSet.getInt("id"), resultSet.getString("maintenance_description"), resultSet.getTimestamp("last_occurence_datetime"), resultSet.getBigDecimal("maintenance_cost"), resultSet.getString("recommended_occurence_rate"), resultSet.getString("status"), resultSet.getInt("facility_id")));
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return maintenanceImplList;
    }

    public void createMaintenanceRequest(String maintenanceDescription, BigDecimal maintenanceCost, int facilityId) throws Exception {

        if (maintenanceDescription != null && maintenanceCost != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(INSERT_MAINTENANCE_REQUEST);
                ps.setString(1, maintenanceDescription);
                ps.setBigDecimal(2, maintenanceCost);
                ps.setInt(3, facilityId);

                int result = ps.executeUpdate();

                if (result == 0) {
                    throw new SQLException("Creating maintenance request failed, no rows affected.");
                }

            } catch (SQLException e) {
                System.out.println("SQLException: " + e);
            }
        }
        else {
            throw new Exception("Cannot insert nulls into maintenance request object");
        }
    }

    public void createMaintenceSchedule(int facilityId, Timestamp startDateTime, Timestamp endDatetTime, int maintenanceId) throws Exception {

        if (startDateTime != null && endDatetTime != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(INSERT_MAINTENANCE_SCHEDULE);
                ps.setTimestamp(1, startDateTime);
                ps.setTimestamp(2, endDatetTime);
                ps.setInt(3, facilityId);
                ps.setInt(4, maintenanceId);

                int result = ps.executeUpdate();

                if (result == 0) {
                    throw new SQLException("Creating maintenance schedule request failed, no rows affected.");
                }

            } catch (SQLException e) {
                System.out.println("SQLException: " + e);
            }
        }
        else {
            throw new Exception("Cannot insert nulls into maintenance schedule request object");
        }
    }

    public BigDecimal calculatePendingMaintenanceCost(int facilityId) {

        BigDecimal pendingMaintenanceCost = BigDecimal.ZERO;

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_PENDING_MAINTENANCE_COST);
            ps.setInt(1, facilityId);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                pendingMaintenanceCost = resultSet.getBigDecimal("total_cost");
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return pendingMaintenanceCost;
    }

    public int calculateDownTimeForFacility(int facilityId) {

        int totalDownTimeInMin = 0;

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_TOTAL_MAINTENANCE_DOWNTIME);
            ps.setInt(1, facilityId);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                totalDownTimeInMin = resultSet.getInt("total_downtime");
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return totalDownTimeInMin;
    }*/
}
