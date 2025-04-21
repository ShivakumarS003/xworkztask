package com.xworkz.methodOverriding.cloths;

import com.xworkz.methodOverriding.cloths.cloth.Cloth;
import com.xworkz.methodOverriding.cloths.shirt.Shirt;

public class ShirtRunner {
    public static void main(String[] args) {
        Cloth cloth = new Cloth();
        cloth.wear();
        cloth.wash();
        cloth.fold();
        cloth.iron();
        cloth.store();

        Cloth cloth1 = new Shirt();
        cloth1.wear();
        cloth1.wash();
        cloth1.fold();
        cloth1.iron();
        cloth1.store();

        Shirt shirt = new Shirt();
        shirt.wear();
        shirt.wash();
        shirt.fold();
        shirt.iron();
        shirt.store();
    }
}
