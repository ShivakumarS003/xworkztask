class BlinkItRunner{
public static void main(String blink[]){
 String searchItem = "Bread Lof";
  double getItemPrice = BlinkIt.takeOrder(searchItem);
  if(getItemPrice != 0)
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
   else
   System.out.println("Please check for other items..");
 }
}
