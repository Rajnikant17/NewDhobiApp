package com.dhobi.backend.model;

public class MForCart {
    private String itemId;
    private String itemimageurl;
    private String itemtitle;
    private String netPriceWithDifferentSelectedService;
    private String total_no_item;
    private String totalPrice;
    private Boolean boolNormalCleaning=false;
    private Boolean boolDryCleaning = false;
    private Boolean boolnormalIron = false;
    private Boolean boolsteamIron = false;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemimageurl() {
        return itemimageurl;
    }

    public void setItemimageurl(String itemimageurl) {
        this.itemimageurl = itemimageurl;
    }

    public String getItemtitle() {
        return itemtitle;
    }

    public void setItemtitle(String itemtitle) {
        this.itemtitle = itemtitle;
    }

    public String getNetPriceWithDifferentSelectedService() {
        return netPriceWithDifferentSelectedService;
    }

    public void setNetPriceWithDifferentSelectedService(String netPriceWithDifferentSelectedService) {
        this.netPriceWithDifferentSelectedService = netPriceWithDifferentSelectedService;
    }

    public String getTotal_no_item() {
        return total_no_item;
    }

    public void setTotal_no_item(String total_no_item) {
        this.total_no_item = total_no_item;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getBoolNormalCleaning() {
        return boolNormalCleaning;
    }

    public void setBoolNormalCleaning(Boolean boolNormalCleaning) {
        this.boolNormalCleaning = boolNormalCleaning;
    }

    public Boolean getBoolDryCleaning() {
        return boolDryCleaning;
    }

    public void setBoolDryCleaning(Boolean boolDryCleaning) {
        this.boolDryCleaning = boolDryCleaning;
    }

    public Boolean getBoolnormalIron() {
        return boolnormalIron;
    }

    public void setBoolnormalIron(Boolean boolnormalIron) {
        this.boolnormalIron = boolnormalIron;
    }

    public Boolean getBoolsteamIron() {
        return boolsteamIron;
    }

    public void setBoolsteamIron(Boolean boolsteamIron) {
        this.boolsteamIron = boolsteamIron;
    }
}
