class FaceBookRunner{
public static void main(String face[]){

  boolean userMsg = FaceBook.logIn("sk@gmail.com","user@1234");
  boolean userMsg2 = FaceBook.logIn(7411012130L,"user@1234");
  if(userMsg == true)
	  System.out.println("LogIn successful");
  else if (userMsg2 == true)
	  System.out.println("LogIn Successful");
  else
	  System.out.println("LogIn Unsuccessful");
 
  
}
}