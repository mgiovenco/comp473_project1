package com.facility.dao;

import com.facility.model.Facility;
import com.facility.model.FacilityImpl;
import com.facility.model.FacilityUse;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.Calendar;
import java.util.List;

/**
 * Data Access Object for interacting with the facility_use table.
 */
public class UseDao {

    public List<FacilityUse> selectAllFacilityUse(int id) {
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
            return facility.getFacilityUseList();
        } finally {
            session.close();
        }
    }

    public void createFacilityUse(FacilityUse facilityUse) {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        try {
            session.save(facilityUse);
            session.flush();
            session.clear();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    public void vacateFacility(FacilityUse facilityUse) {
        Session session = DBHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        // Set end datetime to now to signify facility is being vacated
        facilityUse.setEndDatetime(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        try {
            session.save(facilityUse);
            session.flush();
            session.clear();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }
}
