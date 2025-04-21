package com.xworkz.methodOverriding.shoes;

import com.xworkz.methodOverriding.shoes.pumashoe.PumaShoe;
import com.xworkz.methodOverriding.shoes.shoe.Shoe;

public class PumaRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe();
        shoe.wear();
        shoe.polish();
        shoe.remove();
        shoe.tieLaces();
        shoe.clean();

        Shoe shoe1 = new PumaShoe();
        shoe1.wear();
        shoe1.polish();
        shoe1.remove();
        shoe1.tieLaces();
        shoe1.clean();

        PumaShoe sneaker = new PumaShoe();
        sneaker.wear();
        sneaker.polish();
        sneaker.remove();
        sneaker.tieLaces();
        sneaker.clean();
    }
}
