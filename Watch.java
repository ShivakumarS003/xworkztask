class Watch{
	static String brand = "Boat";
static String colour = "Black";
static int price = 1999;
public static void main(String watch[]){
 //brand = "Noise";
 //colour = "Silver";
 //price = 1599;
 WatchDetails();
System.out.println("NAME OF THE BRAND: "+brand);
System.out.println("PRODUCT COLOUR: "+colour);
System.out.println("PRICE: "+price);
}
public static void WatchDetails(){
	brand = "Noise";
 colour = "Silver";
 price = 1599;
}
}