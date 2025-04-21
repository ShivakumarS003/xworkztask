package com.xworkz.methodOverriding.shoes.pumashoe;

import com.xworkz.methodOverriding.shoes.shoe.Shoe;

public class PumaShoe extends Shoe {
    @Override
    public void wear() {
        System.out.println("Sneaker: Worn for comfort and sport");
    }

    @Override
    public void polish() {
        System.out.println("Sneaker: Usually not polished");
    }

    @Override
    public void remove() {
        System.out.println("Sneaker: Easily removable with no laces sometimes");
    }

    @Override
    public void tieLaces() {
        System.out.println("Sneaker: Tied with modern elastic laces");
    }

    @Override
    public void clean() {
        System.out.println("Sneaker: Cleaned with a soft brush");
    }
}
