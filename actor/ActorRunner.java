package com.xworkz.toString.actor;

public class ActorRunner {
    public static void main(String[] args) {
        ActorDto actor = new ActorDto();
        actor.setId(1);
        actor.setName("Shah Rukh Khan");
        actor.setAge(58);
        actor.setGender("Male");
        actor.setMovie("Pathaan");

        System.out.println(actor);
    }
}
