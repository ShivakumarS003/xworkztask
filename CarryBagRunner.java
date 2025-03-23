class CarryBagRunner {
    public static void main(String carry[]) {
        CarryBag bag1 = new CarryBag("Cotton", true, 150.0);
        bag1.material = "Cotton";
        bag1.isWashable = true;
        bag1.price = 150.0;
        System.out.println("CarryBag 1 Material is: " + bag1.material);
        System.out.println("CarryBag 1 is Washable: " + bag1.isWashable);
        System.out.println("CarryBag 1 Price is: " + bag1.price);

        CarryBag bag2 = new CarryBag("Jute", false, 200.0);
        bag2.material = "Jute";
        bag2.isWashable = false;
        bag2.price = 200.0;
        System.out.println("CarryBag 2 Material is: " + bag2.material);
        System.out.println("CarryBag 2 is Washable: " + bag2.isWashable);
        System.out.println("CarryBag 2 Price is: " + bag2.price);

        CarryBag bag3 = new CarryBag("Plastic", false, 50.0);
        bag3.material = "Plastic";
        bag3.isWashable = false;
        bag3.price = 50.0;
        System.out.println("CarryBag 3 Material is: " + bag3.material);
        System.out.println("CarryBag 3 is Washable: " + bag3.isWashable);
        System.out.println("CarryBag 3 Price is: " + bag3.price);

        CarryBag bag4 = new CarryBag("Leather", true, 500.0);
        bag4.material = "Leather";
        bag4.isWashable = true;
        bag4.price = 500.0;
        System.out.println("CarryBag 4 Material is: " + bag4.material);
        System.out.println("CarryBag 4 is Washable: " + bag4.isWashable);
        System.out.println("CarryBag 4 Price is: " + bag4.price);

        CarryBag bag5 = new CarryBag("Paper", false, 30.0);
        bag5.material = "Paper";
        bag5.isWashable = false;
        bag5.price = 30.0;
        System.out.println("CarryBag 5 Material is: " + bag5.material);
        System.out.println("CarryBag 5 is Washable: " + bag5.isWashable);
        System.out.println("CarryBag 5 Price is: " + bag5.price);

        CarryBag bag6 = new CarryBag("Canvas", true, 350.0);
        bag6.material = "Canvas";
        bag6.isWashable = true;
        bag6.price = 350.0;
        System.out.println("CarryBag 6 Material is: " + bag6.material);
        System.out.println("CarryBag 6 is Washable: " + bag6.isWashable);
        System.out.println("CarryBag 6 Price is: " + bag6.price);

        CarryBag bag7 = new CarryBag("Nylon", true, 250.0);
        bag7.material = "Nylon";
        bag7.isWashable = true;
        bag7.price = 250.0;
        System.out.println("CarryBag 7 Material is: " + bag7.material);
        System.out.println("CarryBag 7 is Washable: " + bag7.isWashable);
        System.out.println("CarryBag 7 Price is: " + bag7.price);
    }
}