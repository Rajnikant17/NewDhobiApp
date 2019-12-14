package com.dhobi.backend.model;

import java.util.List;

public class MDataMerchant {
    String      partnersId;
    int       priority;
    int       cityId;
    int       localityId;
    String   partnersName;
    String   partnersAddress;
    Double   avgNormalPrice;
    Double   avgDryLaudaryPrice;
    String   partnersNumber;

    public String getPartnersId() {
        return partnersId;
    }

    public void setPartnersId(String partnersId) {
        this.partnersId = partnersId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getPartnersName() {
        return partnersName;
    }

    public int getLocalityId() {
        return localityId;
    }

    public void setLocalityId(int localityId) {
        this.localityId = localityId;
    }

    public void setPartnersName(String partnersName) {
        this.partnersName = partnersName;
    }

    public String getPartnersAddress() {
        return partnersAddress;
    }

    public void setPartnersAddress(String partnersAddress) {
        this.partnersAddress = partnersAddress;
    }

    public Double getAvgNormalPrice() {
        return avgNormalPrice;
    }

    public void setAvgNormalPrice(Double avgNormalPrice) {
        this.avgNormalPrice = avgNormalPrice;
    }

    public Double getAvgDryLaudaryPrice() {
        return avgDryLaudaryPrice;
    }

    public void setAvgDryLaudaryPrice(Double avgDryLaudaryPrice) {
        this.avgDryLaudaryPrice = avgDryLaudaryPrice;
    }

    public String getPartnersNumber() {
        return partnersNumber;
    }

    public void setPartnersNumber(String partnersNumber) {
        this.partnersNumber = partnersNumber;
    }
}
