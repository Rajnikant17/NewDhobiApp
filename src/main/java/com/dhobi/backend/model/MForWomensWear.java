package com.dhobi.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
public class MForWomensWear {
    private   String itemId;
    private   String WomensWearimageurl;
    private   String WomensWeartitle;
    private   String Price;
    private  String basicdetails;
    private List<MForWomensWearQuestion> womensWearQuestionList;
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getWomensWearimageurl() {
        return WomensWearimageurl;
    }

    public void setWomensWearimageurl(String womensWearimageurl) {
        WomensWearimageurl = womensWearimageurl;
    }

    public String getWomensWeartitle() {
        return WomensWeartitle;
    }

    public void setWomensWeartitle(String womensWeartitle) {
        WomensWeartitle = womensWeartitle;
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

    public List<MForWomensWearQuestion> getWomensWearQuestionList() {
        return womensWearQuestionList;
    }

    public void setWomensWearQuestionList(List<MForWomensWearQuestion> womensWearQuestionList) {
        this.womensWearQuestionList = womensWearQuestionList;
    }

}
