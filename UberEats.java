class UberEats{
 public static double takeOrder(String searchItem){
  double itemPrice = 0.0;
  
  if (searchItem == "Avocado Toast") { 
            itemPrice = 180.0; 
            return itemPrice; } 
      else if (searchItem == "Bagel with Cream Cheese") { 
            itemPrice = 120.0; 
            return itemPrice; } 
         else if (searchItem == "Grilled Cheese Sandwich") { 
            itemPrice = 140.0; 
            return itemPrice; } 
      else if (searchItem == "Egg Salad Sandwich") { 
            itemPrice = 160.0; 
            return itemPrice; } 
          else if (searchItem == "Turkey Club Sandwich") { 
            itemPrice = 180.0; 
            return itemPrice; } 
      else if (searchItem == "Caesar Salad") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Quinoa Salad") { 
            itemPrice = 170.0; 
            return itemPrice; } 
        else if (searchItem == "Caprese Salad") { 
            itemPrice = 140.0; 
            return itemPrice; } 
        else if (searchItem == "Grilled Chicken Salad") { 
            itemPrice = 200.0; 
            return itemPrice; } 
        else if (searchItem == "Vegetarian Pizza") { 
            itemPrice = 250.0; 
            return itemPrice; } 
        else if (searchItem == "Pepperoni Pizza") { 
            itemPrice = 270.0; 
            return itemPrice; } 
        else if (searchItem == "Margherita Pizza") { 
            itemPrice = 230.0; 
            return itemPrice; } 
        else if (searchItem == "BBQ Chicken Pizza") { 
            itemPrice = 290.0; 
            return itemPrice; } 
        else if (searchItem == "Penne Alfredo") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Spaghetti Bolognese") { 
            itemPrice = 200.0; 
            return itemPrice; } 
        else if (searchItem == "Lasagna") { 
            itemPrice = 220.0; 
            return itemPrice; } 
        else if (searchItem == "Shrimp Scampi") { 
            itemPrice = 240.0; 
            return itemPrice; } 
        else if (searchItem == "Chicken Fajitas") { 
            itemPrice = 250.0; 
            return itemPrice; } 
        else if (searchItem == "Beef Burritos") { 
            itemPrice = 220.0; 
            return itemPrice; } 
        else if (searchItem == "Vegetable Tacos") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Beef Tacos") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Chicken Quesadilla") { 
            itemPrice = 200.0; 
            return itemPrice; } 
        else if (searchItem == "Grilled Chicken Wrap") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Falafel Wrap") { 
            itemPrice = 160.0; 
            return itemPrice; } 
        else if (searchItem == "Veggie Burger") { 
            itemPrice = 170.0; 
            return itemPrice; } 
        else if (searchItem == "Beef Burger") { 
            itemPrice = 190.0; 
            return itemPrice; } 
        else if (searchItem == "Chicken Wings") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Buffalo Wings") { 
            itemPrice = 200.0; 
            return itemPrice; } 
        else if (searchItem == "Fish and Chips") { 
            itemPrice = 220.0; 
            return itemPrice; } 
        else if (searchItem == "Grilled Salmon") { 
            itemPrice = 240.0; 
            return itemPrice; } 
        else if (searchItem == "Garlic Breadsticks") { 
            itemPrice = 120.0; 
            return itemPrice; } 
        else if (searchItem == "Cheese Stuffed Mushrooms") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Vegetable Samosa") { 
            itemPrice = 50.0; 
            return itemPrice; } 
        else if (searchItem == "Chicken Samosa") { 
            itemPrice = 60.0; 
            return itemPrice; } 
        else if (searchItem == "Mozzarella Sticks") { 
            itemPrice = 120.0; 
            return itemPrice; } 
        else if (searchItem == "Crispy Fried Chicken") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Chocolate Cake") { 
            itemPrice = 170.0; 
            return itemPrice; } 
        else if (searchItem == "Cheesecake") { 
            itemPrice = 200.0; 
            return itemPrice; } 
        else if (searchItem == "Tiramisu") { 
            itemPrice = 190.0; 
            return itemPrice; } 
        else if (searchItem == "Fruit Tart") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Ice Cream Sundae") { 
            itemPrice = 130.0; 
            return itemPrice; } 
        else if (searchItem == "Strawberry Milkshake") { 
            itemPrice = 90.0; 
            return itemPrice; } 
        else if (searchItem == "Vanilla Milkshake") { 
            itemPrice = 80.0; 
            return itemPrice; } 
        else if (searchItem == "Mango Lassi") { 
            itemPrice = 100.0; 
            return itemPrice; } 
			else if (searchItem == "Grilled Cheese Sandwich") { 
            itemPrice = 140.0; 
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