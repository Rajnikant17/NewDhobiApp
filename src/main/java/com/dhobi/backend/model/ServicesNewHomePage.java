package com.dhobi.backend.model;

import com.dhobi.backend.Repository.NewHomePageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
public class ServicesNewHomePage {
 @Autowired
    NewHomePageRepository newHomePageRepository;
    public NewMHomepage servicesNewHomePage(MPartnerId mPartnerId)
    {
        NewMHomepage newMHomepage=new NewMHomepage();
        NewMDataHomePage newMDataHomePage= newHomePageRepository.partnersid(mPartnerId.getPartnersid());
        if(newMDataHomePage!=null)
        {
            newMHomepage.setCode(200);
            newMHomepage.setmDataHomePage(newMDataHomePage);
        }
        else
        {
            newMHomepage.setCode(500);
            newMHomepage.setmDataHomePage(newMDataHomePage);

        }

       return newMHomepage;
    }

}
