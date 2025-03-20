class BlinkItRunner{
public static void main(String dom[]){
 String searchItem = "Bread Loaf";
 int quantity = 6;
 double getTotalPrice = BlinkIt.priceWithQuantity(searchItem,quantity);
  double getItemPrice = BlinkIt.takeOrder(searchItem);
  if(getTotalPrice != 0){
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
  System.out.println("price of "+quantity+" "+searchItem+" is: "+getTotalPrice+" rupees");}
   
   else{
   System.out.println("Please check for other items..");
	System.out.println(searchItem+" is not found");}
 }
}
