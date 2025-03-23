class ColdDrink {
    String brandName;
    String flavor;
    double price;

    ColdDrink() {
    }

    ColdDrink(String brandName, String flavor, double price) {
		
        this.brandName = brandName;
        this.flavor = flavor;
        this.price = price;
        System.out.println("ColdDrink constructor is invoked.");
		
		System.out.println();
    }
}