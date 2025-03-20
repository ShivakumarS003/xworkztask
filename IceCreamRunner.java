class IceCreamRunner{
 public static void main(String ice[] ){
 
  IceCream iceCream1 = new IceCream();
  IceCream iceCream2 = new IceCream();
  IceCream iceCream3 = new IceCream();
  
  iceCream1.brand = "Amul";
  iceCream1.flovour = "Vanila";
  iceCream1.price = 99.0;
  System.out.println("IceCream1 brand is "+iceCream1.brand);
  System.out.println("IceCream1 flovour is "+iceCream1.flovour);
  System.out.println("IceCream1 price is "+iceCream1.price);
  
  System.out.println();
  
  iceCream2.brand = "DairyDay";
  iceCream2.flovour = "Butter Scotch";
  iceCream2.price = 199.0;
  System.out.println("IceCream2 brand is "+iceCream2.brand);
  System.out.println("IceCream2 flovour is "+iceCream2.flovour);
  System.out.println("IceCream2 price is "+iceCream2.price);
  
  System.out.println();
  
  iceCream3.brand = "Baskin Robbins";
  iceCream3.flovour = "Straberry";
  iceCream3.price = 299.0;
  System.out.println("IceCream3 brand is "+iceCream3.brand);
  System.out.println("IceCream3 flovour is "+iceCream3.flovour);
  System.out.println("IceCream3 price is "+iceCream3.price);
 
 }
}