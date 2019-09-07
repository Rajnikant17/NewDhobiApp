package com.dhobi.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "Homepage_Document")
public class MDataHomePage {
    @Id
    private    String id;
    private    List<MForMensWear>   mensWearList;
    private   List<MForWomensWear> womensWearList;
    private   List<MForOtherWear>  otherWearList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MForMensWear> getMensWearList() {
        return mensWearList;
    }

    public void setMensWearList(List<MForMensWear> mensWearList) {
        this.mensWearList = mensWearList;
    }

    public List<MForWomensWear> getWomensWearList() {
        return womensWearList;
    }

    public void setWomensWearList(List<MForWomensWear> womensWearList) {
        this.womensWearList = womensWearList;
    }

    public List<MForOtherWear> getOtherWearList() {
        return otherWearList;
    }

    public void setOtherWearList(List<MForOtherWear> otherWearList) {
        this.otherWearList = otherWearList;
    }
}
