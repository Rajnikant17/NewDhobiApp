package com.dhobi.backend.model;

import java.util.List;

public class MResponseAddress {
   private int code;
    private List<String> addresslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getAddresslist() {
        return addresslist;
    }

    public void setAddresslist(List<String> addresslist) {
        this.addresslist = addresslist;
    }
    /* int code;
    List<MUserAddress> mUserAddressList;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<MUserAddress> getmUserAddressList() {
        return mUserAddressList;
    }

    public void setmUserAddressList(List<MUserAddress> mUserAddressList) {
        this.mUserAddressList = mUserAddressList;
    } */
}
