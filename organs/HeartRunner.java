package com.xworkz.methodOverriding.organs;

import com.xworkz.methodOverriding.organs.heart.Heart;
import com.xworkz.methodOverriding.organs.organ.Organ;

public class HeartRunner {
    public static void main(String[] args) {
        Organ organ = new Organ();
        organ.function();
        organ.supplyBlood();
        organ.connectNerves();
        organ.grow();
        organ.regenerate();

        Organ organ1 = new Heart();
        organ1.function();
        organ1.supplyBlood();
        organ1.connectNerves();
        organ1.grow();
        organ1.regenerate();

        Heart heart = new Heart();
        heart.function();
        heart.supplyBlood();
        heart.connectNerves();
        heart.grow();
        heart.regenerate();
    }
}
