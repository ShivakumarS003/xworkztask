package com.xworkz.methodOverriding.instruments;

import com.xworkz.methodOverriding.instruments.guitar.Guitar;
import com.xworkz.methodOverriding.instruments.instrument.Instrument;

public class GuitarRunner {
    public static void main(String[] args) {
        Instrument instr = new Instrument();
        instr.createSound();
        instr.tune();
        instr.play();
        instr.repair();
        instr.pack();

        Instrument instr1 = new Guitar();
        instr1.createSound();
        instr1.tune();
        instr1.play();
        instr1.repair();
        instr1.pack();

        Guitar guitar = new Guitar();
        guitar.createSound();
        guitar.tune();
        guitar.play();
        guitar.repair();
        guitar.pack();
    }
}
