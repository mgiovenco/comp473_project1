package com.facility.dao;

import com.facility.model.Facility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for interacting with the facility table.
 */
public class FacilityDao {

    private static final String SELECT_STATEMENT = "SELECT id, name from facility where id = ?";
    private static final String SELECT_ALL_STATEMENT = "SELECT id, name from facility";
    private static final String INSERT_NEW_FACILITY = "INSERT INTO facility (id, name) values (?, ?)";
    private static final String DELETE_FACILITY = "DELETE from facility where id = ?";

    /**
     * Select single facility by id
     * @param id
     * @return
     */
    public Facility selectFacility(int id) {

        Facility facility = null;

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_STATEMENT, id);
            ps.setInt( 1, id );
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                facility = new Facility( resultSet.getInt("id"), resultSet.getString("name"));
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
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_STATEMENT);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                facilityList.add(new Facility( resultSet.getInt("id"), resultSet.getString("name")));
            }
        }
        catch(SQLException e ) {
            System.out.println("###SQLException: " + e);
        }

        return facilityList;
    }

    public void createFacility(Facility facility) throws Exception {

        if (facility != null) {
            try {
                Connection conn = DBHelper.getconnection();
                PreparedStatement ps = conn.prepareStatement(INSERT_NEW_FACILITY);
                ps.setInt(1, facility.getId());
                ps.setString(2, facility.getName());
                int result = ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println("###SQLException: " + e);
            }
        }
        else {
            //TODO: Figure out proper exception to throw
            throw new Exception("Cannot insert null facility object");
        }
    }

    public void updateFacility() {

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
