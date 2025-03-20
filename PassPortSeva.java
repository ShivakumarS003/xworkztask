class PassPortSeva{
public static String registrationStatus(String cpvLocation,String givenName,String surName,String dob,
                                         String email,boolean EmailLoginSame,String loginId,
										 String pwd,String confirmPwd,String hintQuestion,String hintAns,
										 String captcha){
 String message = null;
 boolean isUserDetails = validateData(cpvLocation,givenName,surName,dob,email,EmailLoginSame,loginId,pwd,confirmPwd,hintQuestion,hintAns,captcha);
 if(isUserDetails == true)
	 message = "Registration Successful";
 else
	 message = "Registration Unsuccessful";
 
 return message;
}

public static boolean validateData(String cpvLocation,String givenName,String surName,String dob,String email,boolean EmailLoginSame,String loginId,String pwd,String confirmPwd,String hintQuestion,String hintAns,String captcha){
 
 boolean isUserDetails = false;
 boolean isCpvLocation = false;
 boolean isGivenName = false;
 boolean isSurName = false;
 boolean isDob = false;
 boolean isEmailid = false;
 boolean isEmailLoginSame = false;
 boolean isLoginId = false;
 boolean isPwd   = false;
 boolean isConfirmPwd = false;
 boolean isHintQuestion = false;
 boolean isHintAns = false;
 boolean isCaptcha = false;
 
 if (cpvLocation != null && (cpvLocation.equals("Delhi") || cpvLocation.equals("PassPort Office"))) {
 isCpvLocation = true;}
 
  else
  System.out.println("Please provide the valid cpvLocation ");
  
  if(givenName != null && givenName.length()>=3 && !givenName.isEmpty())
  isGivenName = true;
  else
  System.out.println("Please provide the Valid Given Name");
  
  if(surName!=null && !surName.isEmpty())
  isSurName = true;
  else
  System.out.println("Please provide the Valid Sur Name");
   
   if(dob!=null && !dob.isEmpty())
   isDob = true;
   else
   System.out.println("Please provide the valid DOb");
   
   if(email != null && !email.isEmpty())
   isEmailid = true;
   else
   System.out.println("please provide the valid email");
   
   if(EmailLoginSame == true)
	 isEmailLoginSame= true;
	  else if(loginId!=null && !loginId.isEmpty())
		  isLoginId=true;
	  else
		  System.out.println("Please enter valid LoginId");
 
   
   if(pwd!=null && pwd.length()== 8)
        isPwd = true;
   else{
   System.out.println("please set the password");
   }
   
   if(confirmPwd != null && confirmPwd.equals(pwd))
   isConfirmPwd = true;
   else System.out.println("Confirm password");
   
   if(hintQuestion!=null)
   isHintQuestion = true;
   else
   System.out.println("please select the hint quetion");
   
   if(hintAns != null)
        isHintAns = true;
   else
   System.out.println("please enter the Hint answer");
   
   if(captcha != null)
        isCaptcha = true;
	else
	System.out.println("Please enter the captcha");

if(isCpvLocation == true && isGivenName == true && isSurName == true && isDob == true && 
isEmailid == true && isEmailLoginSame == true && isLoginId ==true && isPwd == true 
&& isConfirmPwd == true && isHintQuestion == true && isHintAns == true && isCaptcha == true)
   isUserDetails = true;

 return isUserDetails;
   
 }
}