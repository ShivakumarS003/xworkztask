package com.xworkz.majjigeapp.majjige;

public class Majjige {

    private int id;
    private String brand;
    private String flavor;
    private String quantity;
    private double fatContent;
    private double price;
    private boolean isSalted;

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsSalted(boolean isSalted) {
        this.isSalted = isSalted;
    }

    public int getId() {
        return this.id;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public double getFatContent() {
        return this.fatContent;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getIsSalted() {
        return this.isSalted;
    }
}
