class PhotoFrame {
    String material;
    String shape;
    double price;

    PhotoFrame() {
        System.out.println("PhotoFrame constructor is invoked.");
    }

    PhotoFrame(String material, String shape, double price) {
        this.material = material;
        this.shape = shape;
        this.price = price;
System.out.println();		
    }
}