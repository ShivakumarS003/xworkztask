class ZeptoRunner{
public static void main(String zepto[]){
 String searchItem = "Butter Naa";
  double getItemPrice = Zepto.takeOrder(searchItem);
  if(getItemPrice != 0)
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
   else
   System.out.println("Please check for other items..");
 }
}
