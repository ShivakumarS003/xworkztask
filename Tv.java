class Tv{
 static	String brand =	"Samsung";
static String refreshRate= "60 Hz";
static int price = 33999;

public static void main(String tv[]){
 //brand =	"Sony";
 //refreshRate= "40 Hz";
 //price = 25999;
TvDetails();
System.out.println("NAME OF THE BRAND: "+brand);
System.out.println("REFRESH RATE OF THE PRODUCT: "+refreshRate);
System.out.println("PRICE OF THE PRODUCT: "+price);

}
public static void TvDetails(){
	brand =	"Sony";
 refreshRate= "40 Hz";
 price = 25999;

}
}