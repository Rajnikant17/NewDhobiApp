package com.dhobi.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "DashBoard_Collection")
public class MDashBoard {
    @Id
    String        id;
    String menstitle;
    String mens_imageur;
    String womenstitle;
    String womens_imageur;
    String otherstitle;
    String othersimageur;
    List<MForDashBoardViewpager> mForDashBoardViewpagerlist;
    public List<MForDashBoardViewpager> getmForDashBoardViewpagerlist() {
        return mForDashBoardViewpagerlist;
    }

    public void setmForDashBoardViewpagerlist(List<MForDashBoardViewpager> mForDashBoardViewpagerlist) {
        this.mForDashBoardViewpagerlist = mForDashBoardViewpagerlist;
    }

    public String getOthersimageur() {
        return othersimageur;
    }

    public void setOthersimageur(String othersimageur) {
        this.othersimageur = othersimageur;
    }

    public String getOtherstitle() {
        return otherstitle;
    }

    public void setOtherstitle(String otherstitle) {
        this.otherstitle = otherstitle;
    }

    public String getWomens_imageur() {
        return womens_imageur;
    }

    public void setWomens_imageur(String womens_imageur) {
        this.womens_imageur = womens_imageur;
    }

    public String getWomenstitle() {
        return womenstitle;
    }

    public void setWomenstitle(String womenstitle) {
        this.womenstitle = womenstitle;
    }

    public String getMens_imageur() {
        return mens_imageur;
    }

    public void setMens_imageur(String mens_imageur) {
        this.mens_imageur = mens_imageur;
    }

    public String getMenstitle() {
        return menstitle;
    }

    public void setMenstitle(String menstitle) {
        this.menstitle = menstitle;
    }

  /*  public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    } */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
