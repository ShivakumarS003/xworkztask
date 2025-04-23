package com.xworkz.toString.colddrink;

public class ColddrinkDto {
    private String brandName;
    private String flavor;
    private int quantityInML;
    private double price;
    private boolean isSugarFree;

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

    public int getQuantityInML() {
        return quantityInML;
    }

    public void setQuantityInML(int quantityInML) {
        this.quantityInML = quantityInML;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSugarFree() {
        return isSugarFree;
    }

    public void setSugarFree(boolean isSugarFree) {
        this.isSugarFree = isSugarFree;
    }

    @Override
    public String toString() {
        return "ColddrinkDto :-" +
                "\nBrand Name = " + this.brandName +
                "\nFlavor = " + this.flavor +
                "\nQuantity = " + this.quantityInML + " ml" +
                "\nPrice = " + this.price +
                "\nSugar Free = " + (this.isSugarFree ? "Yes" : "No");
    }
}
