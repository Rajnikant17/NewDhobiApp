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
      MMerchantList mMerchantList=merchantListRepository.findMerchantByCityAndLocality(mCityandLocality.getCityId(),mCityandLocality.getLocalitytId());
      if(mMerchantList!=null)
      {
         return mMerchantList;
      }
      else
      {
         mMerchantList=new MMerchantList();
         mMerchantList.setCityId(mCityandLocality.getCityId());
         mMerchantList.setLocalityId(mCityandLocality.getLocalitytId());
         return mMerchantList;
      }
   }
}
