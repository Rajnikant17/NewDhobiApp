package com.dhobi.backend.model;


import java.util.List;

public class MResponseOrderHistory {
    int code;
    List<MResponseDataOrderHistory> mResponseDataOrderHistoryList;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<MResponseDataOrderHistory> getmResponseDataOrderHistoryList() {
        return mResponseDataOrderHistoryList;
    }

    public void setmResponseDataOrderHistoryList(List<MResponseDataOrderHistory> mResponseDataOrderHistoryList) {
        this.mResponseDataOrderHistoryList = mResponseDataOrderHistoryList;
    }
}
