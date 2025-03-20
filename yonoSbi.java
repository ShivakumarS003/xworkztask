class yonoSbi{
 public static String signUpStatus(String fullName,String dob,String ifscCode,String accountNo,String passWord,String confirmPassword){
 String message = null;
 boolean isCustomerDetails = validateUserDetails(fullName,dob,ifscCode,accountNo,passWord,confirmPassword);
 if(isCustomerDetails == true)
  message = "SignUp Successful";
  else
	  message = "SignUp Unsuccessful";
 return message;
 
 }
 public static boolean validateUserDetails(String fullName,String dob,String ifscCode,String accountNo,String passWord,String confirmPassword){
 boolean isCustomerDetails = false;
 boolean isFullName = false;
 boolean isDob = false;
 boolean isIfscCode = false;
 boolean isAccountNo = false;
 boolean isPassWord = false;
 boolean isConfirmPassword = false;
 
 if(fullName!=null && fullName.length()>=3 && !fullName.isEmpty())
  isFullName= true;
  else
  System.out.println("Full Nmae is invalid. Please provide valid fullname");
 
 if(dob!=null)
 isDob = true;
 else
	 System.out.println("DOB is invalid .. Please provide valid dob");
 
 if(ifscCode!=null && ifscCode.length()==11 && !ifscCode.isEmpty())
 isIfscCode = true;
 else
 System.out.println("ifsc code is invalud.. Please provide valid ifsc code");
 
 if(accountNo!=null && accountNo.length()==12 && !accountNo.isEmpty())
 isAccountNo = true;
 else
	 System.out.println("account number is inavlid please provide valid account number");
 
 if(passWord != null && passWord.length()>=8 && !passWord.isEmpty())
 isPassWord = true;
 else{
 System.out.println("Password is invalid .. Please provide valid password");}
 
 if(confirmPassword.equals(passWord))
	 isConfirmPassword = true;
 else
	 	 System.out.println("Confirm Password should be same as password");

 
 if(isFullName==true && isDob==true && isIfscCode == true && isAccountNo == true && isPassWord == true && isConfirmPassword==true)
  isCustomerDetails = true;
  
  return isCustomerDetails;
 
 
 
 }
}