package com.dhobi.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
public class MForOtherWear {
    private   String itemId;
    private   String Othersimageurl;
    private String OthersWeartitle;
    private String Price;
    private  String basicdetails;
    private   List<MForOtherWearQuestion> mForOtherWearQuestionList;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOthersimageurl() {
        return Othersimageurl;
    }

    public void setOthersimageurl(String othersimageurl) {
        Othersimageurl = othersimageurl;
    }

    public String getOthersWeartitle() {
        return OthersWeartitle;
    }

    public void setOthersWeartitle(String othersWeartitle) {
        OthersWeartitle = othersWeartitle;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getBasicdetails() {
        return basicdetails;
    }

    public void setBasicdetails(String basicdetails) {
        this.basicdetails = basicdetails;
    }

    public List<MForOtherWearQuestion> getmForOtherWearQuestionList() {
        return mForOtherWearQuestionList;
    }

    public void setmForOtherWearQuestionList(List<MForOtherWearQuestion> mForOtherWearQuestionList) {
        this.mForOtherWearQuestionList = mForOtherWearQuestionList;
    }

}
