class Mixer{
 static boolean isSwitchedOn ;
 static int currentSpeed;
 static int maxSpeed = 3;
 static int minSpeed;
 public static boolean onOrOff(){
 
  if(isSwitchedOn == false){
     isSwitchedOn = true;
    System.out.println("Mixer is Switched On");}
	
	else{
	 isSwitchedOn = false;
	 System.out.println("Mixer is Switched Off");}
	 
	 return isSwitchedOn;
 }
 public static int increaseSpeed(){
  if(isSwitchedOn == true){
  
    if(currentSpeed<maxSpeed){
	    currentSpeed = currentSpeed+1;
		System.out.println("Current Speed of the Mixer is: "+currentSpeed);
		
		}else System.out.println("Mixer is reached MAX Speed");
  }else System.out.println("Please turn On the Mixer");
 
     return currentSpeed;
}
 public static int decreaseSpeed(){
   if(isSwitchedOn == true){
   
    if(currentSpeed>minSpeed){
	 currentSpeed = currentSpeed-1;
		System.out.println("Current Speed of the Fan is: "+currentSpeed);
	 }else System.out.println("Mixer is reached minSpeed");
	
   
   }else System.out.println("Please Switch On the Mixer");
 
     return currentSpeed;
 }
}