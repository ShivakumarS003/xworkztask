class Ac{
	static boolean isAcPower = false;
	static int currentTemp ;
	static int maxTemp = 6;
	static int minTemp;
public static boolean onOrOff(String button){
 if(button =="on"){
 isAcPower = true;}
   
   else if(button == "Off"){
   isAcPower = true;}
	
	else
		System.out.println("Invalid commamd");
	return isAcPower;

}
public static int increaseTemp(){
	if(isAcPower == true){
		
		 if(currentTemp<maxTemp ){
			   currentTemp = currentTemp+1;
			   
		   }else System.out.println(" Ac at Max Temparature ");
		   
		   }else System.out.println("Please Turn on the Ac");
	
	return currentTemp;
	
}
public static int decreaseTemp(){
	if(isAcPower ==true){
		
	if(currentTemp>minTemp){
		currentTemp = currentTemp-1;
	}else System.out.println("minimun temparature Reached");
	}else System.out.println("Please Turn on the Ac");
	
  return currentTemp;	
	 
	}
	
}

