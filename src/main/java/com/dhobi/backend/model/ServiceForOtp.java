package com.dhobi.backend.model;

import com.dhobi.backend.Repository.OtpRepository;
import com.dhobi.backend.Repository.Registrationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceForOtp {
    @Autowired
    OtpRepository otpRepository;
    @Autowired
    Registrationrepository registrationrepository;

    public MOtpResponse otpResponse(MOtp mOtp) {
        MOtpResponse mOtpResponse = new MOtpResponse();
        //  otpRepository.findBymobileno(mOtp.mobileno).getOtp();
        // if (otpRepository.findBymobileno(mOtp.mobileno) != null) {
           ModelForSavingOtp modelForSavingOtp=otpRepository.findLastSendOtpDocument(mOtp.getMobileno(),1);
           if(modelForSavingOtp !=null && modelForSavingOtp.getOtp().equals(mOtp.otp)) {
                mOtpResponse.setCode(200);
                mOtpResponse.setStatus(true);
                MRegistration mRegistration=registrationrepository.findBymobilenoAndStatus(mOtp.mobileno,0);
                if(mRegistration !=null) {
                    mRegistration.registrationStatus = 1;
                    registrationrepository.save(mRegistration);
                    return mOtpResponse;
                }
                else
                {
                    return mOtpResponse;
                }
            }
            else {
            mOtpResponse.setCode(500);
            mOtpResponse.setStatus(false);
            return mOtpResponse;
        }
    }
}
