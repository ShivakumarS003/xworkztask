class BubbleGum {
    String brandName;
    String flavor;
    double price;

    BubbleGum() {
        System.out.println("BubbleGum constructor is invoked.");
    }

    BubbleGum(String brandName, String flavor, double price) {
        this.brandName = brandName;
        this.flavor = flavor;
        this.price = price;
		System.out.println();
    }
}
