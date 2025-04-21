package com.xworkz.methodOverriding.space;

import com.xworkz.methodOverriding.space.Space.Space;
import com.xworkz.methodOverriding.space.galaxy.Galaxy;

public class GalaxyRunner {
    public static void main(String[] args) {
        Space space = new Space();
        space.explore();
        space.observeStars();
        space.studyPlanets();
        space.launchSatellite();
        space.supportLifeResearch();

        Space space1 = new Galaxy();
        space1.explore();
        space1.observeStars();
        space1.studyPlanets();
        space1.launchSatellite();
        space1.supportLifeResearch();

        Galaxy galaxy = new Galaxy();
        galaxy.explore();
        galaxy.observeStars();
        galaxy.studyPlanets();
        galaxy.launchSatellite();
        galaxy.supportLifeResearch();
    }
}
