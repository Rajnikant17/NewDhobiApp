package com.dhobi.backend.model;

import com.dhobi.backend.Repository.OtpRepository;
import com.dhobi.backend.Repository.Registrationrepository;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ServiceForLogin {
    @Autowired
    Registrationrepository registrationrepository;
    @Autowired
    OtpRepository  otpRepository;
    public MLoginResponse serviceforlogin(MLogin mLogin)
    {
        MLoginResponse mLogiResponse=new MLoginResponse();
       MRegistration mRegistration  = registrationrepository.findByMobileNoAndPassword(mLogin.getMobileno(),mLogin.getPassword(),1);
       if(mRegistration != null)
       {
           sendOtP(mLogin.getMobileno());
//           mLogiResponse.setCode(200);
//           mLogiResponse.setBool(true);
//           mLogiResponse.setMsg("Successfully Loged in");
  //         return mLogiResponse;
           return sendOtP(mLogin.getMobileno());
       }
       else
       {
           mLogiResponse.setCode(500);
           mLogiResponse.setBool(false);
           mLogiResponse.setMsg("Wrong MobileNo or Password");
           return mLogiResponse;
       }

    }

    public MLoginResponse sendOtP(String mobileno)
    {
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[4];
        for (int i = 0; i < 4; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        String randomotp = (String.valueOf(otp));
        // String randomotp = "5656";
        //  611332

        try {
            HttpResponse<String> response = Unirest.post("https://control.msg91.com/api/sendotp.php")
                    .queryString("otp", randomotp)
                    .queryString("otp_length", 4)
                    .queryString("sender", "Dhobic")
                    .queryString("mobile", mobileno)
                    .queryString("authkey", "218787AwB06Z8f5LF5b154944")
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        //"917898130226"
        //  "?email=&template=&otp=otp1&otp_length=6&otp_expiry=&sender=%24senderid&message=Hi Rajni&mobile=918372965282&authkey=218787AwB06Z8f5LF5b154944")
        // .asString();
        // dataRegistrationResponse.setMessage(response.);
        ModelForSavingOtp modelForSavingOtp1=otpRepository.findLastSendOtpDocument(mobileno,1);
        if(modelForSavingOtp1 != null)
        {
            modelForSavingOtp1.setStatus(0);
            otpRepository.save(modelForSavingOtp1);
        }
        ModelForSavingOtp modelForSavingOtp=new ModelForSavingOtp();
        modelForSavingOtp.setMobileno(mobileno);
        modelForSavingOtp.setOtp(randomotp);
        modelForSavingOtp.setStatus(1);
        otpRepository.save(modelForSavingOtp);
        MLoginResponse mLogiResponse=new MLoginResponse();
        mLogiResponse.setCode(200);
        mLogiResponse.setBool(true);
        mLogiResponse.setMsg("OTP  Sent.");
        return mLogiResponse;
    }
}
