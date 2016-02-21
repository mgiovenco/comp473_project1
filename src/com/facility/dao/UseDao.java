package com.facility.dao;

import com.facility.model.FacilityUse;

import java.sql.*;
import java.util.*;

/**
 * Data Access Object for interacting with the facility_use table.
 */
public class UseDao {

    private static final String IN_USE_CHECK = "SELECT 1 from facility_use where (start_datetime >= ? and end_datetime <= ?) and facility_id = ?";
    private static final String SELECT_ALL_FACILITY_USE = "SELECT id, start_datetime, end_datetime, cust_id, status, facility_id from facility_use where facility_id = ?";
    private static final String INSERT_FACILITY_USE = "INSERT INTO facility_use (start_datetime, end_datetime, cust_id, status, facility_id) values (?, ?, ?, ?, ?)";
    private static final String VACATE_FACILITY = "UPDATE facility_use set end_datetime = ?, status = 'VAC' where facility_id = ? and (start_datetime <= ? and end_datetime >= ?)";

    public boolean isInUseDuringInterval(Timestamp startDatetime, Timestamp endDateTime, int facilityId) throws Exception {
        boolean isInUse = false;

        if (startDatetime != null && endDateTime != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(IN_USE_CHECK);
                ps.setTimestamp(1, startDatetime);
                ps.setTimestamp(2, endDateTime);
                ps.setInt(3, facilityId);
                ResultSet resultSet = ps.executeQuery();

                if (resultSet.next()) {
                    isInUse = true;
                }

            } catch (SQLException e) {
                System.out.println("###SQLException: " + e);
            }
        } else {
            throw new Exception("Cannot search for with empty search criteria");
        }

        return isInUse;
    }

    public void createFacilityUse(FacilityUse facilityUse) throws Exception {

        //TODO: Update to do a select lookup to make sure no intersections

        if (facilityUse != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(INSERT_FACILITY_USE);
                ps.setTimestamp(1, facilityUse.getStartDatetime());
                ps.setTimestamp(2, facilityUse.getEndDatetime());
                ps.setInt(3, facilityUse.getCustId());
                ps.setString(4, facilityUse.getStatus());
                ps.setInt(5, facilityUse.getFacilityId());
                int result = ps.executeUpdate();

                if (result == 0) {
                    throw new SQLException("Creating facility use failed, no rows affected.");
                }

            } catch (SQLException e) {
                System.out.println("###SQLException: " + e);
            }
        } else {
            //TODO: Figure out proper exception to throw
            throw new Exception("Cannot insert null facility use object");
        }

    }

    public List<FacilityUse> selectAllFacilityUse(int facilityId) {

        List<FacilityUse> facilityUseList = new ArrayList<>();

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_FACILITY_USE);
            ps.setInt(1, facilityId);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                facilityUseList.add(new FacilityUse(resultSet.getInt("id"), resultSet.getTimestamp("start_datetime"), resultSet.getTimestamp("end_datetime"), resultSet.getInt("cust_id"), resultSet.getString("status"), resultSet.getInt("facility_id")));
            }
        } catch (SQLException e) {
            System.out.println("###SQLException: " + e);
        }

        return facilityUseList;
    }

    public void vacateFacility(int facilityId) {
        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(VACATE_FACILITY);

            Timestamp currentTime = new Timestamp(new java.util.Date().getTime());

            ps.setTimestamp(1, currentTime);
            ps.setInt(2, facilityId);
            ps.setTimestamp(3, currentTime);
            ps.setTimestamp(4, currentTime);

            int result = ps.executeUpdate();

            if (result == 0) {
                System.out.println("No facility in use for facility id = " + facilityId);
            }

            //"UPDATE facility_use set end_datetime = ? and status = 'VAC' where facility_id = ? and (start_datetime <= ? and end_datetime >= ?)";


        } catch (SQLException e) {
            System.out.println("###SQLException: " + e);
        }
    }
}
