package com.dhobi.backend.model;

import java.util.Optional;

public class MHomepage {
   private int code;
   private MDataHomePage mDataHomePage;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MDataHomePage getmDataHomePage() {
        return mDataHomePage;
    }

    public void setmDataHomePage(MDataHomePage mDataHomePage) {
        this.mDataHomePage = mDataHomePage;
    }
}
