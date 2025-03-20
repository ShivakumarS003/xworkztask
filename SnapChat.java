class SnapChat{
public static String logIn(String email , String passWord){
 String msg = null;
   if(email != null && !email.isEmpty()&& passWord != null && passWord.length()>=8)
      msg = "Login Successful";
   else
      msg = "Login Unsuccessful";
	  
	  return msg;
}
public static String logIn(long phoneNumber , String passWord){
 String msg = null;
  if( phoneNumber>6000000000L && passWord != null && passWord.length()>=8)
     msg = "Login Successful";
  else
      msg = "Login Unsuccessful";
	  
	  return msg;
     
}
}