package com.dhobi.backend.Repository;

import com.dhobi.backend.model.MMerchantList;
import com.dhobi.backend.model.ModelForSavingOtp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MerchantListRepository  extends MongoRepository<MMerchantList,String> {
    @Query("{$and:[{ 'cityId':?0},{ 'localityId':?1}]}")
    public MMerchantList findMerchantByCityAndLocality(int cityId, int localityId);
}
