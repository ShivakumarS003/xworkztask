class Chain {
    String material;
    double weightInGM;
    double price;

    Chain() {
        System.out.println("Chain constructor is invoked.");
    }

    Chain(String material, double weightInGM, double price) {
        this.material = material;
        this.weightInGM = weightInGM;
        this.price = price;
		System.out.println();
    }
}