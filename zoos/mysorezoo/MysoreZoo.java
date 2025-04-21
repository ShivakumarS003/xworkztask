package com.xworkz.methodOverriding.zoos.mysorezoo;

import com.xworkz.methodOverriding.zoos.zoo.Zoo;

public class MysoreZoo extends Zoo {
    @Override
    public void openGates() {
        System.out.println("CityZoo: Opening at 9 AM sharp for city dwellers");
    }

    @Override
    public void feedAnimals() {
        System.out.println("CityZoo: Using automated feeding systems");
    }

    @Override
    public void cleanCages() {
        System.out.println("CityZoo: Employing cleaning staff for hourly maintenance");
    }

    @Override
    public void conductShows() {
        System.out.println("CityZoo: Organizing weekend educational shows");
    }

    @Override
    public void monitorHealth() {
        System.out.println("CityZoo: Vets conducting daily check-ups");
    }
}
