package com.dhobi.backend.model;

import com.dhobi.backend.Repository.Registrationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class ServiceUpdateProfile {
    @Autowired
    Registrationrepository registrationrepository;
    @Autowired
    MongoTemplate mongoTemplate;
    public MResponseProfile update(MProfileData mProfileData)
    {
        // 5d3ae20174148f3721b5649f
      //  MRegistration mRegistration=registrationrepository.findBymobilenoAndStatus
        MRegistration mRegistration = mongoTemplate.findOne(
                Query.query(Criteria.where("mobileno").is(mProfileData.getMobileno())), MRegistration.class);
        mRegistration.username=mProfileData.getUsername();
        mRegistration=registrationrepository.save(mRegistration);
        MResponseProfile mResponseProfile=new MResponseProfile();
        mResponseProfile.setCode(200);
        mResponseProfile.setMobileno(mRegistration.mobileno);
        mResponseProfile.setUsername(mRegistration.username);
        return mResponseProfile;
    }
}
