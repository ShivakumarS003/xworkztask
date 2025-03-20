class InsuranceProvider{

public static double searchInsurancePlans(String insuranceName){
 double insurancePrice = 0.0;
 if(insuranceName == "ICICI prudential Life Insurance"){
 insurancePrice = 8664.15;}
	
 else if(insuranceName == "LIC"){
 insurancePrice = 7214.00;}
 
else if(insuranceName == "PolicyBazar.com"){
insurancePrice = 7254.00;}
 
 else if(insuranceName == "Max Life Insurance"){
 insurancePrice = 8546.00;	}

else if(insuranceName == "Bajaj Life Insurance"){
  insurancePrice =8450.00;}

else if(insuranceName == "TATA AIA Life Insurance"){
insurancePrice = 9540.00;}
		
else if(insuranceName == "HDFC life Insurance"){
insurancePrice = 8500;}
	
else if(insuranceName == "Kotak Life Insurance"){
insurancePrice = 7800.00;}
	
else if(insuranceName == "Groww Life Insurance"){
insurancePrice = 8199.00;}
	
else if(insuranceName == "Canara Life Insurance"){
insurancePrice = 8600.00;}
 
 else  
 System.out.println(insuranceName+" is not found..");

 
	return insurancePrice;
}

}