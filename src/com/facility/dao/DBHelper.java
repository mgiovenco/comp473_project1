package com.facility.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Helper class for connecting to AWS MySQL DB.
 */
public class DBHelper {

    /*public static Connection getconnection() {

        String connectionUrl = "jdbc:mysql://comp473p1.c5qycvuwlvdp.us-east-1.rds.amazonaws.com:3306/facility_management";
        String dbUser = "mgiovenco";
        String dbPwd = "mgiovenco";
        Connection conn = null;

        try {
            return conn = (Connection) DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("fetch error" + e.getLocalizedMessage());
        }

        return conn;
    }*/

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("*************** Session Factory instantiated ..................");
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
