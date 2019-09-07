package com.dhobi.backend.model;

import com.dhobi.backend.Repository.HomePageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ServicesHomepage {
    @Autowired
    HomePageRepository homePageRepository;
    public MHomepage servicesHomepage()
    {
    MHomepage mHomepage=new MHomepage();
    MDataHomePage mDataHomePage=homePageRepository.findAll().get(0);
    if(mDataHomePage != null)
    {
        mHomepage.setCode(200);
        mHomepage.setmDataHomePage(mDataHomePage);
        return mHomepage;
    }
    else
    {
        mHomepage.setCode(500);
        mHomepage.setmDataHomePage(mDataHomePage);
        return mHomepage;
    }
    }
}
