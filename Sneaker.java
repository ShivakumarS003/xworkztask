class Sneaker{
static 	String brand = "Puma";
static String washType = "Machine washable";
static int price = 1800;
public static void main(String sne[]){
 //brand = "Fila";
// washType = "Hand washable";
 //price = 1600;
 SneakerDetails();
System.out.println("NAME OF THE BRAND: "+brand);
System.out.println("TYPE OF THE WASH: "+washType);
System.out.println("PRICE OF THE PRODUCT: "+price);
}
public static void SneakerDetails(){
	brand = "Fila";
 washType = "Hand washable";
 price = 1600;
}
}