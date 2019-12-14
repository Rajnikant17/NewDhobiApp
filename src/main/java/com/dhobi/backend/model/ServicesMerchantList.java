package com.dhobi.backend.model;

import com.dhobi.backend.Repository.MerchantListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicesMerchantList {
   @Autowired
    MerchantListRepository merchantListRepository;
   public MMerchantList servicesMerchantList(MCityandLocality mCityandLocality)
   {
       //5df4ff504fc16d1c61a57fb1
      // return merchantListRepository.findById(mCityandLocality.getId());
      return merchantListRepository.findMerchantByCityAndLocality(mCityandLocality.getCityId(),mCityandLocality.getLocalitytId());
   }
}
