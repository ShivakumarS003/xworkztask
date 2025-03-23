class Vase {
    String material;
    String color;
    double price;

    Vase() {
        System.out.println("Vase constructor is invoked.");
    }

    Vase(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
		
		System.out.println();
    }
}