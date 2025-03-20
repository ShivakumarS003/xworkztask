class Instagram{
public static String logIn(String email , String passWord,String userName){
   String msg = null;
   if(email != null && !email.isEmpty()&& passWord != null && passWord.length()>=8 && userName!=null)
      System.out.println( "Login Successful");
   else
            System.out.println( "Login unSuccessful");

	  
	  return msg;
}
public static String logIn(long phoneNumber , String passWord ,String userName){
   String msg = null;
  if( phoneNumber>6000000000L && passWord != null && passWord.length()>=8  && userName!=null)
           System.out.println( "Login Successful");

  else
                  System.out.println( "Login unSuccessful");

	  
	  return msg;
     
}
}