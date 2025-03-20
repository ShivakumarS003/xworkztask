class SnapDeal{
 public static String loginStatus(String fullName,String phoneNumber,String address,String emailId,String passWord){
 String message = null;
 boolean isUserDetails = validateDetails(fullName,phoneNumber,address,emailId,passWord);
 if(isUserDetails == true)
  message = "Login Successful";
  else
  message = "Login Unsuccessful";
  
 return message;
}
 public static boolean validateDetails(String fullName,String phoneNumber,String address,String emailId,String passWord){
 boolean isUserDetails = false;
 boolean isFullName = false;
 boolean isPhoneNumber =  false;
 boolean isAddress = false;
 boolean isEmailId = false;
 boolean isPassWord = false;
 
 if(fullName != null && fullName.length()>=0 && !fullName.isEmpty())
  isFullName = true;
  else{
  System.out.println("Full name is invalid.. Please provide the valid Full Name");}
 
 if(phoneNumber.length() > 0 && phoneNumber.length()==10)
  isPhoneNumber = true;
  else{
  System.out.println("Phone Number is Invalid.. Please provide Phone Number");}
 
 if(address != null && address.length()>10 && !address.isEmpty())
 isAddress =  true;
 else{
 System.out.println("Address is invalid.. Please provide Valid Address");}
 
 if(emailId != null && !emailId.isEmpty())
 isEmailId = true;
 else{
 System.out.println("Eamil id is Invalid.. Please provide valid Email");}
 
 if(passWord != null && passWord.length()>=8)
 isPassWord = true;
 else{
 System.out.println("Password is invalid .. Please provide valid password");}
 
 if(isFullName==true && isPhoneNumber==true && isAddress==true && isEmailId == true && isPassWord == true)
  isUserDetails = true;
 
 return isUserDetails;
 }
}