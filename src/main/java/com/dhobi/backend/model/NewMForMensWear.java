package com.dhobi.backend.model;

public class NewMForMensWear {
    private   String itemId;
    private   String mensWearimageurl;
    private   String mensWeartitle;
    private ModelPriceDetails priceDetails;
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    public String getMensWearimageurl() {
        return mensWearimageurl;
    }
    public void setMensWearimageurl(String mensWearimageurl) {
        this.mensWearimageurl = mensWearimageurl;
    }
    public String getMensWeartitle() {
        return mensWeartitle;
    }
    public void setMensWeartitle(String mensWeartitle) {
        this.mensWeartitle = mensWeartitle;
    }
    public ModelPriceDetails getPriceDetails() {
        return priceDetails;
    }
    public void setPriceDetails(ModelPriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }
}
