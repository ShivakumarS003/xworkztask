class Zepto {
public static double takeOrder(String searchItem){
double itemPrice = 0.0;

if (searchItem == "Vegetable Hakka Noodles") { 
            itemPrice = 120.0; 
            return itemPrice; } 
    else if (searchItem == "Butter Naan") { 
            itemPrice = 60.0; 
            return itemPrice; } 
      else if (searchItem == "Aloo Paratha") { 
            itemPrice = 80.0; 
            return itemPrice; } 
          else if (searchItem == "Garlic Naan") { 
            itemPrice = 70.0; 
            return itemPrice; } 
        else if (searchItem == "Dal Makhani") { 
          itemPrice = 150.0; 
            return itemPrice; } 
     else if (searchItem == "Gulab Jamun") { 
            itemPrice = 50.0; 
            return itemPrice; } 
       else if (searchItem == "Malai Kofta") { 
            itemPrice = 160.0; 
            return itemPrice; } 
         else if (searchItem == "Chana Masala") { 
            itemPrice = 120.0; 
            return itemPrice; } 
        else if (searchItem == "Rajma Rice") { 
            itemPrice = 100.0; 
            return itemPrice; } 
        else if (searchItem == "Paneer Tikka") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Cheese Pizza") { 
            itemPrice = 250.0; 
            return itemPrice; } 
        else if (searchItem == "Veg Sandwich") { 
            itemPrice = 90.0; 
            return itemPrice; } 
        else if (searchItem == "Cheese Sandwich") { 
            itemPrice = 100.0; 
            return itemPrice; } 
        else if (searchItem == "Pasta Arrabbiata") { 
            itemPrice = 170.0; 
            return itemPrice; } 
        else if (searchItem == "Pasta Alfredo") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Veg Frankie") { 
            itemPrice = 120.0; 
            return itemPrice; } 
        else if (searchItem == "Cheese Frankie") { 
            itemPrice = 140.0; 
            return itemPrice; } 
        else if (searchItem == "Vegetable Cutlet") { 
            itemPrice = 60.0; 
            return itemPrice; } 
        else if (searchItem == "Corn and Cheese Sandwich") { 
            itemPrice = 130.0; 
            return itemPrice; } 
        else if (searchItem == "Cheese Garlic Bread") { 
            itemPrice = 120.0; 
            return itemPrice; } 
        else if (searchItem == "Veg Wrap") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Fruit Custard") { 
            itemPrice = 90.0; 
            return itemPrice; } 
        else if (searchItem == "Ice Cream Sundae") { 
            itemPrice = 100.0; 
            return itemPrice; } 
        else if (searchItem == "Chocolate Mousse") { 
            itemPrice = 130.0; 
            return itemPrice; } 
        else if (searchItem == "Carrot Halwa") { 
            itemPrice = 80.0; 
            return itemPrice; } 
        else if (searchItem == "Pineapple Cake") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Chocolate Cake") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Strawberry Milkshake") { 
            itemPrice = 70.0; 
            return itemPrice; } 
        else if (searchItem == "Banana Milkshake") { 
            itemPrice = 60.0; 
            return itemPrice; } 
        else if (searchItem == "Mango Lassi") { 
            itemPrice = 90.0; 
            return itemPrice; } 
        else if (searchItem == "Apple Pie") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Sizzling Brownie") { 
            itemPrice = 200.0; 
            return itemPrice; } 
        else if (searchItem == "Fruit Cake") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Papad") { 
            itemPrice = 30.0; 
            return itemPrice; } 
        else if (searchItem == "Vegetable Soup") { 
            itemPrice = 60.0; 
            return itemPrice; } 
        else if (searchItem == "Chicken Shawarma") { 
            itemPrice = 180.0; 
            return itemPrice; } 
        else if (searchItem == "Veg Shawarma") { 
            itemPrice = 150.0; 
            return itemPrice; } 
        else if (searchItem == "Falafel with Hummus") { 
            itemPrice = 140.0; 
            return itemPrice; } 
        else if (searchItem == "Lemonade") { 
            itemPrice = 40.0; 
            return itemPrice; } 
        else if (searchItem == "Cucumber Raita") { 
            itemPrice = 50.0; 
            return itemPrice; } 
		else if (searchItem == "Butter Naan") { 
            itemPrice = 60.0; 
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

