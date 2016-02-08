package com.facility.dao;

import java.sql.*;

/**
 * Helper class for connecting to AWS MySQL DB.
 */
public class DBHelper {

    public static Connection getconnection() {

        String connectionUrl = "jdbc:mysql://comp473p1.c5qycvuwlvdp.us-east-1.rds.amazonaws.com:3306/facility_management";
        String dbUser = "mgiovenco";
        String dbPwd = "mgiovenco";
        Connection conn = null;

        try {
            conn = (Connection) DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
            System.out.println("conn Available");

            //Statement statement = conn.createStatement();
            //String sql = "select id, name from facility";
            //ResultSet resultSet = statement.executeQuery(sql);
            //while(resultSet.next()) {
              //  System.out.println("###id: " + resultSet.getInt("id"));
                //System.out.println("###name: " + resultSet.getString("name"));
            //}
            return conn;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("fetch otion error" + e.getLocalizedMessage());
        }

        return conn;
    }
}
