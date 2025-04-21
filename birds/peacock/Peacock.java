package com.xworkz.methodOverriding.birds.peacock;

import com.xworkz.methodOverriding.birds.bird.Bird;

public class Peacock extends Bird {
    @Override
    public void fly() {
        System.out.println("Parrot: Flying in garden");
    }

    @Override
    public void sing() {
        System.out.println("Parrot: Mimicking human voice");
    }

    @Override
    public void buildNest() {
        System.out.println("Parrot: Nesting in trees");
    }

    @Override
    public void layEggs() {
        System.out.println("Parrot: Laying white eggs");
    }

    @Override
    public void eat() {
        System.out.println("Parrot: Eating fruits");
    }
}
