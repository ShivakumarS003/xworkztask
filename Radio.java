class Radio{
 static boolean isConnected;
 static double currentChannelNo = 90.0;
 static double minChannelNo = 90.0;
 static double maxChannelNo = 108.0;
 public static boolean onOrOff(){
  if(isConnected == false){
  isConnected = true;
  System.out.println("Radio is turned on");}
  
   else{
   isConnected = false;
   System.out.println("Radio is turned Off");}
  
  return isConnected;
 }
 public static double increaseChannelNo(){
  if(isConnected == true){
    if(currentChannelNo<maxChannelNo){
	currentChannelNo = currentChannelNo+0.1;
	
	System.out.println("Current Channel Number is :"+currentChannelNo);
	
	}else System.out.println("Max Channel Number reached");
  
  }else System.out.println("Turn on the Radio");
    return currentChannelNo;
 }
  public static double decreaseChannelNo(){
  if(isConnected == true){
    if(currentChannelNo>minChannelNo){
	currentChannelNo = currentChannelNo-0.1;
	System.out.println("Current Channel Number is :"+currentChannelNo);
	
	}else System.out.println("Min Channel Number reached");
  
  }else System.out.println("Turn on the Radio");
 
    return currentChannelNo;
   
 }
}