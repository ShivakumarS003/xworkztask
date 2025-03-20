class Projector{
 static boolean isConnected = false;
 static int currentVolume;
 static int minVolume;
 static int maxVolume = 100;
 
 
 public static boolean onOrOff(){
   if(isConnected == false ){
    isConnected = true;
   System.out.println("Projector is Switched On");}
	
	else{
	 isConnected = false;
	System.out.println("Projector is Switched Off");}
	 
	 return isConnected;
 }
 public static int increaseVol(){
  
  if(isConnected == true){
  
    if(currentVolume<maxVolume){
	  currentVolume = currentVolume+1;
	 System.out.println("currentVolume is : "+currentVolume);
	  
	  }else System.out.println("Max Volume Reached");
	 
  }else System.out.println("Switch on the Device");
  
   return currentVolume;
 }
 public static int decreaseVol(){
  
  if(isConnected == true){
  
    if(currentVolume>minVolume){
	  currentVolume = currentVolume-1;
	 System.out.println("currentVolume is : "+currentVolume);
	  
	  }else System.out.println("Min Volume Reached");
	 
  }else System.out.println("Switch on the Device");
  
   return currentVolume;
}
}