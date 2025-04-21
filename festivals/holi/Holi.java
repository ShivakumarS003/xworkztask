package com.xworkz.methodOverriding.festivals.holi;

import com.xworkz.methodOverriding.festivals.festival.Festival;

public class Holi extends Festival {
    @Override
    public void decorate() {
        System.out.println("Diwali: Lighting diyas");
    }

    @Override
    public void cook() {
        System.out.println("Diwali: Making ladoos and snacks");
    }

    @Override
    public void worship() {
        System.out.println("Diwali: Lakshmi puja at home");
    }

    @Override
    public void gather() {
        System.out.println("Diwali: Family celebration with crackers");
    }

    @Override
    public void enjoy() {
        System.out.println("Diwali: Cultural programs and fireworks");
    }
}
