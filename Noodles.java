class Noodles {
    String flavor;
    String brandName;
    double price;

    Noodles() {
        System.out.println("Noodles constructor is invoked.");
    }

    Noodles(String flavor, String brandName, double price) {
        System.out.println("Noodles constructor is invoked.");
        this.flavor = flavor;
        this.brandName = brandName;
        this.price = price;
		System.out.println();
    }
}