package com.xworkz.methodOverriding.instruments.instrument;

public class Instrument {
    public void createSound() {
        System.out.println("Instrument: Producing sound");
    }

    public void tune() {
        System.out.println("Instrument: Tuning instrument");
    }

    public void play() {
        System.out.println("Instrument: Playing melody");
    }

    public void repair() {
        System.out.println("Instrument: Repairing broken parts");
    }

    public void pack() {
        System.out.println("Instrument: Packing for transport");
    }
}
