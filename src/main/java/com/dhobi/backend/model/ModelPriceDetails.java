package com.dhobi.backend.model;

public class ModelPriceDetails {
    String normalCleanPrice;

    String normalCleanDiscountedPrice;

    String dryCleanPrice;

    String dryCleanDiscountedPrice;

    String normalIronPrice;

    String steamIronPrice;

    public String getNormalCleanPrice() {
        return normalCleanPrice;
    }

    public void setNormalCleanPrice(String normalCleanPrice) {
        this.normalCleanPrice = normalCleanPrice;
    }

    public String getNormalCleanDiscountedPrice() {
        return normalCleanDiscountedPrice;
    }

    public void setNormalCleanDiscountedPrice(String normalCleanDiscountedPrice) {
        this.normalCleanDiscountedPrice = normalCleanDiscountedPrice;
    }

    public String getDryCleanPrice() {
        return dryCleanPrice;
    }

    public void setDryCleanPrice(String dryCleanPrice) {
        this.dryCleanPrice = dryCleanPrice;
    }

    public String getDryCleanDiscountedPrice() {
        return dryCleanDiscountedPrice;
    }

    public void setDryCleanDiscountedPrice(String dryCleanDiscountedPrice) {
        this.dryCleanDiscountedPrice = dryCleanDiscountedPrice;
    }

    public String getNormalIronPrice() {
        return normalIronPrice;
    }

    public void setNormalIronPrice(String normalIronPrice) {
        this.normalIronPrice = normalIronPrice;
    }

    public String getSteamIronPrice() {
        return steamIronPrice;
    }

    public void setSteamIronPrice(String steamIronPrice) {
        this.steamIronPrice = steamIronPrice;
    }
}
