package com.facility.dao;

import com.facility.model.Inspection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for interacting with the inspection table
 */
public class InspectionDao {

    private static final String SELECT_ALL_FACILITIES = "SELECT id, type, requestedDate, inspectionDate, status from inspection";

    /**
     * Returns all inspections that have either been scheduled
     * @return
     */
    public List<Inspection> selectAll() {

        List<Inspection> inspectionList = new ArrayList<>();

        try {
            Connection conn = DBHelper.getconnection();
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_FACILITIES);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                inspectionList.add(new Inspection(resultSet.getInt("id"), resultSet.getString("type"), resultSet.getDate("requestedDate"), resultSet.getDate("inspectionDate"), resultSet.getString("status")));
            }
        } catch (SQLException e) {
            System.out.println("###SQLException: " + e);
        }

        return inspectionList;
    }
}
