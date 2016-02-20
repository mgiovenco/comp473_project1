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

            return conn;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("fetch error" + e.getLocalizedMessage());
        }

        return conn;
    }
}
