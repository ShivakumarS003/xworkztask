class Soap{
 
 int id;
 String brandName;
 double price;

 Soap(){
 System.out.println("Soap Constructor Invoked");
 }
  Soap(int id,String brandName,double price){
   this.id = id;
   this.brandName = brandName;
   this.price = price;
  System.out.println();
  }

}