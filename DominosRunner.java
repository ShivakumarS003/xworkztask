class DominosRunner{
public static void main(String dom[]){
 String searchItem = "Veg Margherita Pizza";
 int quantity = 6;
 double getTotalPrice = Dominos.priceWithQuantity(searchItem,quantity);
  double getItemPrice = Dominos.takeOrder(searchItem);
  if(getTotalPrice != 0){
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
  System.out.println("price of "+quantity+" "+searchItem+" is: "+getTotalPrice+" rupees");}
   
   else{
   System.out.println("Please check for other items..");
	System.out.println(searchItem+" is not found");}
 }
}
