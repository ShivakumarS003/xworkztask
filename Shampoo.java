class Shampoo {
    String brandName;
    int volumeInML;
    double price;

    Shampoo() {
        System.out.println("Shampoo constructor is invoked.");
    }

    Shampoo(String brandName, int volumeInML, double price) {
        this.brandName = brandName;
        this.volumeInML = volumeInML;
        this.price = price;
		System.out.println();
    }
}