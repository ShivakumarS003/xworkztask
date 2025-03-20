class FoodPandaRunner{
public static void main(String panda[]){
 String searchItem = "Lobster Roll";
  double getItemPrice = FoodPanda.takeOrder(searchItem);
  if(getItemPrice != 0)
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
   else
   System.out.println("Please check for other items..");
 }

}