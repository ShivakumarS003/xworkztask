package com.xworkz.methodOverriding.Glass;

import com.xworkz.methodOverriding.Glass.glass.Glass;
import com.xworkz.methodOverriding.Glass.window.Window;

public class Runner {
    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.melt();
        glass.shape();
        glass.cool();
        glass.polish();
        glass.pack();

        Glass glass1 = new Window();
        glass1.melt();
        glass1.shape();
        glass1.cool();
        glass1.polish();
        glass1.pack();

        Window window = new Window();
        window.melt();
        window.shape();
        window.cool();
        window.polish();
        window.pack();
    }
}
