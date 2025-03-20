class OlaEatsRunner{
public static void main(String ola[]){
 String searchItem = "Paneer Quesadilla";
  double getItemPrice = OlaEats.takeOrder(searchItem);
  if(getItemPrice != 0)
   System.out.println("Price of "+searchItem+" is: "+getItemPrice+" Rupees");
   else
   System.out.println("Please check for other items..");
 }
}


