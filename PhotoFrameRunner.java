class PhotoFrameRunner {
    public static void main(String pfs[]) {
        PhotoFrame frame1 = new PhotoFrame("Wood", "Rectangle", 1200.0);
        frame1.material = "Wood";
        frame1.shape = "Rectangle";
        frame1.price = 1200.0;
        System.out.println("PhotoFrame 1 Material is: " + frame1.material);
        System.out.println("PhotoFrame 1 Shape is: " + frame1.shape);
        System.out.println("PhotoFrame 1 Price is: " + frame1.price);

        PhotoFrame frame2 = new PhotoFrame("Metal", "Square", 1800.0);
        frame2.material = "Metal";
        frame2.shape = "Square";
        frame2.price = 1800.0;
        System.out.println("PhotoFrame 2 Material is: " + frame2.material);
        System.out.println("PhotoFrame 2 Shape is: " + frame2.shape);
        System.out.println("PhotoFrame 2 Price is: " + frame2.price);

        PhotoFrame frame3 = new PhotoFrame("Plastic", "Oval", 750.0);
        frame3.material = "Plastic";
        frame3.shape = "Oval";
        frame3.price = 750.0;
        System.out.println("PhotoFrame 3 Material is: " + frame3.material);
        System.out.println("PhotoFrame 3 Shape is: " + frame3.shape);
        System.out.println("PhotoFrame 3 Price is: " + frame3.price);

        PhotoFrame frame4 = new PhotoFrame("Glass", "Round", 2200.0);
        frame4.material = "Glass";
        frame4.shape = "Round";
        frame4.price = 2200.0;
        System.out.println("PhotoFrame 4 Material is: " + frame4.material);
        System.out.println("PhotoFrame 4 Shape is: " + frame4.shape);
        System.out.println("PhotoFrame 4 Price is: " + frame4.price);

        PhotoFrame frame5 = new PhotoFrame("Aluminum", "Rectangle", 1500.0);
        frame5.material = "Aluminum";
        frame5.shape = "Rectangle";
        frame5.price = 1500.0;
        System.out.println("PhotoFrame 5 Material is: " + frame5.material);
        System.out.println("PhotoFrame 5 Shape is: " + frame5.shape);
        System.out.println("PhotoFrame 5 Price is: " + frame5.price);

        PhotoFrame frame6 = new PhotoFrame("Ceramic", "Heart", 2000.0);
        frame6.material = "Ceramic";
        frame6.shape = "Heart";
        frame6.price = 2000.0;
        System.out.println("PhotoFrame 6 Material is: " + frame6.material);
        System.out.println("PhotoFrame 6 Shape is: " + frame6.shape);
        System.out.println("PhotoFrame 6 Price is: " + frame6.price);

        PhotoFrame frame7 = new PhotoFrame("Acrylic", "Hexagon", 1700.0);
        frame7.material = "Acrylic";
        frame7.shape = "Hexagon";
        frame7.price = 1700.0;
        System.out.println("PhotoFrame 7 Material is: " + frame7.material);
        System.out.println("PhotoFrame 7 Shape is: " + frame7.shape);
        System.out.println("PhotoFrame 7 Price is: " + frame7.price);
    }
}