package com.xworkz.methodOverriding.Furnitures.table;

import com.xworkz.methodOverriding.Furnitures.furniture.Furniture;

public class Table extends Furniture {
    @Override
    public void build() {
        System.out.println("Chair: Constructing wooden frame");
    }

    @Override
    public void polish() {
        System.out.println("Chair: Smooth varnish finish");
    }

    @Override
    public void assemble() {
        System.out.println("Chair: Attaching legs and backrest");
    }

    @Override
    public void testStability() {
        System.out.println("Chair: Checking wobble resistance");
    }

    @Override
    public void move() {
        System.out.println("Chair: Placing near table");
    }
}
