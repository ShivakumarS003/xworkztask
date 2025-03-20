class Shoes{
static	String brand = "Adidas";
static Boolean isWashable = true;
static int price = 1600;
public static void main(String sne[]){
 //brand = "Local";
 //isWashable = false;
 //price = 600;
 ShoesDetails();
System.out.println("NAME OF THE BRAND: "+brand);
System.out.println("IS IT WASHABLE: "+isWashable);
System.out.println("PRICE OF THE PRODUCT: "+price);
}
public static void ShoesDetails(){
	brand = "Local";
 isWashable = false;
 price = 600;
}

}