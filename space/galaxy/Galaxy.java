package com.xworkz.methodOverriding.space.galaxy;

import com.xworkz.methodOverriding.space.Space.Space;

public class Galaxy extends Space {
    @Override
    public void explore() {
        System.out.println("Galaxy: Mapping different galaxies in the universe");
    }

    @Override
    public void observeStars() {
        System.out.println("Galaxy: Observing millions of stars in a galaxy");
    }

    @Override
    public void studyPlanets() {
        System.out.println("Galaxy: Studying planets within star systems");
    }

    @Override
    public void launchSatellite() {
        System.out.println("Galaxy: Launching deep space probes");
    }

    @Override
    public void supportLifeResearch() {
        System.out.println("Galaxy: Investigating habitable zones");
    }
}
