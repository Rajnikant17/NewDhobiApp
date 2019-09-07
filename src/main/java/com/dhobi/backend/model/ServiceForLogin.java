package com.dhobi.backend.model;

import com.dhobi.backend.Repository.Registrationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceForLogin {
   @Autowired
    Registrationrepository registrationrepository;

    public MLoginResponse serviceforlogin(MLogin mLogin)
    {
        MLoginResponse mLogiResponse=new MLoginResponse();
       MRegistration mRegistration  = registrationrepository.findByMobileNoAndPassword(mLogin.getMobileno(),mLogin.getPassword(),1);
       if(mRegistration != null)
       {
           mLogiResponse.setCode(200);
           mLogiResponse.setBool(true);
           mLogiResponse.setMsg("Successfully Loged in");
           return mLogiResponse;
       }
       else
       {
           mLogiResponse.setCode(500);
           mLogiResponse.setBool(false);
           mLogiResponse.setMsg("Wrong MobileNo or Password");
           return mLogiResponse;
       }

    }
}
