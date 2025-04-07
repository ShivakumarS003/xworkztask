package com.xworkz.steelapp.steel;

public class Steel {

    private int steelId;

    private String brandName;

    private String grade;

    private double weight;

    private double pricePerKg;

    private String type;

    private String origin;

    public void setSteelId(int steelId){
        this.steelId = steelId;
    }
    public int getSteelId() {
        return steelId;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }
    public String getBrandName() {
        return brandName;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }
    public double getPricePerKg(){
        return pricePerKg;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getOrigin() {
        return origin;
    }
}
