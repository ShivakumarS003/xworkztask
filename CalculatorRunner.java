class CalculatorRunner{
public static void main(String ad[]){
 int number1 = 44;
 int number2 = 68;
  int addFinalResult = Calculator.add(number1,number2);
System.out.println("The addition of"+number1+" and "+number2+" is: "+addFinalResult);
 
 int subFinalResult = Calculator.subtract(number1,number2);
System.out.println("The Subtraction of "+number1+" and "+number2+" is: "+subFinalResult);
 
 int mulFinalResult = Calculator.multiplication(number1,number2);
 System.out.println("The multiplication of "+number1+" and "+number2+" is: "+mulFinalResult);

 double divFinalResult = Calculator.division(number1,number2);
 System.out.println("The division of "+number1+" and "+number2+" is: "+divFinalResult);

 int modFinalResult =  Calculator.modulus(number1,number2);
 System.out.println("The Modulus of "+number1+" and "+number2+" is: "+modFinalResult);
}
}