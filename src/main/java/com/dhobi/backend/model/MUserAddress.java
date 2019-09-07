package com.dhobi.backend.model;

public class MUserAddress {

    String flatnoOrStreetNo;
    String locality;
    String city;
    String pincode;

    public String getFlatnoOrStreetNo() {
        return flatnoOrStreetNo;
    }

    public void setFlatnoOrStreetNo(String flatnoOrStreetNo) {
        this.flatnoOrStreetNo = flatnoOrStreetNo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
