package com.xworkz.methodOverriding.batteries;

import com.xworkz.methodOverriding.batteries.baterry.Battery;
import com.xworkz.methodOverriding.batteries.duracell.Duracell;

public class CellRunner {
    public static void main(String[] args) {
        Battery battery = new Battery();
        battery.charge();
        battery.discharge();
        battery.storeEnergy();
        battery.checkHealth();
        battery.recycle();

        Battery battery1 = new Duracell();
        battery1.charge();
        battery1.discharge();
        battery1.storeEnergy();
        battery1.checkHealth();
        battery1.recycle();

        Duracell lb = new Duracell();
        lb.charge();
        lb.discharge();
        lb.storeEnergy();
        lb.checkHealth();
        lb.recycle();
    }
}
