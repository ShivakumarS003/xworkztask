class Nykaa{
 public static String signUpStatus(String fullName,String phoneNumber,String address,String emailId,String gender){
 String message = null;
 boolean isUserDetails = validateData(fullName,phoneNumber,address,emailId,gender);
 if(isUserDetails == true)
  message = "SingUp Successful";
  else
  message = "SingUp Unsuccessful";
  
 return message;
}
 public static boolean validateData(String fullName,String phoneNumber,String address,String emailId,String gender){
 boolean isUserDetails = false;
 boolean isFullName = false;
 boolean isPhoneNumber =  false;
 boolean isAddress = false;
 boolean isEmailId = false;
 boolean isGender = false;
 
 if(fullName != null && fullName.length()>=0 && !fullName.isEmpty())
  isFullName = true;
  else{
  System.out.println("Full name is invalid.. Please provide the valid Full Name");}
 
 if(phoneNumber.length() > 0 && phoneNumber.length()==10 )
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
 
 if(gender!=null && (gender.equals("male") || gender.equals("female") || gender.equals("others")))
   isGender = true;
   else{
   System.out.println("gender is invalid. please provide the valid gender");}
 
 if(isFullName==true && isPhoneNumber==true && isAddress==true && isEmailId == true && isGender == true)
  isUserDetails = true;
 
 return isUserDetails;
 }
}