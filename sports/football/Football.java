package com.xworkz.methodOverriding.sports.football;

import com.xworkz.methodOverriding.sports.sport.Sport;

public class Football extends Sport {
    @Override
    public void play() {
        System.out.println("Football: Kicking the ball on the field");
    }

    @Override
    public void practice() {
        System.out.println("Football: Drilling passes and shots");
    }

    @Override
    public void compete() {
        System.out.println("Football: Playing competitive league matches");
    }

    @Override
    public void followRules() {
        System.out.println("Football: Following FIFA regulations");
    }

    @Override
    public void celebrateWin() {
        System.out.println("Football: Celebrating with fans and teammates");
    }
}
