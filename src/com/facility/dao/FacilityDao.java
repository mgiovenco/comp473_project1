package com.facility.dao;

import com.facility.model.FacilityDetailImpl;
import com.facility.model.FacilityImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for interacting with the facility and facility_detail tables.
 */
public class FacilityDao {

    /*private static final String SELECT_FACILITY = "SELECT id, name, line1, line2, city, state, zip, phone, capacity from facility where id = ?";
    private static final String SELECT_ALL_FACILITIES = "SELECT id, name, line1, line2, city, state, zip, phone, capacity from facility";
    private static final String SELECT_FACILITY_WITH_DETAILS = "SELECT f.id, f.name, f.line1, f.line2, f.city, f.state, f.zip, f.phone, f.capacity, fd.id, fd.detail, fd.facility_id from facility f join facility_detail fd on (f.id = fd.facility_id) where f.id = ?";
    private static final String SELECT_FACILITY_CAPACITY = "select capacity from facility where id = ?";

    private static final String INSERT_FACILITY = "INSERT INTO facility (name, line1, line2, city, state, zip, phone, capacity) values (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String INSERT_FACILITY_DETAIL = "INSERT INTO facility_detail (detail, facility_id) values (?, ?)";

    private static final String DELETE_FACILITY = "DELETE from facility where id = ?";


    public FacilityImpl selectFacility(int id) {

        FacilityImpl facilityImpl = null;

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_FACILITY, id);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                facilityImpl = new FacilityImpl(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("line1"), resultSet.getString("line2"), resultSet.getString("city"), resultSet.getString("state"), resultSet.getString("zip"), resultSet.getString("phone"), resultSet.getInt("capacity"));
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return facilityImpl;
    }

    public List<FacilityImpl> selectAll() {

        List<FacilityImpl> facilityImplList = new ArrayList<>();

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_FACILITIES);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                facilityImplList.add(new FacilityImpl(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("line1"), resultSet.getString("line2"), resultSet.getString("city"), resultSet.getString("state"), resultSet.getString("zip"), resultSet.getString("phone"), resultSet.getInt("capacity")));
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return facilityImplList;
    }

    public FacilityImpl selectFacilityWithDetails(int id) {

        FacilityImpl facilityImpl = null;

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_FACILITY_WITH_DETAILS, id);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            List<FacilityDetailImpl> facilityDetailImpls = new ArrayList<>();
            while (resultSet.next()) {
                facilityImpl = new FacilityImpl(resultSet.getInt("f.id"), resultSet.getString("f.name"), resultSet.getString("f.line1"), resultSet.getString("f.line2"), resultSet.getString("f.city"), resultSet.getString("f.state"), resultSet.getString("f.zip"), resultSet.getString("f.phone"), resultSet.getInt("f.capacity"));
                facilityDetailImpls.add(new FacilityDetailImpl(resultSet.getInt("fd.id"), resultSet.getString("fd.detail"), resultSet.getInt("fd.facility_id")));
            }
            if (facilityImpl != null) {
                facilityImpl.setFacilityDetailImpls(facilityDetailImpls);
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        return facilityImpl;
    }

    public int selectFacilityCapacity(int id) throws Exception {
        int capacity = 0; // signifies error code

        Connection conn = DBHelper.getconnection();
        PreparedStatement ps = conn.prepareStatement(SELECT_FACILITY_CAPACITY, id);
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();

        if (resultSet == null) {
            throw new Exception("FacilityImpl not found");
        }
        while (resultSet.next()) {
            capacity = resultSet.getInt("capacity");
        }


        return capacity;
    }

    public void createFacility(FacilityImpl facilityImpl) throws Exception {

        if (facilityImpl != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(INSERT_FACILITY, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, facilityImpl.getName());
                ps.setString(2, facilityImpl.getLine1());
                ps.setString(3, facilityImpl.getLine2());
                ps.setString(4, facilityImpl.getCity());
                ps.setString(5, facilityImpl.getState());
                ps.setString(6, facilityImpl.getZip());
                ps.setString(7, facilityImpl.getPhone());
                ps.setInt(8, facilityImpl.getCapacity());

                int result = ps.executeUpdate();

                if (result == 0) {
                    throw new SQLException("Creating facilityImpl failed, no rows affected.");
                }

                try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        System.out.println("GeneratedKey: " + generatedKeys.getInt(1));
                    } else {
                        throw new SQLException("Creating facilityImpl failed, no ID obtained.");
                    }
                }

            } catch (SQLException e) {
                System.out.println("SQLException: " + e);
            }
        } else {
            throw new Exception("Cannot insert null facilityImpl object");
        }
    }

    public void createFacilityDetail(FacilityDetailImpl facilityDetailImpl) throws Exception {

        if (facilityDetailImpl != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(INSERT_FACILITY_DETAIL);
                ps.setString(1, facilityDetailImpl.getDetail());
                ps.setInt(2, facilityDetailImpl.getFacilityId());

                int result = ps.executeUpdate();

                if (result == 0) {
                    throw new SQLException("Creating facility detail failed, no rows affected.");
                }

            } catch (SQLException e) {
                System.out.println("SQLException: " + e);
            }
        } else {
            throw new Exception("Cannot insert null facility detail object");
        }
    }

    public void deleteFacility(int id) {
        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(DELETE_FACILITY);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }
    }*/
}
