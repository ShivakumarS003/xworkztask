class ShampooRunner {
    public static void main(String shampoo[]) {
        Shampoo shampoo1 = new Shampoo("Dove", 650, 450.0);
        shampoo1.brandName = "Dove";
        shampoo1.volumeInML = 650;
        shampoo1.price = 450.0;
        System.out.println("Shampoo 1 Brand is: " + shampoo1.brandName);
        System.out.println("Shampoo 1 Volume (ml) is: " + shampoo1.volumeInML);
        System.out.println("Shampoo 1 Price is: " + shampoo1.price);

        Shampoo shampoo2 = new Shampoo("Pantene", 500, 350.0);
        shampoo2.brandName = "Pantene";
        shampoo2.volumeInML = 500;
        shampoo2.price = 350.0;
        System.out.println("Shampoo 2 Brand is: " + shampoo2.brandName);
        System.out.println("Shampoo 2 Volume (ml) is: " + shampoo2.volumeInML);
        System.out.println("Shampoo 2 Price is: " + shampoo2.price);

        Shampoo shampoo3 = new Shampoo("Head & Shoulders", 700, 550.0);
        shampoo3.brandName = "Head & Shoulders";
        shampoo3.volumeInML = 700;
        shampoo3.price = 550.0;
        System.out.println("Shampoo 3 Brand is: " + shampoo3.brandName);
        System.out.println("Shampoo 3 Volume (ml) is: " + shampoo3.volumeInML);
        System.out.println("Shampoo 3 Price is: " + shampoo3.price);

        Shampoo shampoo4 = new Shampoo("Sunsilk", 400, 299.0);
        shampoo4.brandName = "Sunsilk";
        shampoo4.volumeInML = 400;
        shampoo4.price = 299.0;
        System.out.println("Shampoo 4 Brand is: " + shampoo4.brandName);
        System.out.println("Shampoo 4 Volume (ml) is: " + shampoo4.volumeInML);
        System.out.println("Shampoo 4 Price is: " + shampoo4.price);

        Shampoo shampoo5 = new Shampoo("Tresemme", 900, 650.0);
        shampoo5.brandName = "Tresemme";
        shampoo5.volumeInML = 900;
        shampoo5.price = 650.0;
        System.out.println("Shampoo 5 Brand is: " + shampoo5.brandName);
        System.out.println("Shampoo 5 Volume (ml) is: " + shampoo5.volumeInML);
        System.out.println("Shampoo 5 Price is: " + shampoo5.price);

        Shampoo shampoo6 = new Shampoo("Clinic Plus", 600, 299.0);
        shampoo6.brandName = "Clinic Plus";
        shampoo6.volumeInML = 600;
        shampoo6.price = 299.0;
        System.out.println("Shampoo 6 Brand is: " + shampoo6.brandName);
        System.out.println("Shampoo 6 Volume (ml) is: " + shampoo6.volumeInML);
        System.out.println("Shampoo 6 Price is: " + shampoo6.price);

        Shampoo shampoo7 = new Shampoo("Herbal Essences", 750, 599.0);
        shampoo7.brandName = "Herbal Essences";
        shampoo7.volumeInML = 750;
        shampoo7.price = 599.0;
        System.out.println("Shampoo 7 Brand is: " + shampoo7.brandName);
        System.out.println("Shampoo 7 Volume (ml) is: " + shampoo7.volumeInML);
        System.out.println("Shampoo 7 Price is: " + shampoo7.price);
    }
}