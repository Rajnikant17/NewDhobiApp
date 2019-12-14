package com.dhobi.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "MerchantListTable")
public class MMerchantList {
    @Id
    String id;
    int cityId;
    int localityId;
    List<MDataMerchant> mDataMerchants;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getLocalityId() {
        return localityId;
    }

    public void setLocalityId(int localityId) {
        this.localityId = localityId;
    }

    public List<MDataMerchant> getmDataMerchants() {
        return mDataMerchants;
    }

    public void setmDataMerchants(List<MDataMerchant> mDataMerchants) {
        this.mDataMerchants = mDataMerchants;
    }

}
