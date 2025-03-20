class Ac{
public static boolean onOrOff(String button){
  String msg = null;
 isAcPower = false;
 if(botton =="on"){
   isAcPower = true;
   msg = "Connected";
   
   else if(button == "Off"){
    isAcPower = true;
	msg = "Disconnected";}
	
	else
	msg = "Invalid Command";
	
   return isAcPower;
   
 

}
}