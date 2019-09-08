package com.dhobi.backend.model;

import com.dhobi.backend.Repository.OtpRepository;
import com.dhobi.backend.Repository.Registrationrepository;
import com.dhobi.backend.utils.Constants;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ServicesForRegistration {
   @Autowired
   Registrationrepository registrationrepository;
    @Autowired
    OtpRepository otpRepository;
    MRegistrationResponse mRegistrationResponse;
    DataRegistrationResponse dataRegistrationResponse;
    public MRegistrationResponse RegistrationMethod(MRegistration mRegistration) throws UnirestException {
        mRegistrationResponse=new MRegistrationResponse();
        dataRegistrationResponse = new DataRegistrationResponse();
        if((registrationrepository.findBymobileno(mRegistration.mobileno) == null) ) {
            return callFunction(mRegistration);
        }
        else if((registrationrepository.findBymobileno(mRegistration.mobileno).registrationStatus==0))
           {
               registrationrepository.delete(registrationrepository.findBymobileno(mRegistration.mobileno));
               return callFunction(mRegistration);
           }
        else
        {
            mRegistrationResponse.setCode(500);
            mRegistrationResponse.setSubcode(500);
            dataRegistrationResponse.setMessage("Already Registered");
            dataRegistrationResponse.setBool(false);
            mRegistrationResponse.setDataRegistrationResponse(dataRegistrationResponse);
            return mRegistrationResponse;
        }
          /* mRegistration.registrationStatus=0;
           registrationrepository.save(mRegistration);
           mRegistrationResponse.setCode(200);
           mRegistrationResponse.setSubcode(200);
           dataRegistrationResponse.setMessage("OTP sent");
           dataRegistrationResponse.setBool(true);
           mRegistrationResponse.setDataRegistrationResponse(dataRegistrationResponse);
           // Using numeric values
           String numbers = "0123456789";
           Random rndm_method = new Random();
           char[] otp = new char[4];
           for (int i = 0; i < 4; i++)
           {
               // Use of charAt() method : to get character value
               // Use of nextInt() as it is scanning the value as int
               otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
           }
          // int randomotp = Integer.parseInt(String.valueOf(otp));
           int randomotp = 56567;

           HttpResponse<String> response = Unirest.post("https://control.msg91.com/api/sendotp.php")
                   .queryString("otp", randomotp)
                   .queryString("otp_length", 4)
                   .queryString("sender", 611332)
                   .queryString("mobile", "917898130226")
                   .queryString("authkey", "218787AwB06Z8f5LF5b154944")
                   .asString();
                 //  "?email=&template=&otp=otp1&otp_length=6&otp_expiry=&sender=%24senderid&message=Hi Rajni&mobile=918372965282&authkey=218787AwB06Z8f5LF5b154944")
                  // .asString();
          // dataRegistrationResponse.setMessage(response.);
           if(otpRepository.findBymobileno(mRegistration.mobileno) != null) {
               ModelForSavingOtp modelForSavingOtp1=otpRepository.findot(mRegistration.mobileno,1);
               modelForSavingOtp1.setStatus(0);
               otpRepository.save(modelForSavingOtp1);

           }
           modelForSavingOtp.setMobileno(mRegistration.mobileno);
           modelForSavingOtp.setOtp(randomotp);
           modelForSavingOtp.setStatus(1);
           otpRepository.save(modelForSavingOtp);
          return mRegistrationResponse; */

    }

    public MRegistrationResponse callFunction(MRegistration mRegistration)

    {
        ModelForSavingOtp modelForSavingOtp=new ModelForSavingOtp();
        mRegistration.registrationStatus=0;
        registrationrepository.save(mRegistration);
        mRegistrationResponse.setCode(200);
        mRegistrationResponse.setSubcode(200);
        dataRegistrationResponse.setMessage("OTP sent");
        dataRegistrationResponse.setBool(true);
        mRegistrationResponse.setDataRegistrationResponse(dataRegistrationResponse);
        // Using numeric values
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[4];
        for (int i = 0; i < 4; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
       // String randomotp = (String.valueOf(otp));
        String randomotp = "56567";

       /* try {
            HttpResponse<String> response = Unirest.post("https://control.msg91.com/api/sendotp.php")
                    .queryString("otp", randomotp)
                    .queryString("otp_length", 4)
                    .queryString("sender", 611332)
                    .queryString("mobile", mRegistration.mobileno)
                    .queryString("authkey", "218787AwB06Z8f5LF5b154944")
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        } */
        //"917898130226"
        //  "?email=&template=&otp=otp1&otp_length=6&otp_expiry=&sender=%24senderid&message=Hi Rajni&mobile=918372965282&authkey=218787AwB06Z8f5LF5b154944")
        // .asString();
        // dataRegistrationResponse.setMessage(response.);
            ModelForSavingOtp modelForSavingOtp1=otpRepository.findLastSendOtpDocument(mRegistration.mobileno,1);
            if(modelForSavingOtp1 != null)
            {
                modelForSavingOtp1.setStatus(0);
                otpRepository.save(modelForSavingOtp1);
            }

        modelForSavingOtp.setMobileno(mRegistration.mobileno);
        modelForSavingOtp.setOtp(randomotp);
        modelForSavingOtp.setStatus(1);
        otpRepository.save(modelForSavingOtp);
        return mRegistrationResponse;
    }


}
