package com.xworkz.methodOverriding.instruments.guitar;

import com.xworkz.methodOverriding.instruments.instrument.Instrument;

public class Guitar extends Instrument {
    @Override
    public void createSound() {
        System.out.println("Guitar: Vibrating strings to create sound");
    }

    @Override
    public void tune() {
        System.out.println("Guitar: Tuning using pegs");
    }

    @Override
    public void play() {
        System.out.println("Guitar: Strumming chords");
    }

    @Override
    public void repair() {
        System.out.println("Guitar: Replacing broken string");
    }

    @Override
    public void pack() {
        System.out.println("Guitar: Packed in padded bag");
    }
}
