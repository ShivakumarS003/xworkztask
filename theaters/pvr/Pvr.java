package com.xworkz.methodOverriding.theaters.pvr;

import com.xworkz.methodOverriding.theaters.theater.Theater;

public class Pvr extends Theater {
    @Override
    public void openShow() {
        System.out.println("DramaTheater: Opening with a dramatic monologue");
    }

    @Override
    public void dimLights() {
        System.out.println("DramaTheater: Lights down, spotlight on");
    }

    @Override
    public void playScene() {
        System.out.println("DramaTheater: Enacting emotional scenes");
    }

    @Override
    public void takeBreak() {
        System.out.println("DramaTheater: 15-minute break with background music");
    }

    @Override
    public void closeShow() {
        System.out.println("DramaTheater: Curtain call with applause");
    }
}
