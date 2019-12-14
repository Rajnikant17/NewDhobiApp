package com.dhobi.backend.model;

public class NewMForWomensWear {
    private   String itemId;
    private   String womensWearimageurl;
    private   String WomensWeartitle;
    private ModelPriceDetails priceDetails;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getWomensWearimageurl() {
        return womensWearimageurl;
    }

    public void setWomensWearimageurl(String womensWearimageurl) {
        this.womensWearimageurl = womensWearimageurl;
    }

    public String getWomensWeartitle() {
        return WomensWeartitle;
    }

    public void setWomensWeartitle(String womensWeartitle) {
        WomensWeartitle = womensWeartitle;
    }

    public ModelPriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(ModelPriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }
}
