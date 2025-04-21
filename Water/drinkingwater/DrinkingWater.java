package com.xworkz.methodOverriding.Water.drinkingwater;

import com.xworkz.methodOverriding.Water.water.Water;

public class DrinkingWater extends Water {
    @Override
    public void flow() {
        System.out.println("DrinkingWater: Flowing through purification systems");
    }

    @Override
    public void evaporate() {
        System.out.println("DrinkingWater: Loss minimized during storage");
    }

    @Override
    public void freeze() {
        System.out.println("DrinkingWater: Stored as ice in coolers");
    }

    @Override
    public void boil() {
        System.out.println("DrinkingWater: Boiled to kill bacteria");
    }

    @Override
    public void sustainLife() {
        System.out.println("DrinkingWater: Hydrating people and animals");
    }
}
