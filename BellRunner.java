class BellRunner {
    public static void main(String bell[]) {
        Bell bell1 = new Bell("Brass", "Loud", 800.0);
        bell1.material = "Brass";
        bell1.soundType = "Loud";
        bell1.price = 800.0;
        System.out.println("Bell 1 Material is: " + bell1.material);
        System.out.println("Bell 1 Sound Type is: " + bell1.soundType);
        System.out.println("Bell 1 Price is: " + bell1.price);

        Bell bell2 = new Bell("Bronze", "Deep", 1200.0);
        bell2.material = "Bronze";
        bell2.soundType = "Deep";
        bell2.price = 1200.0;
        System.out.println("Bell 2 Material is: " + bell2.material);
        System.out.println("Bell 2 Sound Type is: " + bell2.soundType);
        System.out.println("Bell 2 Price is: " + bell2.price);

        Bell bell3 = new Bell("Steel", "Sharp", 600.0);
        bell3.material = "Steel";
        bell3.soundType = "Sharp";
        bell3.price = 600.0;
        System.out.println("Bell 3 Material is: " + bell3.material);
        System.out.println("Bell 3 Sound Type is: " + bell3.soundType);
        System.out.println("Bell 3 Price is: " + bell3.price);

        Bell bell4 = new Bell("Copper", "Mellow", 900.0);
        bell4.material = "Copper";
        bell4.soundType = "Mellow";
        bell4.price = 900.0;
        System.out.println("Bell 4 Material is: " + bell4.material);
        System.out.println("Bell 4 Sound Type is: " + bell4.soundType);
        System.out.println("Bell 4 Price is: " + bell4.price);

        Bell bell5 = new Bell("Gold-Plated", "Soft", 2500.0);
        bell5.material = "Gold-Plated";
        bell5.soundType = "Soft";
        bell5.price = 2500.0;
        System.out.println("Bell 5 Material is: " + bell5.material);
        System.out.println("Bell 5 Sound Type is: " + bell5.soundType);
        System.out.println("Bell 5 Price is: " + bell5.price);

        Bell bell6 = new Bell("Silver", "Gentle", 1800.0);
        bell6.material = "Silver";
        bell6.soundType = "Gentle";
        bell6.price = 1800.0;
        System.out.println("Bell 6 Material is: " + bell6.material);
        System.out.println("Bell 6 Sound Type is: " + bell6.soundType);
        System.out.println("Bell 6 Price is: " + bell6.price);

        Bell bell7 = new Bell("Iron", "Echoing", 700.0);
        bell7.material = "Iron";
        bell7.soundType = "Echoing";
        bell7.price = 700.0;
        System.out.println("Bell 7 Material is: " + bell7.material);
        System.out.println("Bell 7 Sound Type is: " + bell7.soundType);
        System.out.println("Bell 7 Price is: " + bell7.price);
    }
}