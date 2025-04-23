package com.xworkz.toString.flight;

public class FlightRunner {
    public static void main(String[] args) {
        FlightDto flight = new FlightDto();
        flight.setFlightId(301);
        flight.setAirline("Emirates");
        flight.setOrigin("India");
        flight.setDestination("New York");
        flight.setDepartureTime("10:00 PM");

        System.out.println(flight);
    }
}
