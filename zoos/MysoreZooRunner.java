package com.xworkz.methodOverriding.zoos;

import com.xworkz.methodOverriding.zoos.mysorezoo.MysoreZoo;
import com.xworkz.methodOverriding.zoos.zoo.Zoo;

public class MysoreZooRunner {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.openGates();
        zoo.feedAnimals();
        zoo.cleanCages();
        zoo.conductShows();
        zoo.monitorHealth();

        Zoo zoo1 = new MysoreZoo();
        zoo1.openGates();
        zoo1.feedAnimals();
        zoo1.cleanCages();
        zoo1.conductShows();
        zoo1.monitorHealth();

        MysoreZoo cityZoo = new MysoreZoo();
        cityZoo.openGates();
        cityZoo.feedAnimals();
        cityZoo.cleanCages();
        cityZoo.conductShows();
        cityZoo.monitorHealth();
    }
}
