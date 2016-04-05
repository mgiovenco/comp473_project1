package com.facility.dao;

import com.facility.model.Facility;
import com.facility.model.FacilityImpl;
import com.facility.model.Inspection;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Data Access Object for interacting with the inspection table
 */
public class InspectionDao {


    public List<Inspection> selectAllInspections(int id) {
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
            return facility.getInspectionList();
        } finally {
            session.close();
        }
    }
}
