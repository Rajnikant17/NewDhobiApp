package com.dhobi.backend.model;

import com.dhobi.backend.Repository.CityListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicesCityList {
    @Autowired
    CityListRepository cityListRepository;
    public MCityList servicesCityList()
    {
        MCityList mCityList=new MCityList();
        mCityList.setmDataCityListList(cityListRepository.findAll());
        return mCityList;

    }
}
