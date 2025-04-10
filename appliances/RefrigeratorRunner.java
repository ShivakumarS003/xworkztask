package com.xworkz.inhertance.appliances;

import com.xworkz.inhertance.appliances.appliance.Appliance;
import com.xworkz.inhertance.appliances.refrigerator.Refrigerator;

public class RefrigeratorRunner  {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator();
        fridge.operate();
    }
}
