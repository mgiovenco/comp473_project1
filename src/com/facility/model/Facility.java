package com.facility.model;

import java.util.List;

 public interface Facility {

     int getId();

     String getName();

     void setName(String name);

     String getLine1();

     void setLine1(String line1);

     String getLine2();

     void setLine2(String line2);

     String getCity();

     void setCity(String city);

     String getState();

     void setState(String state);

     String getZip();

     void setZip(String zip);

     String getPhone();

     void setPhone(String phone);

     int getCapacity();

     void setCapacity(int capacity);

     List<FacilityDetailImpl> getFacilityDetailImpls();

     void setFacilityDetailImpls(List<FacilityDetailImpl> facilityDetailImpls);

}
