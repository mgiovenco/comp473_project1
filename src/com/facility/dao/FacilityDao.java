package com.facility.dao;

import com.facility.model.Facility;
import com.facility.model.FacilityDetail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for interacting with the facility table.
 */
public class FacilityDao {

    private static final String SELECT_FACILITY = "SELECT id, name, line1, line2, city, state, zip, phone from facility where id = ?";
    private static final String SELECT_ALL_FACILITIES = "SELECT id, name, line1, line2, city, state, zip, phone from facility";
    private static final String SELECT_FACILITY_WITH_DETAILS = "SELECT f.id, f.name, f.line1, f.line2, f.city, f.state, f.zip, f.phone, fd.id, fd.detail, fd.facility_id from facility f join facility_detail fd on (f.id = fd.facility_id) where f.id = ?";
    private static final String INSERT_FACILITY = "INSERT INTO facility (name, line1, line2, city, state, zip, phone) values (?, ?, ?, ?, ?, ?, ?)";
    private static final String DELETE_FACILITY = "DELETE from facility where id = ?";
    private static final String INSERT_FACILITY_DETAIL = "INSERT INTO facility_detail (detail, facility_id) values (?, ?)";

    /**
     * Select single facility by id
     * @param id
     * @return
     */
    public Facility selectFacility(int id) {

        Facility facility = null;

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_FACILITY, id);
            ps.setInt( 1, id );
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                facility = new Facility( resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("line1"), resultSet.getString("line2"), resultSet.getString("city"), resultSet.getString("state"), resultSet.getString("zip"), resultSet.getString("phone"));
            }
        }
        catch(SQLException e ) {
            System.out.println("###SQLException: " + e);
        }

        return facility;
    }

    public List<Facility> selectAll() {

        List<Facility> facilityList = new ArrayList<>();

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_FACILITIES);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                facilityList.add(new Facility( resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("line1"), resultSet.getString("line2"), resultSet.getString("city"), resultSet.getString("state"), resultSet.getString("zip"), resultSet.getString("phone")));
            }
        }
        catch(SQLException e ) {
            System.out.println("###SQLException: " + e);
        }

        return facilityList;
    }

    public Facility selectFacilityWithDetails(int id) {

        Facility facility = null;

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_FACILITY_WITH_DETAILS, id);
            ps.setInt( 1, id );
            ResultSet resultSet = ps.executeQuery();

            List<FacilityDetail> facilityDetails = new ArrayList<>();
            while(resultSet.next()) {
                // TODO: Optimize this so it doesn't createa  bunch of facility objects each time (just need to set it first time)
                facility = new Facility( resultSet.getInt("f.id"), resultSet.getString("f.name"), resultSet.getString("f.line1"), resultSet.getString("f.line2"), resultSet.getString("f.city"), resultSet.getString("f.state"), resultSet.getString("f.zip"), resultSet.getString("f.phone"));
                facilityDetails.add(new FacilityDetail(resultSet.getInt("fd.id"), resultSet.getString("fd.detail"), resultSet.getInt("fd.facility_id")));
            }
            if(facility != null) {
                facility.setFacilityDetails(facilityDetails);
            }
        }
        catch(SQLException e ) {
            System.out.println("###SQLException: " + e);
        }

        return facility;
    }

    public void createFacility(Facility facility) throws Exception {

        if (facility != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(INSERT_FACILITY, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, facility.getName());
                ps.setString(2, facility.getLine1());
                ps.setString(3, facility.getLine2());
                ps.setString(4, facility.getCity());
                ps.setString(5, facility.getState());
                ps.setString(6, facility.getZip());
                ps.setString(7, facility.getPhone());

                int result = ps.executeUpdate();

                if (result == 0) {
                    throw new SQLException("Creating facility failed, no rows affected.");
                }

                try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        System.out.println("###generatedKey: " + generatedKeys.getInt(1));
                    }
                    else {
                        throw new SQLException("Creating facility failed, no ID obtained.");
                    }
                }

            } catch (SQLException e) {
                System.out.println("###SQLException: " + e);
            }
        }
        else {
            //TODO: Figure out proper exception to throw
            throw new Exception("Cannot insert null facility object");
        }
    }

    public void createFacilityDetail(FacilityDetail facilityDetail) throws Exception {

        if (facilityDetail != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(INSERT_FACILITY_DETAIL);
                ps.setString(1, facilityDetail.getDetail());
                ps.setInt(2, facilityDetail.getFacilityId());

                int result = ps.executeUpdate();

                if (result == 0) {
                    throw new SQLException("Creating facility detail failed, no rows affected.");
                }

            } catch (SQLException e) {
                System.out.println("###SQLException: " + e);
            }
        }
        else {
            //TODO: Figure out proper exception to throw
            throw new Exception("Cannot insert null facility detail object");
        }

    }

    public void deleteFacility(int id) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(DELETE_FACILITY);
                ps.setInt(1, id);
                int result = ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println("###SQLException: " + e);
            }

    }

}
