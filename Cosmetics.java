class Cosmetics {
    String type;
    String brand;
    boolean isWaterProof;

    Cosmetics() {
        System.out.println("Cosmetics constructor is invoked.");
    }

    Cosmetics(String type, String brand, boolean isWaterProof) {
        System.out.println("Cosmetics constructor is invoked.");
		
        this.type = type;
        this.brand = brand;
        this.isWaterProof = isWaterProof;
		System.out.println();
		
		
		
    }
}