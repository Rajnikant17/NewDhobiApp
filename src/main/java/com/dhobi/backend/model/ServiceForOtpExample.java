package com.dhobi.backend.model;

import com.dhobi.backend.Repository.MongoConfiguration;
import com.dhobi.backend.Repository.OtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class ServiceForOtpExample {

    @Autowired
    OtpRepository otpRepository;
    @Autowired
    MongoTemplate mongoTemplate;
    public ModelForSavingOtp saveotp(ModelForSavingOtp modelForSavingOtp)
    {
        return otpRepository.save(modelForSavingOtp)  ;
    }

    public ModelForSavingOtp update(String mobile)
    {
       // 5d3ae20174148f3721b5649f
                ModelForSavingOtp modelForSavingOtp = mongoTemplate.findOne(
                Query.query(Criteria.where("mobileno").is("13579")), ModelForSavingOtp.class);
        modelForSavingOtp.setOtp("6666");
        return otpRepository.save(modelForSavingOtp);
    }

}
