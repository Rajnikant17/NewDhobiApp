package com.dhobi.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Document(collection = "PaymentDetailsTable")
public class MPayment  {
    @Id
    String id;
    String orderid;
    String totalItem;
    String totalPrice;
    String mobileno;
    String paymentId;
    Boolean onlinePaymentMode;
    String deliverytime;
    String bookingtime;
    List<MUserBookedItem> mUserBookedItemlist;
    String UserAddress;

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(String totalItem) {
        this.totalItem = totalItem;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Boolean getOnlinePaymentMode() {
        return onlinePaymentMode;
    }

    public void setOnlinePaymentMode(Boolean onlinePaymentMode) {
        this.onlinePaymentMode = onlinePaymentMode;
    }

    public String getDeliverytime() {
        return deliverytime;
    }


    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getBookingtime() {
        return bookingtime;
    }

    public void setBookingtime(String bookingtime) {
        this.bookingtime = bookingtime;
    }

    public List<MUserBookedItem> getmUserBookedItemlist() {
        return mUserBookedItemlist;
    }

    public void setmUserBookedItemlist(List<MUserBookedItem> mUserBookedItemlist) {
        this.mUserBookedItemlist = mUserBookedItemlist;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }
}
