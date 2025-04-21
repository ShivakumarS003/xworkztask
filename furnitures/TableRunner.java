package com.xworkz.methodOverriding.Furnitures;

import com.xworkz.methodOverriding.Furnitures.furniture.Furniture;
import com.xworkz.methodOverriding.Furnitures.table.Table;

public class TableRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.build();
        furniture.polish();
        furniture.assemble();
        furniture.testStability();
        furniture.move();

        Furniture furniture1 = new Table();
        furniture1.build();
        furniture1.polish();
        furniture1.assemble();
        furniture1.testStability();
        furniture1.move();

        Table chair = new Table();
        chair.build();
        chair.polish();
        chair.assemble();
        chair.testStability();
        chair.move();
    }
}
