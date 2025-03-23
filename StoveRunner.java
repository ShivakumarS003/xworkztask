class StoveRunner {
    public static void main(String stove[]) {
        Stove stove1 = new Stove("Prestige", 2, 2500.0);
        stove1.brandName = "Prestige";
        stove1.noOfBurners = 2;
        stove1.price = 2500.0;
        System.out.println("Stove 1 Brand: " + stove1.brandName);
        System.out.println("Stove 1 Number of Burners: " + stove1.noOfBurners);
        System.out.println("Stove 1 Price: " + stove1.price);

        Stove stove2 = new Stove("Sunflame", 3, 3200.0);
        stove2.brandName = "Sunflame";
        stove2.noOfBurners = 3;
        stove2.price = 3200.0;
        System.out.println("Stove 2 Brand: " + stove2.brandName);
        System.out.println("Stove 2 Number of Burners: " + stove2.noOfBurners);
        System.out.println("Stove 2 Price: " + stove2.price);

        Stove stove3 = new Stove("Butterfly", 4, 4100.0);
        stove3.brandName = "Butterfly";
        stove3.noOfBurners = 4;
        stove3.price = 4100.0;
        System.out.println("Stove 3 Brand: " + stove3.brandName);
        System.out.println("Stove 3 Number of Burners: " + stove3.noOfBurners);
        System.out.println("Stove 3 Price: " + stove3.price);

        Stove stove4 = new Stove("Glen", 3, 3500.0);
        stove4.brandName = "Glen";
        stove4.noOfBurners = 3;
        stove4.price = 3500.0;
        System.out.println("Stove 4 Brand: " + stove4.brandName);
        System.out.println("Stove 4 Number of Burners: " + stove4.noOfBurners);
        System.out.println("Stove 4 Price: " + stove4.price);

        Stove stove5 = new Stove("Elica", 2, 2900.0);
        stove5.brandName = "Elica";
        stove5.noOfBurners = 2;
        stove5.price = 2900.0;
        System.out.println("Stove 5 Brand: " + stove5.brandName);
        System.out.println("Stove 5 Number of Burners: " + stove5.noOfBurners);
        System.out.println("Stove 5 Price: " + stove5.price);

        Stove stove6 = new Stove("Faber", 4, 4500.0);
        stove6.brandName = "Faber";
        stove6.noOfBurners = 4;
        stove6.price = 4500.0;
        System.out.println("Stove 6 Brand: " + stove6.brandName);
        System.out.println("Stove 6 Number of Burners: " + stove6.noOfBurners);
        System.out.println("Stove 6 Price: " + stove6.price);

        Stove stove7 = new Stove("Bosch", 5, 5200.0);
        stove7.brandName = "Bosch";
        stove7.noOfBurners = 5;
        stove7.price = 5200.0;
        System.out.println("Stove 7 Brand: " + stove7.brandName);
        System.out.println("Stove 7 Number of Burners: " + stove7.noOfBurners);
        System.out.println("Stove 7 Price: " + stove7.price);
    }
}