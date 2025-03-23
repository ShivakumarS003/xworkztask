class CarryBag {
    String material;
    boolean isWashable;
    double price;

    CarryBag() {
        System.out.println("CarryBag constructor is invoked.");
    }
    CarryBag(String material, boolean isWashable, double price) {
        this.material = material;
        this.isWashable = isWashable;
        this.price = price;
		System.out.println();
    }
}