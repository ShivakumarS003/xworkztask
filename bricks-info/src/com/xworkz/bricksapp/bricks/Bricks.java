package com.xworkz.bricksapp.bricks;

public class Bricks {

    private int bricksId;
    private String type;
    private String color;
    private String size;
    private double weight;
    private int quantity;
    private double price;

    public void setBricksId(int bricksId) {
        this.bricksId = bricksId;
    }

    public int getBricksId() {
        return bricksId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
