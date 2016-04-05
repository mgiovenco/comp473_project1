package com.facility.dao;

import com.facility.model.Facility;
import com.facility.model.FacilityImpl;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Data Access Object for interacting with the facility and facility_detail tables.
 */
public class FacilityDao {

    public void createFacility(Facility facility) {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            session.save(facility);
            session.flush();
            session.clear();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    public List<Facility> selectAll() {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            Query getCustQuery = session.createQuery("From FacilityImpl");

            List facilityList = getCustQuery.list();
            session.flush();
            session.clear();
            session.getTransaction().commit();
            return facilityList;
        } finally {
            session.close();
        }
    }

    public Facility selectFacility(int id) {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            Query getCustQuery = session.createQuery("From FacilityImpl where id=:id");
            getCustQuery.setInteger("id", id);

            List facilityList = getCustQuery.list();
            session.flush();
            session.clear();
            session.getTransaction().commit();
            return (FacilityImpl) facilityList.get(0);
        } finally {
            session.close();
        }
    }

    public int selectAvailableCapacity(int id) {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            Query getCustQuery = session.createQuery("From FacilityImpl where id=:id");
            getCustQuery.setInteger("id", id);

            List facilityList = getCustQuery.list();
            session.flush();
            session.clear();
            session.getTransaction().commit();
            Facility facility = (FacilityImpl) facilityList.get(0);
            return facility.getCapacity();
        } finally {
            session.close();
        }
    }

    public void deleteFacility(Facility facility) {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            session.delete(facility);
            session.flush();
            session.clear();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }
}
