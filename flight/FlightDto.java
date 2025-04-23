package com.xworkz.toString.flight;

public class FlightDto {
    private int flightId;
    private String airline;
    private String origin;
    private String destination;
    private String departureTime;

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "FlightDto :-" +
                "\nFlight ID = " + this.flightId +
                "\nAirline = " + this.airline +
                "\nOrigin = " + this.origin +
                "\nDestination = " + this.destination +
                "\nDeparture Time = " + this.departureTime;
    }
}
