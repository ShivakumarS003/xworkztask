package com.xworkz.methodOverriding.technologies;

import com.xworkz.methodOverriding.technologies.java.Java;
import com.xworkz.methodOverriding.technologies.technology.Technology;

public class TechnologyTest {
    public static void main(String[] args) {
        Technology tech = new Technology();
        tech.innovate();
        tech.connect();
        tech.automate();
        tech.evolve();
        tech.simplify();

        Technology tech1 = new Java();
        tech1.innovate();
        tech1.connect();
        tech1.automate();
        tech1.evolve();
        tech1.simplify();

        Java java = new Java();
        java.innovate();
        java.connect();
        java.automate();
        java.evolve();
        java.simplify();
    }
}
