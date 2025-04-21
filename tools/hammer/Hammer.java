package com.xworkz.methodOverriding.tools.hammer;

import com.xworkz.methodOverriding.tools.tool.Tool;

public class Hammer extends Tool {
    @Override
    public void use() {
        System.out.println("Hammer: Driving nails into wood");
    }

    @Override
    public void repair() {
        System.out.println("Hammer: Replacing loose handle");
    }

    @Override
    public void store() {
        System.out.println("Hammer: Hanging on a tool rack");
    }

    @Override
    public void clean() {
        System.out.println("Hammer: Wiping off dust and rust");
    }

    @Override
    public void inspect() {
        System.out.println("Hammer: Checking for cracks or damage");
    }
}
