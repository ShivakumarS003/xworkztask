package com.xworkz.methodOverriding.weapons.weapon;

public class Weapon {
    public void load() {
        System.out.println("Weapon: Loading ammunition");
    }

    public void aim() {
        System.out.println("Weapon: Aiming at the target");
    }

    public void fire() {
        System.out.println("Weapon: Firing the weapon");
    }

    public void reload() {
        System.out.println("Weapon: Reloading after use");
    }

    public void maintain() {
        System.out.println("Weapon: Performing regular maintenance");
    }
}
