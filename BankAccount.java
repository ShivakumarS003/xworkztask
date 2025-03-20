class BankAccount{
  static double balance ;
  
  public static void credit(double Amount){
  System.out.println("credit started");
  if(Amount>0.0)
  balance = balance + Amount;
  else
  System.out.println("Ivalid amount");
  System.out.println("credit ended");
  }

 public static void debit(double Amount){
 System.out.println("debit started");
  if (Amount <= balance)
  balance = balance - Amount;
  else
  System.out.println("Insufficient Balance");
  System.out.println("debit ended");
 }
 public static void getBalance(){
      System.out.println("Available balance is "+balance);
 }
}