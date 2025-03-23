class ChainRunner {
    public static void main(String chain[]) {
        Chain chain1 = new Chain("Gold", 20.5, 50000.0);
        chain1.material = "Gold";
        chain1.weightInGM = 20.5;
        chain1.price = 50000.0;
        System.out.println("Chain 1 Material is: " + chain1.material);
        System.out.println("Chain 1 Weight (gm) is: " + chain1.weightInGM);
        System.out.println("Chain 1 Price is: " + chain1.price);

        Chain chain2 = new Chain("Silver", 25.0, 8000.0);
        chain2.material = "Silver";
        chain2.weightInGM = 25.0;
        chain2.price = 8000.0;
        System.out.println("Chain 2 Material is: " + chain2.material);
        System.out.println("Chain 2 Weight (gm) is: " + chain2.weightInGM);
        System.out.println("Chain 2 Price is: " + chain2.price);

        Chain chain3 = new Chain("Platinum", 18.0, 70000.0);
        chain3.material = "Platinum";
        chain3.weightInGM = 18.0;
        chain3.price = 70000.0;
        System.out.println("Chain 3 Material is: " + chain3.material);
        System.out.println("Chain 3 Weight (gm) is: " + chain3.weightInGM);
        System.out.println("Chain 3 Price is: " + chain3.price);

        Chain chain4 = new Chain("Diamond", 15.5, 120000.0);
        chain4.material = "Diamond";
        chain4.weightInGM = 15.5;
        chain4.price = 120000.0;
        System.out.println("Chain 4 Material is: " + chain4.material);
        System.out.println("Chain 4 Weight (gm) is: " + chain4.weightInGM);
        System.out.println("Chain 4 Price is: " + chain4.price);

        Chain chain5 = new Chain("Bronze", 30.0, 4500.0);
        chain5.material = "Bronze";
        chain5.weightInGM = 30.0;
        chain5.price = 4500.0;
        System.out.println("Chain 5 Material is: " + chain5.material);
        System.out.println("Chain 5 Weight (gm) is: " + chain5.weightInGM);
        System.out.println("Chain 5 Price is: " + chain5.price);

        Chain chain6 = new Chain("Copper", 22.5, 3500.0);
        chain6.material = "Copper";
        chain6.weightInGM = 22.5;
        chain6.price = 3500.0;
        System.out.println("Chain 6 Material is: " + chain6.material);
        System.out.println("Chain 6 Weight (gm) is: " + chain6.weightInGM);
        System.out.println("Chain 6 Price is: " + chain6.price);

        Chain chain7 = new Chain("Titanium", 28.0, 20000.0);
        chain7.material = "Titanium";
        chain7.weightInGM = 28.0;
        chain7.price = 20000.0;
        System.out.println("Chain 7 Material is: " + chain7.material);
        System.out.println("Chain 7 Weight (gm) is: " + chain7.weightInGM);
        System.out.println("Chain 7 Price is: " + chain7.price);
    }
}