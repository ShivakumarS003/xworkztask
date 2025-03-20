class Swiggy {
public static double takeOrders(String searchItem){
  double itemPrice = 0.0;

  if (searchItem == "Samosa"){ 
        itemPrice = 30.0; 
        return itemPrice; }
		
    else if (searchItem == "Vada Pav"){ 
        itemPrice = 40.0; 
        return itemPrice; }
		
    else if (searchItem == "Pani Puri"){ 
        itemPrice = 50.0; 
        return itemPrice; 
    }
    else if (searchItem == "Bhel Puri") { 
        itemPrice = 60.0; 
        return itemPrice;}
    else if (searchItem == "Pav Bhaji") { 
        itemPrice = 100.0; 
        return itemPrice; }
    else if (searchItem == "Aloo Tikki") { 
        itemPrice = 40.50; 
        return itemPrice;}
		
    else if (searchItem == "Pesarattu") { 
        itemPrice = 79.0; 
        return itemPrice;  }

    else if (searchItem == "Dhokla") { 
        itemPrice = 43.0; 
        return itemPrice;   }
		
    else if (searchItem == "Kachori") { 
        itemPrice = 59.0; 
        return itemPrice; 
    }
    else if (searchItem == "Sada Dosa") { 
        itemPrice = 50.0; 
        return itemPrice; 
    }
    else if (searchItem == "Idli with Sambar and Coconut Chutney") { 
        itemPrice = 50.0; 
        return itemPrice; 
    }
    else if (searchItem == "Aloo Paratha") { 
        itemPrice = 60.0; 
        return itemPrice; 
      }
    else if (searchItem == "Cheese Pakora") { 
        itemPrice = 70.0; 
        return itemPrice; 
     }
    else if (searchItem == "Chana Chaat") { 
        itemPrice = 49.0; 
        return itemPrice; 
       }
    else if (searchItem == "Chole Bhature") { 
        itemPrice = 99.0; 
        return itemPrice; 
    }
    else if (searchItem == "Paneer Butter Masala") { 
        itemPrice = 159.0; 
        return itemPrice; 
      }
    else if (searchItem == "Dal Tadka") { 
        itemPrice = 101.0; 
        return itemPrice; }
		
    else if (searchItem == "Gobi Manchurian") { 
        itemPrice = 127.0; 
        return itemPrice; 
       }
    else if (searchItem == "Malai Kofta") { 
        itemPrice = 150.0; 
        return itemPrice; 
       }
    else if (searchItem == "Baingan Bharta") { 
        itemPrice = 124.0; 
        return itemPrice; 
      }
    else if (searchItem == "Vegetable Biryani") { 
        itemPrice = 120.0; 
        return itemPrice; 
    }
    else if (searchItem == "Paneer Tikka") { 
        itemPrice = 310.0; 
        return itemPrice; 
    }
    else if (searchItem == "Kadai Paneer") { 
        itemPrice = 150.0; 
        return itemPrice; 
     }
    else if (searchItem == "Shahi Paneer") { 
        itemPrice = 131.0; 
        return itemPrice; 
    }
    else if (searchItem == "Chole Masala") { 
        itemPrice = 120.0; 
        return itemPrice; 
    }
    else if (searchItem == "Methi Thepla") { 
        itemPrice = 80.0; 
        return itemPrice; 
    }
    else if (searchItem == "Palak Paneer") { 
        itemPrice = 136.0; 
        return itemPrice; 
    }
    else if (searchItem == "Aloo Gobi") { 
        itemPrice = 185.0; 
        return itemPrice; 
    }
    else if (searchItem == "Vegetable Korma") { 
        itemPrice = 187.0; 
        return itemPrice; 
    }
    else if (searchItem == "Rajma Chawal") { 
        itemPrice = 100.0; 
        return itemPrice; 
    }
    else if (searchItem == "Butter Chicken") { 
        itemPrice = 180.0; 
        return itemPrice; 
    }
    else if (searchItem == "Chicken Biryani") { 
        itemPrice = 168.0; 
        return itemPrice; 
    }
    else if (searchItem == "Chicken Korma") { 
        itemPrice = 180.0; 
        return itemPrice; 
    }
    else if (searchItem == "Mutton Rogan Josh") { 
        itemPrice = 250.0; 
        return itemPrice; 
    }
    else if (searchItem == "Tandoori Chicken") { 
        itemPrice = 155.0; 
        return itemPrice; 
    }
    else if (searchItem == "Chicken Tikka") { 
        itemPrice = 150.0; 
        return itemPrice; 
    }
    else if (searchItem == "Fish Curry") { 
        itemPrice = 200.0; 
        return itemPrice; 
    }
    else if (searchItem == "Mutton Seekh Kebab") { 
        itemPrice = 180.0; 
        return itemPrice; 
    }
    else if (searchItem == "Chicken Shawarma") { 
        itemPrice = 100.0; 
        return itemPrice; 
    }
    else if (searchItem == "Mutton Biryani") { 
        itemPrice = 200.0; 
        return itemPrice; 
    }
	else if (searchItem == "Vada Pav"){ 
        itemPrice = 40.0; 
        return itemPrice; }
    else 
        return itemPrice; 
}
	public static double priceWithQuantity(String searchItem,int quatiny){
		double itemPrice = takeOrders(searchItem);
		double totalPrice = itemPrice*quatiny;
		return totalPrice;
		
	}
}
