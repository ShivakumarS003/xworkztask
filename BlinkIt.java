class BlinkIt{
public static double takeOrder(String searchItem){
 double itemPrice = 0.0;

   if (searchItem == "Bread Loaf"){ 
            itemPrice = 35.0; 
            return itemPrice; } 
        else if (searchItem == "Whole Wheat Bread") { 
            itemPrice = 40.0; 
            return itemPrice; } 
        else if (searchItem == "Butter"){ 
            itemPrice = 80.0; 
            return itemPrice;} 
        else if (searchItem == "Milk"){ 
            itemPrice = 45.0; 
            return itemPrice; } 
        else if (searchItem == "Curd"){ 
            itemPrice = 55.0; 
            return itemPrice; } 
        else if (searchItem == "Cheese"){ 
            itemPrice = 100.0; 
            return itemPrice; } 
        else if (searchItem == "Mozzarella Cheese"){ 
            itemPrice = 150.0; 
            return itemPrice;} 
        else if (searchItem == "Paneer"){ 
            itemPrice = 120.0; 
            return itemPrice; } 
        else if (searchItem == "Green Apple"){ 
            itemPrice = 60.0; 
            return itemPrice; } 
        else if (searchItem == "Banana") { 
            itemPrice = 30.0; 
            return itemPrice; } 
        else if (searchItem == "Grapes"){ 
            itemPrice = 80.0; 
            return itemPrice; } 
        else if (searchItem == "Orange"){ 
            itemPrice = 50.0; 
            return itemPrice;} 
        else if (searchItem == "Carrot"){ 
            itemPrice = 40.0; 
            return itemPrice; } 
        else if (searchItem == "Potato"){ 
            itemPrice = 20.0; 
            return itemPrice; } 
        else if (searchItem == "Onion") { 
            itemPrice = 25.0; 
            return itemPrice; } 
        else if (searchItem == "Tomato") { 
            itemPrice = 30.0; 
            return itemPrice; } 
        else if (searchItem == "Cucumber") { 
            itemPrice = 35.0; 
            return itemPrice; } 
        else if (searchItem == "Lettuce") { 
            itemPrice = 50.0; 
            return itemPrice; } 
        else if (searchItem == "Garlic") { 
            itemPrice = 20.0; 
            return itemPrice; } 
        else if (searchItem == "Ginger") { 
            itemPrice = 30.0; 
            return itemPrice; } 
        else if (searchItem == "Chili Pepper") { 
            itemPrice = 25.0; 
            return itemPrice; } 
        else if (searchItem == "Salt") { 
            itemPrice = 15.0; 
            return itemPrice; } 
        else if (searchItem == "Sugar") { 
            itemPrice = 40.0; 
            return itemPrice; } 
        else if (searchItem == "Rice") { 
            itemPrice = 60.0; 
            return itemPrice; } 
        else if (searchItem == "Pulses") { 
            itemPrice = 90.0; 
            return itemPrice; } 
        else if (searchItem == "Flour") { 
            itemPrice = 45.0; 
            return itemPrice; } 
        else if (searchItem == "Spaghetti") { 
            itemPrice = 70.0; 
            return itemPrice; } 
        else if (searchItem == "Macaroni") { 
            itemPrice = 80.0; 
            return itemPrice; } 
        else if (searchItem == "Bread Crumbs") { 
            itemPrice = 55.0; 
            return itemPrice; } 
        else if (searchItem == "Biscuits") { 
            itemPrice = 60.0; 
            return itemPrice; } 
        else if (searchItem == "Cookies") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Ice Cream") { 
            itemPrice = 100.0; 
            return itemPrice; } 
        else if (searchItem == "Chocolate") { 
            itemPrice = 80.0; 
            return itemPrice; } 
        else if (searchItem == "Peanut Butter") { 
            itemPrice = 120.0; 
            return itemPrice; } 
        else if (searchItem == "Honey") { 
            itemPrice = 200.0; 
            return itemPrice; } 
        else if (searchItem == "Jam") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Tea Bags") { 
            itemPrice = 40.0; 
            return itemPrice; } 
        else if (searchItem == "Coffee Powder") { 
            itemPrice = 120.0; 
            return itemPrice; } 
        else if (searchItem == "Juice (Apple)") { 
            itemPrice = 60.0; 
            return itemPrice; } 
        else if (searchItem == "Juice (Orange)") { 
            itemPrice = 55.0; 
            return itemPrice; }
    else if (searchItem == "Grapes"){ 
            itemPrice = 80.0; 
            return itemPrice; } 			
        else
		return itemPrice; 
    }
public static double priceWithQuantity(String searchItem,int quatiny){
		double itemPrice = takeOrder(searchItem);
		double totalPrice = itemPrice*quatiny;
		return totalPrice;
		
	}
    

}