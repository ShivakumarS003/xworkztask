class SwiggyRunner{
 public static void main(String swi[]){
 String searchItem = "Samsa";
 int quantity = 5;
 double getTotalPrice = Swiggy.priceWithQuantity(searchItem,quantity);
  double getItemPrice = Swiggy.takeOrders(searchItem);
  if(getTotalPrice != 0){
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
  System.out.println("price of "+quantity+" "+searchItem+" is: "+getTotalPrice+" rupees");}
   else
	   System.out.println(searchItem+" is not found");
   System.out.println("Please check for other items..");
 }
}