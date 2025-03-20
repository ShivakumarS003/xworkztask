class CarRunner{
public static void main (String carDetails[]){

 Car car1 = new Car();
 Car car2 = new Car();
 
 car1.company = "Tata";
 car1.name = "Nexon";
 car1.price = 1200000.00;
 
 System.out.println("Car1 Company is "+car1.company);
 System.out.println("Car1 Name is "+car1.name);
 System.out.println("Car1 Price is "+car1.price);
 
 System.out.println();
 
  car2.company = "Suzuki";
 car2.name = "Swift";
 car2.price = 1000000.00;
 
 System.out.println("car2 Company is "+car2.company);
 System.out.println("Car2 Name is "+car2.name);
 System.out.println("Car2 Price is "+car2.price);
 
}

}