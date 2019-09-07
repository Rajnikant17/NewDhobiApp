package com.dhobi.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
public class MForMensWear {
    private   String itemId;
    private   String MensWearimageurl;
   private   String MensWeartitle;
    private String Price;
    private  String basicdetails;
    private List<MMensWearQuestion> mensWearQuestionList;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getMensWearimageurl() {
        return MensWearimageurl;
    }

    public void setMensWearimageurl(String mensWearimageurl) {
        MensWearimageurl = mensWearimageurl;
    }

    public String getMensWeartitle() {
        return MensWeartitle;
    }

    public void setMensWeartitle(String mensWeartitle) {
        MensWeartitle = mensWeartitle;
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

    public List<MMensWearQuestion> getMensWearQuestionList() {
        return mensWearQuestionList;
    }

    public void setMensWearQuestionList(List<MMensWearQuestion> mensWearQuestionList) {
        this.mensWearQuestionList = mensWearQuestionList;
    }
}
