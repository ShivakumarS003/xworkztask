class InsuranceProviderrunner{
public static void main(String life[]){

double insurancePrice = InsuranceProvider.searchInsurancePlans("SBI");
if(insurancePrice != 0.0)
	
System.out.println("term plan is "+insurancePrice);
else
	System.out.print("");

}
}