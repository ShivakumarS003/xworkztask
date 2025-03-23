class Mat {
    String material;
    boolean isWashable;
    double price;

    Mat() {
        System.out.println("Mat constructor is invoked.");
    }

    Mat(String material, boolean isWashable, double price) {
        this.material = material;
        this.isWashable = isWashable;
        this.price = price;
		  System.out.println();
    }
}