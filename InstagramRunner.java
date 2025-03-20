class InstagramRunner{
 public static void main(String insta[]){
  String userMsg1 = Instagram.logIn("   ","User@1234","sk_123");
  String userMsg2 = Instagram.logIn(7411012130L,"User@1234","sk_123");
  
  System.out.println(userMsg1);
  System.out.println(userMsg2);
  
 }

}