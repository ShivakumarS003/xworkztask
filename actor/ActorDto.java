package com.xworkz.toString.actor;

public class ActorDto {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String movie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "ActorDto :-" +
                "\nID = " + this.id +
                "\nName = " + this.name +
                "\nAge = " + this.age +
                "\nGender = " + this.gender +
                "\nMovie = " + this.movie;
    }
}
