package com.xworkz.methodOverriding.Flights.airindia;

import com.xworkz.methodOverriding.Flights.flight.Flight;

public class AirIndia extends Flight {
    @Override
    public void takeOff() {
        System.out.println("PassengerFlight: Scheduled take-off");
    }

    @Override
    public void land() {
        System.out.println("PassengerFlight: Smooth landing");
    }

    @Override
    public void fly() {
        System.out.println("PassengerFlight: Cruising comfortably");
    }

    @Override
    public void provideService() {
        System.out.println("PassengerFlight: Meals and entertainment provided");
    }

    @Override
    public void checkSafety() {
        System.out.println("PassengerFlight: Safety demo before departure");
    }
}
