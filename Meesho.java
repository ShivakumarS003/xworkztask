class Meesho{
public static String signUpStatus(String firstName,String lastName,String phoneNumber,String gender,String emailId){
String message = null;
boolean isUserDetails = validateDetails(firstName,lastName,phoneNumber,gender,emailId);
if(isUserDetails == true)
 message = "SignIn successful";
 else
 message = "SignIn unsuccessful";

return message;

}
public static boolean validateDetails(String firstName,String lastName,String phoneNumber,String gender,String emailId){
 
 boolean isUserDetails = false;
 boolean isFirstName = false;
 boolean isLastName = false;
 boolean isPhoneNumber = false;
 boolean isGender = false;
 boolean isEmailId = false;

 if(firstName != null && firstName.length()>=3 && !firstName.isEmpty())
  isFirstName = true;
  else{
  System.out.println("First name is invalid.. Please provide the valid First Name");}
  
  if(lastName != null && lastName.length()>=3 && !lastName.isEmailId())
  isLastName = true;
  else{
  System.out.println("Last name is invalid.. Please provide the valid Last Name");}
 
  if(phoneNumber.length() > 0 && phoneNumber.length()==10)
  isPhoneNumber = true;
  else{
  System.out.println("Phone Number is Invalid.. Please provide Phone Number");}
 
 if(gender!=null && (gender.equals("male") || gender.equals("female") || gender.equals("others")))
   isGender = true;
   else{
   System.out.println("gender is invalid. please provide the valid gender");}
 
  if(emailId != null && !emailId.isEmpty())
 isEmailId = true;
 else{
 System.out.println("Eamil id is Invalid.. Please provide valid Email");}
 
 if(isFirstName==true && isLastName == true && isPhoneNumber == true && isGender==true && isEmailId == true)
  isUserDetails = true;
 
 return isUserDetails;
}

}