package com.xworkz.toString.biscuit;

public class BiscuitDto {
    private String brandName;
    private String flavor;
    private int quantity;
    private double price;
    private String packagingType;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    @Override
    public String toString() {
        return "BiscuitDto :-" +
                "\nBrand Name = " + this.brandName +
                "\nFlavor = " + this.flavor +
                "\nQuantity = " + this.quantity +
                "\nPrice = " + this.price +
                "\nPackaging Type = " + this.packagingType;
    }
}
