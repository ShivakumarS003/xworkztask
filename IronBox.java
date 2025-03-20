class IronBox{
	static boolean isConnected = false;
	static int currentTemp=100 ;
	static int maxTemp =150;
	static int minTemp = 100;
public static boolean onOrOff(){
 if(isConnected == false){
 isConnected = true;
 System.out.println("IronBox turned On");}
   
   else{
   isConnected = false;
 System.out.println("IronBox turned Off");}
   
	
	return isConnected;

}
public static int increaseTemp(){
	if(isConnected == true){
		
		 if(currentTemp<maxTemp ){
			   currentTemp = currentTemp+5;
	 System.out.println("currentTemperature is : "+currentTemp);
			   
		   }else System.out.println(" IronBox is at Max Temparature ");
		   
		   }else System.out.println("Please Turn on the IronBox");
	
	return currentTemp;
	
}
public static int decreaseTemp(){
	if(isConnected ==true){
		
	if(currentTemp>minTemp){
		currentTemp = currentTemp-5;
	 System.out.println("currentTemperature is : "+currentTemp);
		
	}else System.out.println("minimun temparature Reached");
	}else System.out.println("Please Turn on the IronBox");
	
  return currentTemp;	
	 
	}
	
}

