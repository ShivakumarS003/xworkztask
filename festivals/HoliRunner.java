package com.xworkz.methodOverriding.festivals;

import com.xworkz.methodOverriding.festivals.festival.Festival;
import com.xworkz.methodOverriding.festivals.holi.Holi;

public class HoliRunner {
    public static void main(String[] args) {
        Festival festival = new Festival();
        festival.decorate();
        festival.cook();
        festival.worship();
        festival.gather();
        festival.enjoy();

        Festival festival1 = new Holi();
        festival1.decorate();
        festival1.cook();
        festival1.worship();
        festival1.gather();
        festival1.enjoy();

        Holi diwali = new Holi();
        diwali.decorate();
        diwali.cook();
        diwali.worship();
        diwali.gather();
        diwali.enjoy();
    }
}
