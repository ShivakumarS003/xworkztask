class CosmeticsRunner {
    public static void main(String cos[]) {
        Cosmetics cosmetic1 = new Cosmetics("Lipstick", "Maybelline", true);
        cosmetic1.type = "Lipstick";
        cosmetic1.brand = "Maybelline";
        cosmetic1.isWaterProof = true;
        System.out.println("Cosmetic 1 Type is: " + cosmetic1.type);
        System.out.println("Cosmetic 1 Brand is: " + cosmetic1.brand);
        System.out.println("Cosmetic 1 is Waterproof: " + cosmetic1.isWaterProof);

        Cosmetics cosmetic2 = new Cosmetics("Foundation", "Lakme", false);
        cosmetic2.type = "Foundation";
        cosmetic2.brand = "Lakme";
        cosmetic2.isWaterProof = false;
        System.out.println("Cosmetic 2 Type is: " + cosmetic2.type);
        System.out.println("Cosmetic 2 Brand is: " + cosmetic2.brand);
        System.out.println("Cosmetic 2 is Waterproof: " + cosmetic2.isWaterProof);

        Cosmetics cosmetic3 = new Cosmetics("Eyeliner", "L'Oreal", true);
        cosmetic3.type = "Eyeliner";
        cosmetic3.brand = "L'Oreal";
        cosmetic3.isWaterProof = true;
        System.out.println("Cosmetic 3 Type is: " + cosmetic3.type);
        System.out.println("Cosmetic 3 Brand is: " + cosmetic3.brand);
        System.out.println("Cosmetic 3 is Waterproof: " + cosmetic3.isWaterProof);

        Cosmetics cosmetic4 = new Cosmetics("Compact Powder", "Mac", false);
        cosmetic4.type = "Compact Powder";
        cosmetic4.brand = "Mac";
        cosmetic4.isWaterProof = false;
        System.out.println("Cosmetic 4 Type is: " + cosmetic4.type);
        System.out.println("Cosmetic 4 Brand is: " + cosmetic4.brand);
        System.out.println("Cosmetic 4 is Waterproof: " + cosmetic4.isWaterProof);

        Cosmetics cosmetic5 = new Cosmetics("Mascara", "Revlon", true);
        cosmetic5.type = "Mascara";
        cosmetic5.brand = "Revlon";
        cosmetic5.isWaterProof = true;
        System.out.println("Cosmetic 5 Type is: " + cosmetic5.type);
        System.out.println("Cosmetic 5 Brand is: " + cosmetic5.brand);
        System.out.println("Cosmetic 5 is Waterproof: " + cosmetic5.isWaterProof);

        Cosmetics cosmetic6 = new Cosmetics("BB Cream", "Pond's", false);
        cosmetic6.type = "BB Cream";
        cosmetic6.brand = "Pond's";
        cosmetic6.isWaterProof = false;
        System.out.println("Cosmetic 6 Type is: " + cosmetic6.type);
        System.out.println("Cosmetic 6 Brand is: " + cosmetic6.brand);
        System.out.println("Cosmetic 6 is Waterproof: " + cosmetic6.isWaterProof);

        Cosmetics cosmetic7 = new Cosmetics("Nail Polish", "Nykaa", true);
        cosmetic7.type = "Nail Polish";
        cosmetic7.brand = "Nykaa";
        cosmetic7.isWaterProof = true;
        System.out.println("Cosmetic 7 Type is: " + cosmetic7.type);
        System.out.println("Cosmetic 7 Brand is: " + cosmetic7.brand);
        System.out.println("Cosmetic 7 is Waterproof: " + cosmetic7.isWaterProof);
    }
}