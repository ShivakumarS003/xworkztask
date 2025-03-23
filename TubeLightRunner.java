class TubeLightRunner {
    public static void main(String ar[]) {
        TubeLight tubeLight1 = new TubeLight("Philips", 20, 350.0);
        tubeLight1.brand = "Philips";
        tubeLight1.powerInWatts = 20;
        tubeLight1.price = 350.0;
        System.out.println("TubeLight 1 Brand is: " + tubeLight1.brand);
        System.out.println("TubeLight 1 Power is: " + tubeLight1.powerInWatts + "W");
        System.out.println("TubeLight 1 Price is: " + tubeLight1.price);

        TubeLight tubeLight2 = new TubeLight("Syska", 18, 300.0);
        tubeLight2.brand = "Syska";
        tubeLight2.powerInWatts = 18;
        tubeLight2.price = 300.0;
        System.out.println("TubeLight 2 Brand is: " + tubeLight2.brand);
        System.out.println("TubeLight 2 Power is: " + tubeLight2.powerInWatts + "W");
        System.out.println("TubeLight 2 Price is: " + tubeLight2.price);

        TubeLight tubeLight3 = new TubeLight("Havells", 22, 400.0);
        tubeLight3.brand = "Havells";
        tubeLight3.powerInWatts = 22;
        tubeLight3.price = 400.0;
        System.out.println("TubeLight 3 Brand is: " + tubeLight3.brand);
        System.out.println("TubeLight 3 Power is: " + tubeLight3.powerInWatts + "W");
        System.out.println("TubeLight 3 Price is: " + tubeLight3.price);

        TubeLight tubeLight4 = new TubeLight("Wipro", 16, 280.0);
        tubeLight4.brand = "Wipro";
        tubeLight4.powerInWatts = 16;
        tubeLight4.price = 280.0;
        System.out.println("TubeLight 4 Brand is: " + tubeLight4.brand);
        System.out.println("TubeLight 4 Power is: " + tubeLight4.powerInWatts + "W");
        System.out.println("TubeLight 4 Price is: " + tubeLight4.price);

        TubeLight tubeLight5 = new TubeLight("Crompton", 24, 420.0);
        tubeLight5.brand = "Crompton";
        tubeLight5.powerInWatts = 24;
        tubeLight5.price = 420.0;
        System.out.println("TubeLight 5 Brand is: " + tubeLight5.brand);
        System.out.println("TubeLight 5 Power is: " + tubeLight5.powerInWatts + "W");
        System.out.println("TubeLight 5 Price is: " + tubeLight5.price);

        TubeLight tubeLight6 = new TubeLight("Bajaj", 14, 260.0);
        tubeLight6.brand = "Bajaj";
        tubeLight6.powerInWatts = 14;
        tubeLight6.price = 260.0;
        System.out.println("TubeLight 6 Brand is: " + tubeLight6.brand);
        System.out.println("TubeLight 6 Power is: " + tubeLight6.powerInWatts + "W");
        System.out.println("TubeLight 6 Price is: " + tubeLight6.price);

        TubeLight tubeLight7 = new TubeLight("Eveready", 21, 380.0);
        tubeLight7.brand = "Eveready";
        tubeLight7.powerInWatts = 21;
        tubeLight7.price = 380.0;
        System.out.println("TubeLight 7 Brand is: " + tubeLight7.brand);
        System.out.println("TubeLight 7 Power is: " + tubeLight7.powerInWatts + "W");
        System.out.println("TubeLight 7 Price is: " + tubeLight7.price);
    }
}