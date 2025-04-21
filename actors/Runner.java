package com.xworkz.methodOverriding.actors;

import com.xworkz.methodOverriding.actors.actor.Actor;
import com.xworkz.methodOverriding.actors.yash.Sudeep;
import com.xworkz.methodOverriding.actors.yash.Sudeep;

public class Runner {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.act();
        actor.rehearse();
        actor.promote();
        actor.attendEvent();
        actor.rest();

        Actor actor1 = new Sudeep();
        actor1.act();
        actor1.rehearse();
        actor1.promote();
        actor1.attendEvent();
        actor1.rest();

        Sudeep ma = new Sudeep();
        ma.act();
        ma.rehearse();
        ma.promote();
        ma.attendEvent();
        ma.rest();
    }
}

