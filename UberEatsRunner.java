class UberEatsRunner{
public static void main(String uber[]){
 String searchItem = "Avocado Toast";
 int quantity = 13;
 double getTotalPrice = UberEats.priceWithQuantity(searchItem,quantity);
  double getItemPrice = UberEats.takeOrder(searchItem);
  if(getTotalPrice != 0){
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
  System.out.println("price of "+quantity+" "+searchItem+" is: "+getTotalPrice+" rupees");}
   
   else{
	   System.out.println(searchItem+" is not found");
   System.out.println("Please check for other items..");}
 }
}
