class ShoesRunner{
public static void main(String shoe[]){

  Shoes shoe1 = new Shoes();
  Shoes shoe2 = new Shoes();
  Shoes shoe3 = new Shoes();
  
  shoe1.brand = "Puma";
  shoe1.price = 1399.0;
  shoe1.isWashable = true;
  System.out.println("Shoe1 brand Name is "+shoe1.brand);
  System.out.println("Shoe1 price is "+shoe1.price);
  System.out.println("Is Shoe1 washable "+shoe1.brand);
  
  System.out.println();
  
  shoe2.brand = "Woodlands";
  shoe2.price = 2499.0;
  shoe2.isWashable = false;
  System.out.println("Shoe2 brand Name is "+shoe2.brand);
  System.out.println("Shoe2 price is "+shoe2.price);
  System.out.println("Is Shoe2 washable "+shoe2.brand);
  
  System.out.println();
  
  shoe3.brand = "Adidas";
  shoe3.price = 1999.0;
  shoe3.isWashable = true;
  System.out.println("Shoe3 brand Name is "+shoe3.brand);
  System.out.println("Shoe3 price is "+shoe3.price);
  System.out.println("Is Shoe3 washable "+shoe3.brand);
  
}

}