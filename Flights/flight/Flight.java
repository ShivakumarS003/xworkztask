package com.xworkz.methodOverriding.Flights.flight;

public class Flight {
    public void takeOff() {
        System.out.println("Flight: Taking off");
    }

    public void land() {
        System.out.println("Flight: Landing");
    }

    public void fly() {
        System.out.println("Flight: Flying at altitude");
    }

    public void provideService() {
        System.out.println("Flight: Providing onboard service");
    }

    public void checkSafety() {
        System.out.println("Flight: Checking safety protocols");
    }
}
