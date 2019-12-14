package com.dhobi.backend.model;

import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class MCityList {
    List<MDataCityList> mDataCityListList;

    public List<MDataCityList> getmDataCityListList() {
        return mDataCityListList;
    }

    public void setmDataCityListList(List<MDataCityList> mDataCityListList) {
        this.mDataCityListList = mDataCityListList;
    }
}
