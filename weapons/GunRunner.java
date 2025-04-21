package com.xworkz.methodOverriding.weapons;

import com.xworkz.methodOverriding.weapons.gun.Gun;
import com.xworkz.methodOverriding.weapons.weapon.Weapon;

public class GunRunner {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.load();
        weapon.aim();
        weapon.fire();
        weapon.reload();
        weapon.maintain();

        Weapon weapon1 = new Gun();
        weapon1.load();
        weapon1.aim();
        weapon1.fire();
        weapon1.reload();
        weapon1.maintain();

        Gun gun = new Gun();
        gun.load();
        gun.aim();
        gun.fire();
        gun.reload();
        gun.maintain();
    }
}
