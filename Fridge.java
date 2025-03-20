class Fridge{
	static boolean isPower = false;
	static int currentTemp ;
	static int maxTemp = 5;
	static int minTemp = -18;
public static boolean onOrOff(){
 if(isPower == false){
 isPower = true;
 System.out.println("Fridge turned On");}
   
   else{
   isPower = false;
 System.out.println("Fridge turned Off");}
   
	
	return isPower;

}
public static int increaseTemp(){
	if(isPower == true){
		
		 if(currentTemp<maxTemp ){
			   currentTemp = currentTemp+1;
	 System.out.println("currentTemperature is : "+currentTemp);
			   
		   }else System.out.println(" Fridge at Max Temparature ");
		   
		   }else System.out.println("Please Turn on the Fridge");
	
	return currentTemp;
	
}
public static int decreaseTemp(){
	if(isPower ==true){
		
	if(currentTemp>minTemp){
		currentTemp = currentTemp-1;
	 System.out.println("currentTemperature is : "+currentTemp);
		
	}else System.out.println("minimun temparature Reached");
	}else System.out.println("Please Turn on the Fridge");
	
  return currentTemp;	
	 
	}
	
}

