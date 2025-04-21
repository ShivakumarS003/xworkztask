package com.xworkz.methodOverriding.soil.redsoil;

import com.xworkz.methodOverriding.soil.Soil.Soil;

public class RedSoil extends Soil {
    @Override
    public void absorbWater() {
        System.out.println("ClaySoil: Absorbs water slowly and retains it longer");
    }

    @Override
    public void supportPlants() {
        System.out.println("ClaySoil: Provides firm support but may restrict roots");
    }

    @Override
    public void retainNutrients() {
        System.out.println("ClaySoil: High nutrient retention");
    }

    @Override
    public void filterWater() {
        System.out.println("ClaySoil: Slow water filtration");
    }

    @Override
    public void hostMicroorganisms() {
        System.out.println("ClaySoil: Supports microbial life but can get compacted");
    }
}
