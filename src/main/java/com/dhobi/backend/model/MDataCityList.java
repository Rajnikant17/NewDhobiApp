package com.dhobi.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "CityListTable")
public class MDataCityList {
  @Id
  private  int cityId;
  private String cityName;
  private List<MLocality> mLocalitList;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<MLocality> getmLocalitList() {
        return mLocalitList;
    }

    public void setmLocalitList(List<MLocality> mLocalitList) {
        this.mLocalitList = mLocalitList;
    }
}
