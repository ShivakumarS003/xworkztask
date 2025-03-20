class AmazonRunner{

  public static void main(String ama[]){
  
   Amazon ref = new Amazon();
    ref.id = 1;
	ref.yourName = "Baba";
	ref.phoneNumber = 7894562139L;
	ref.passWord = "Baba@124";
	System.out.println("The Account Id is "+ref.id);
	System.out.println("The Account Name is "+ref.yourName);
	System.out.println("The Account Holder Phone Number is "+ref.phoneNumber);
	System.out.println("The Account Password is "+ref.passWord);
	
	System.out.println();
	
	Amazon anotherRef = new Amazon();
	  anotherRef.id = 2;
	  anotherRef.yourName = "Babu";
	  anotherRef.phoneNumber = 8794563215L;
	  anotherRef.passWord = "Babu@754";
	  System.out.println("The Account Id is "+anotherRef.id);
	System.out.println("The Account Name is "+anotherRef.yourName);
	System.out.println("The Account Holder Phone Number is "+anotherRef.phoneNumber);
	System.out.println("The Account Password is "+anotherRef.passWord);
	
  
  }
}