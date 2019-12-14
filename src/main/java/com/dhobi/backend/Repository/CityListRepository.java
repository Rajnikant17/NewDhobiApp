package com.dhobi.backend.Repository;

import com.dhobi.backend.model.MCityList;
import com.dhobi.backend.model.MDataCityList;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CityListRepository extends MongoRepository<MDataCityList,String> {
}
