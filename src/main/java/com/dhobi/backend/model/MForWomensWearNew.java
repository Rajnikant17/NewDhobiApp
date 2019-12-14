package com.dhobi.backend.model;

public class MForWomensWearNew {
    private   String itemId;
    private   String womenWearimageurl;
    private   String womenWeartitle;
    private ModelPriceDetails priceDetails;
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getWomenWearimageurl() {
        return womenWearimageurl;
    }

    public void setWomenWearimageurl(String womenWearimageurl) {
        this.womenWearimageurl = womenWearimageurl;
    }

    public String getWomenWeartitle() {
        return womenWeartitle;
    }

    public void setWomenWeartitle(String womenWeartitle) {
        this.womenWeartitle = womenWeartitle;
    }

    public ModelPriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(ModelPriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }
}
