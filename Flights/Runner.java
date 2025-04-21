package com.xworkz.methodOverriding.Flights;

import com.xworkz.methodOverriding.Flights.airindia.AirIndia;
import com.xworkz.methodOverriding.Flights.flight.Flight;

public class Runner {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.takeOff();
        flight.land();
        flight.fly();
        flight.provideService();
        flight.checkSafety();

        Flight flight1 = new AirIndia();
        flight1.takeOff();
        flight1.land();
        flight1.fly();
        flight1.provideService();
        flight1.checkSafety();

        AirIndia passenger = new AirIndia();
        passenger.takeOff();
        passenger.land();
        passenger.fly();
        passenger.provideService();
        passenger.checkSafety();
    }
}
