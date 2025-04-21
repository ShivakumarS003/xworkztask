package com.xworkz.methodOverriding.retruants.Kfc;

import com.xworkz.methodOverriding.retruants.retruant.Restaurant;

public class Kfc extends Restaurant {
    @Override
    public void open() {
        System.out.println("ItalianRestaurant: Opening with Italian music");
    }

    @Override
    public void serveFood() {
        System.out.println("ItalianRestaurant: Serving pasta and pizza");
    }

    @Override
    public void cleanTables() {
        System.out.println("ItalianRestaurant: Wiping down wine-stained tables");
    }

    @Override
    public void prepareBill() {
        System.out.println("ItalianRestaurant: Adding wine and dessert to bill");
    }

    @Override
    public void close() {
        System.out.println("ItalianRestaurant: Kitchen closed, lights off");
    }
}
