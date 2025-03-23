class Stove {
    String brandName;
    int noOfBurners;
    double price;

    Stove() {
        System.out.println("Stove Constructor Invoked");
    }

    Stove(String brandName, int noOfBurners, double price) {
  System.out.println();
		
        this.brandName = brandName;
        this.noOfBurners = noOfBurners;
        this.price = price;
    }
}