package com.xworkz.methodOverriding.weapons.gun;

import com.xworkz.methodOverriding.weapons.weapon.Weapon;

public class Gun extends Weapon {
    @Override
    public void load() {
        System.out.println("Gun: Inserting bullets into the magazine");
    }

    @Override
    public void aim() {
        System.out.println("Gun: Using sight to aim accurately");
    }

    @Override
    public void fire() {
        System.out.println("Gun: Pulling the trigger to fire bullets");
    }

    @Override
    public void reload() {
        System.out.println("Gun: Ejecting empty magazine and inserting a new one");
    }

    @Override
    public void maintain() {
        System.out.println("Gun: Cleaning barrel and lubricating parts");
    }
}
