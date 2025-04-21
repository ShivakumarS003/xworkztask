package com.xworkz.methodOverriding.Water;

import com.xworkz.methodOverriding.Water.drinkingwater.DrinkingWater;
import com.xworkz.methodOverriding.Water.water.Water;

public class WaterRunner {
    public static void main(String[] args) {
        Water water = new Water();
        water.flow();
        water.evaporate();
        water.freeze();
        water.boil();
        water.sustainLife();

        Water water1 = new DrinkingWater();
        water1.flow();
        water1.evaporate();
        water1.freeze();
        water1.boil();
        water1.sustainLife();

        DrinkingWater dw = new DrinkingWater();
        dw.flow();
        dw.evaporate();
        dw.freeze();
        dw.boil();
        dw.sustainLife();
    }
}
