class OlaEatsRunner{
public static void main(String dom[]){
 String searchItem = "Veg Tacos";
 int quantity = 8;
 double getTotalPrice = OlaEats.priceWithQuantity(searchItem,quantity);
  double getItemPrice = OlaEats.takeOrder(searchItem);
  if(getTotalPrice != 0){
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
  System.out.println("price of "+quantity+" "+searchItem+" is: "+getTotalPrice+" rupees");}
   
   else{
	   System.out.println(searchItem+" is not found");
   System.out.println("Please check for other items..");}
 }
}
