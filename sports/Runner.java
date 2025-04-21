package com.xworkz.methodOverriding.sports;

import com.xworkz.methodOverriding.sports.football.Football;
import com.xworkz.methodOverriding.sports.sport.Sport;

public class Runner {
    public static void main(String[] args) {
        Sport sport = new Sport();
        sport.play();
        sport.practice();
        sport.compete();
        sport.followRules();
        sport.celebrateWin();

        Sport sport1 = new Football();
        sport1.play();
        sport1.practice();
        sport1.compete();
        sport1.followRules();
        sport1.celebrateWin();

        Football football = new Football();
        football.play();
        football.practice();
        football.compete();
        football.followRules();
        football.celebrateWin();
    }
}
