class Oven{
 static	String brand = "Samsung";
static String color = "Black";
static int price = 10000;
public static void main(String ov[]){
 //brand = "LG";
 //color = "Silver";
 //price = 13000;
ovenDetails();
System.out.println("NAME OF THE PRODUCT: "+brand);
System.out.println("COLOUR OF THE PRODUCT: "+color);
System.out.println("PRICE OF THE PRODUCT: "+price);
}
public static void ovenDetails(){
	 brand = "LG";
 color = "Silver";
 price = 13000;
}
}