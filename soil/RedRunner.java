package com.xworkz.methodOverriding.soil;

import com.xworkz.methodOverriding.soil.Soil.Soil;
import com.xworkz.methodOverriding.soil.redsoil.RedSoil;

public class RedRunner {
    public static void main(String[] args) {
        Soil soil = new Soil();
        soil.absorbWater();
        soil.supportPlants();
        soil.retainNutrients();
        soil.filterWater();
        soil.hostMicroorganisms();

        Soil soil1 = new RedSoil();
        soil1.absorbWater();
        soil1.supportPlants();
        soil1.retainNutrients();
        soil1.filterWater();
        soil1.hostMicroorganisms();

        RedSoil clay = new RedSoil();
        clay.absorbWater();
        clay.supportPlants();
        clay.retainNutrients();
        clay.filterWater();
        clay.hostMicroorganisms();
    }
}
