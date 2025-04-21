package com.xworkz.methodOverriding.actors.yash;

import com.xworkz.methodOverriding.actors.actor.Actor;

public class Sudeep extends Actor {
    @Override
    public void act() {
        System.out.println("MovieActor: Acting in a blockbuster");
    }

    @Override
    public void rehearse() {
        System.out.println("MovieActor: Rehearsing fight scene");
    }

    @Override
    public void promote() {
        System.out.println("MovieActor: Going on a promotion tour");
    }

    @Override
    public void attendEvent() {
        System.out.println("MovieActor: Walking the red carpet");
    }

    @Override
    public void rest() {
        System.out.println("MovieActor: Vacationing in Maldives");
    }
}

