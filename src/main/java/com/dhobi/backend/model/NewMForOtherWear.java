package com.dhobi.backend.model;

public class NewMForOtherWear {
    private   String itemId;
    private   String  othersimageurl;
    private String othersWeartitle;
    private ModelPriceDetails priceDetails;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOthersimageurl() {
        return othersimageurl;
    }

    public void setOthersimageurl(String othersimageurl) {
        this.othersimageurl = othersimageurl;
    }

    public String getOthersWeartitle() {
        return othersWeartitle;
    }

    public void setOthersWeartitle(String othersWeartitle) {
        this.othersWeartitle = othersWeartitle;
    }

    public ModelPriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(ModelPriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }
}
