class Bell {
    String material;
    String soundType;
    double price;

    Bell() {
        System.out.println("Bell constructor is invoked.");
    }

    Bell(String material, String soundType, double price) {
        this.material = material;
        this.soundType = soundType;
        this.price = price;
    }
}
