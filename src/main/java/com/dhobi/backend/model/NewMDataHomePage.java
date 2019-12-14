package com.dhobi.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "New_Homepage_Document")
public class NewMDataHomePage {
    @Id
    private    String partnersid;
    private   List<NewMForMensWear> mensWearList;
    private   List<NewMForWomensWear> womensWearList;
    private   List<NewMForOtherWear>  otherWearList;

    public String getPartnersid() {
        return partnersid;
    }

    public void setPartnersid(String partnersid) {
        this.partnersid = partnersid;
    }

    public List<NewMForMensWear> getMensWearList() {
        return mensWearList;
    }

    public void setMensWearList(List<NewMForMensWear> mensWearList) {
        this.mensWearList = mensWearList;
    }

    public List<NewMForWomensWear> getWomensWearList() {
        return womensWearList;
    }

    public void setWomensWearList(List<NewMForWomensWear> womensWearList) {
        this.womensWearList = womensWearList;
    }

    public List<NewMForOtherWear> getOtherWearList() {
        return otherWearList;
    }

    public void setOtherWearList(List<NewMForOtherWear> otherWearList) {
        this.otherWearList = otherWearList;
    }
}
