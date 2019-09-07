package com.dhobi.backend.model;

import java.util.List;

public class MResponseDataOrderHistory {

    String orderid;
    String bookingdate;
    List<MUserBookedItem> mUserBookedItemlist;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }

    public List<MUserBookedItem> getmUserBookedItemlist() {
        return mUserBookedItemlist;
    }

    public void setmUserBookedItemlist(List<MUserBookedItem> mUserBookedItemlist) {
        this.mUserBookedItemlist = mUserBookedItemlist;
    }
}
