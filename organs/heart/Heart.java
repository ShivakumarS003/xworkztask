package com.xworkz.methodOverriding.organs.heart;

import com.xworkz.methodOverriding.organs.organ.Organ;

public class Heart extends Organ {
    @Override
    public void function() {
        System.out.println("Heart: Pumping blood");
    }

    @Override
    public void supplyBlood() {
        System.out.println("Heart: Circulating blood throughout body");
    }

    @Override
    public void connectNerves() {
        System.out.println("Heart: Receiving signals from brain");
    }

    @Override
    public void grow() {
        System.out.println("Heart: Growing from infant to adult size");
    }

    @Override
    public void regenerate() {
        System.out.println("Heart: Limited regeneration of tissue");
    }
}
