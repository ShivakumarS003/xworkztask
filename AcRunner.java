class AcRunner{
public static void main(String ac[]){

boolean ref = Ac.onOrOff("on");
int incTemp = Ac.increaseTemp();

int decTemp = Ac.decreaseTemp();

System.out.println(ref);
System.out.println("current Temparature is : "+ incTemp);
System.out.println("current Temparature is : "+ decTemp);

}

}