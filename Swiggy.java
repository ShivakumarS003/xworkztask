class Swiggy{
public static double takeOrder (String searchItem , int quantity){
   double itemPrice = 0.0;
   if(searchItem == "Burger")
      itemPrice = 90 * quantity;
	  return itemPrice;
}

public static double takeOrder (String searchItem , long quantity){
   double itemPrice = 0.0;
   if(searchItem == "Burger")
    itemPrice = 99*quantity;
	return itemPrice;

}

}