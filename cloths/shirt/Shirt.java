package com.xworkz.methodOverriding.cloths.shirt;

import com.xworkz.methodOverriding.cloths.cloth.Cloth;

public class Shirt extends Cloth {
    @Override
    public void wear() {
        System.out.println("Shirt: Wearing formal shirt");
    }

    @Override
    public void wash() {
        System.out.println("Shirt: Washed in washing machine");
    }

    @Override
    public void fold() {
        System.out.println("Shirt: Neatly folded for rack");
    }

    @Override
    public void iron() {
        System.out.println("Shirt: Ironed with steam iron");
    }

    @Override
    public void store() {
        System.out.println("Shirt: Hanging in wardrobe");
    }
}
