package com.facility.dao;

import com.facility.model.Facility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Data Access Object for interacting with the facility table.
 */
public class FacilityDao {

    private static final String SELECT_STATEMENT = "SELECT id, name from facility where id = ?";

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

    public void createFacility() {

    }

    public void updateFacility() {

    }

    public void deleteFacility() {

    }

}
