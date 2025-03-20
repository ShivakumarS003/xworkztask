class MaxData{

public static String signUp(String firstName,String lastName,String phoneNumber,String dob,String emailId,String gender){
 String message = null;
 
 boolean userValidate = validateData(firstName,lastName,phoneNumber,dob,emailId,gender);
  if (userValidate == true)
   message="SignUp Suceesfull";
  else
  message="SignUp Unsucessfull";
   return message;
}

public static boolean validateData(String firstName,String lastName,String phoneNumber,String dob,String emailId,String gender){
 boolean userValidate = false;
 boolean isFirstName = false;
 boolean isLastName = false;
 boolean isPhoneNumber = false;
 boolean isDob = false;
 boolean isEmailId = false;
 boolean isGender  = false;
 
 if(firstName != null && firstName.length()>=3)
   isFirstName = true;
   else{
   System.out.println("FisrtName is invalid..  Please Provide the valid FirstName");}

 if(lastName != null && lastName.length() >= 1)
 isLastName = true;
 else{
  System.out.println("LAstName is invalid..Please provide the valid LastName");} 

  if(phoneNumber.length()>0 && phoneNumber.length() == 10)
  isPhoneNumber = true;
  else{
  System.out.println("Phone Number is invalid..Please provide the Valid Phone Number");}

 if(dob!=null)
 isDob =  true;
 else{
 System.out.println("Please provide Valid Dob");}

 if(emailId!=null)
 isEmailId = true;
 else{
 System.out.println("Please Provide the Valid Email");}

 if(gender != null)
 isGender= true;
 else{
 System.out.println("Please provide the gender");}

if(isFirstName==true && isLastName == true && isPhoneNumber == true && isDob == true && isEmailId==true && isGender == true)
  userValidate = true;
  
  return userValidate;
}
}