class TubeLight {
    String brand;
    int powerInWatts;
    double price;

    TubeLight() {
        System.out.println("TubeLight constructor is invoked.");
    }

    TubeLight(String brand, int powerInWatts, double price) {
	System.out.println();
        System.out.println("TubeLight constructor is invoked.");
	
        this.brand = brand;
        this.powerInWatts = powerInWatts;
        this.price = price;
    }
}
