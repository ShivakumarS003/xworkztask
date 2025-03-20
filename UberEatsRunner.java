class UberEatsRunner{
public static void main(String uber[]){
 String searchItem = "Avocado Toast";
  double getItemPrice = UberEats.takeOrder(searchItem);
  if(getItemPrice != 0)
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
   else
   System.out.println("Please check for other items..");
 }

}