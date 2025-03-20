class ClothsRunner{
 public static void main(String clo[]){
 
   Cloths cloth1 = new Cloths();
   Cloths cloth2 = new Cloths();
   Cloths cloth3 = new Cloths();
   
   cloth1.type = "Shirt";
   cloth1.size = "Medium";
   cloth1.price = 599.0;
   System.out.println("Type of cloth is "+cloth1.type);
   System.out.println("Size of "+cloth1.type+" is "+cloth1.size);
   System.out.println("Price of "+cloth1.type+" is "+cloth1.price);
   
   System.out.println();
   
    cloth2.type = "Oversized t-shirt";
   cloth2.size = "Large";
   cloth2.price = 699.0;
   System.out.println("Type of cloth is "+cloth2.type);
   System.out.println("Size of "+cloth2.type+" is "+cloth2.size);
   System.out.println("Price of "+cloth2.type+" is "+cloth2.price);
   
   System.out.println();
   
    cloth3.type = "Pant";
   cloth3.size = "Large";
   cloth3.price = 899.0;
   System.out.println("Type of cloth is "+cloth3.type);
   System.out.println("Size of "+cloth3.type+" is "+cloth3.size);
   System.out.println("Price of "+cloth3.type+" is "+cloth3.price);
   
   
 }
}