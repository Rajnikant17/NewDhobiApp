package com.dhobi.backend.model;

import com.dhobi.backend.Repository.PaymentSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicePaymentSummary {

    @Autowired
    PaymentSummaryRepository paymentSummaryRepository;
     public MResponsePayment serviceForpaymentSummary(MPayment mPayment)

     {
         mPayment.setOrderid("#Dcart"+(String.valueOf(paymentSummaryRepository.count())));
         paymentSummaryRepository.save(mPayment) ;
         MResponsePayment mResponsePayment=new MResponsePayment();
         mResponsePayment.setCode(200);
         mResponsePayment.setMsg("Payment made Successfully");
         return mResponsePayment;
     }
}
