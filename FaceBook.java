class FaceBook{
 public static boolean logIn(String email,String passWord){
  boolean isEmail = false;
  boolean isPassWord = false;
  if(email != null && !email.isEmpty()&& passWord != null && passWord.length()>=8){
     isEmail = true;
  isPassWord = true;}
  else
   return isEmail;
  return isPassWord;
  
 }
 public static boolean logIn(long phoneNumber , String passWord){
  boolean isPhoneNumer = false;
  boolean isPassWord = false;
  if( phoneNumber>6000000000L && phoneNumber<=9999999999L && passWord != null && passWord.length()>=8){
     isPhoneNumer = true;
     isPassWord = true;}
   else
   return isPhoneNumer;
   return isPassWord;
  
 
 }
 
}