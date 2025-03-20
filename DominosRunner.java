class DominosRunner{
public static void main(String dom[]){
 String searchItem = "Veg Margherita Pizza";
  double getItemPrice = Dominos.takeOrder(searchItem);
  if(getItemPrice != 0)
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
   else
   System.out.println("Please check for other items..");
 }
}
