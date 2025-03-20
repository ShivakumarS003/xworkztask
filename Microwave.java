class Microwave{
	static boolean isMwPower = false;
	static int currentTemp;
	static int maxTemp =100;
	static int minTemp;
public static boolean onOrOff(){
 if(isMwPower == false){
 isMwPower = true;
   System.out.println("Device is Switched On");}
 
   else {
   isMwPower = false;
   System.out.println("Device is Switched Off");}
    
	return isMwPower;
}
public static int increaseTemp(){
	if(isMwPower == true){
		
		 if(currentTemp<maxTemp ){
			   currentTemp = currentTemp+1;
	 System.out.println("currentTemperature is : "+currentTemp);
			   
			   }else System.out.println(" Microwave is at Max Temparature ");
		   
		   }else System.out.println("Please Turn on the Microwave");
	
	return currentTemp;
	
}
public static int decreaseTemp(){
	if(isMwPower ==true){
		
	if(currentTemp>minTemp){
		currentTemp = currentTemp-1;
	 System.out.println("currentTemperature is : "+currentTemp);
		
	}else System.out.println("minimun temparature Reached");
	}else System.out.println("Please Turn on the Microwave");
	
  return currentTemp;	
	 
	}	
}


