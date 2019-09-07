package com.dhobi.backend.model;

import com.dhobi.backend.Repository.PaymentSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServicesOrderHistory {

    @Autowired
    PaymentSummaryRepository paymentSummaryRepository;
    public MResponseOrderHistory serviceforOrderHistory(MMobileNo mMobileNo)
    {
        List<MPayment> mPaymentList = paymentSummaryRepository.findUserOrderDetails(mMobileNo.getMobileno());
        MResponseOrderHistory mResponseOrderHistory=new MResponseOrderHistory();
        List<MResponseDataOrderHistory> mResponseDataOrderHistoryList = new ArrayList<>();
        if(mPaymentList !=null || mPaymentList.size() != 0) {

            for (MPayment mPayment : mPaymentList) {
                MResponseDataOrderHistory mResponseDataOrderHistory = new MResponseDataOrderHistory();
                mResponseDataOrderHistory.setOrderid(mPayment.getOrderid());
                mResponseDataOrderHistory.setBookingdate(mPayment.getBookingtime());
                mResponseDataOrderHistory.setmUserBookedItemlist(mPayment.getmUserBookedItemlist());
                mResponseDataOrderHistoryList.add(mResponseDataOrderHistory);
            }
            mResponseOrderHistory.setCode(200);
            mResponseOrderHistory.setmResponseDataOrderHistoryList(mResponseDataOrderHistoryList);
        }

        else
        {
            mResponseOrderHistory.setCode(500);
            mResponseOrderHistory.setmResponseDataOrderHistoryList(mResponseDataOrderHistoryList);
        }



        return mResponseOrderHistory;
    }
}
