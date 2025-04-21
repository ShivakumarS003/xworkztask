package com.xworkz.methodOverriding.Glass.window;

import com.xworkz.methodOverriding.Glass.glass.Glass;

public class Window extends Glass {
    @Override
    public void melt() {
        System.out.println("WindowGlass: Melted in electric furnace");
    }

    @Override
    public void shape() {
        System.out.println("WindowGlass: Flat shaping using rollers");
    }

    @Override
    public void cool() {
        System.out.println("WindowGlass: Cooled in annealing lehr");
    }

    @Override
    public void polish() {
        System.out.println("WindowGlass: Anti-glare polish applied");
    }

    @Override
    public void pack() {
        System.out.println("WindowGlass: Packed with foam layers");
    }
}
