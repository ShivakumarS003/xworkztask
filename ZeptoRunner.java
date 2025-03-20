class ZeptoRunner{
public static void main(String dom[]){
 String searchItem = "Butter Naan";
 int quantity = 6;
 double getTotalPrice = Zepto.priceWithQuantity(searchItem,quantity);
  double getItemPrice = Zepto.takeOrder(searchItem);
  if(getTotalPrice != 0){
   System.out.println("Price of 1 "+searchItem+" is: "+getItemPrice+" Rupees");
  System.out.println("price of "+quantity+" "+searchItem+" is: "+getTotalPrice+" rupees");}
   
   else{
	   System.out.println(searchItem+" is not found");
   System.out.println("Please check for other items..");}
 }
}
