class MatRunner {
    public static void main(String mat[]) {
        Mat mat1 = new Mat("Cotton", true, 500.0);
        mat1.material = "Cotton";
        mat1.isWashable = true;
        mat1.price = 500.0;
        System.out.println("Mat 1 Material is: " + mat1.material);
        System.out.println("Mat 1 is Washable: " + mat1.isWashable);
        System.out.println("Mat 1 Price is: " + mat1.price);

        Mat mat2 = new Mat("Rubber", false, 1200.0);
        mat2.material = "Rubber";
        mat2.isWashable = false;
        mat2.price = 1200.0;
        System.out.println("Mat 2 Material is: " + mat2.material);
        System.out.println("Mat 2 is Washable: " + mat2.isWashable);
        System.out.println("Mat 2 Price is: " + mat2.price);

        Mat mat3 = new Mat("Bamboo", true, 800.0);
        mat3.material = "Bamboo";
        mat3.isWashable = true;
        mat3.price = 800.0;
        System.out.println("Mat 3 Material is: " + mat3.material);
        System.out.println("Mat 3 is Washable: " + mat3.isWashable);
        System.out.println("Mat 3 Price is: " + mat3.price);

        Mat mat4 = new Mat("Wool", false, 2500.0);
        mat4.material = "Wool";
        mat4.isWashable = false;
        mat4.price = 2500.0;
        System.out.println("Mat 4 Material is: " + mat4.material);
        System.out.println("Mat 4 is Washable: " + mat4.isWashable);
        System.out.println("Mat 4 Price is: " + mat4.price);

        Mat mat5 = new Mat("Jute", true, 1000.0);
        mat5.material = "Jute";
        mat5.isWashable = true;
        mat5.price = 1000.0;
        System.out.println("Mat 5 Material is: " + mat5.material);
        System.out.println("Mat 5 is Washable: " + mat5.isWashable);
        System.out.println("Mat 5 Price is: " + mat5.price);

        Mat mat6 = new Mat("Foam", false, 1800.0);
        mat6.material = "Foam";
        mat6.isWashable = false;
        mat6.price = 1800.0;
        System.out.println("Mat 6 Material is: " + mat6.material);
        System.out.println("Mat 6 is Washable: " + mat6.isWashable);
        System.out.println("Mat 6 Price is: " + mat6.price);

        Mat mat7 = new Mat("Synthetic", true, 600.0);
        mat7.material = "Synthetic";
        mat7.isWashable = true;
        mat7.price = 600.0;
        System.out.println("Mat 7 Material is: " + mat7.material);
        System.out.println("Mat 7 is Washable: " + mat7.isWashable);
        System.out.println("Mat 7 Price is: " + mat7.price);
    }
}