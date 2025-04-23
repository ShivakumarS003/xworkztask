package com.xworkz.toString.appliances;

public class AppliancesDto {
    private int applianceId;
    private String applianceName;
    private String brand;
    private double price;
    private int warrantyPeriod;

    public int getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(int applianceId) {
        this.applianceId = applianceId;
    }

    public String getApplianceName() {
        return applianceName;
    }

    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "AppliancesDto :-" +
                "\nAppliance ID = " + this.applianceId +
                "\nAppliance Name = " + this.applianceName +
                "\nBrand = " + this.brand +
                "\nPrice = " + this.price +
                "\nWarranty Period = " + this.warrantyPeriod + " years";
    }
}
