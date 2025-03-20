class DrivingLicense{
public static String registrationStatus(String fullName,String fatherName,String dob,String panNUmber,String aadharNumber){
String message = null;
boolean isApplicantDetails = applicantDetails(fullName,fatherName,dob,panNUmber,aadharNumber);
if(isApplicantDetails == true)
 message = "Registration succusseful";
 else
 message = "Registration Unsuccessful";
 return message;

}


 public static boolean applicantDetails(String fullName,String fatherName,String dob,String panNUmber,String aadharNumber){

boolean isApplicantDetails = false;
 boolean isFullName = false;
 boolean isFatherName = false;
 boolean isDob = false;
 boolean isPanNUmber = false;
 boolean isAadharNumber = false;
 
 if(fullName!=null && fullName.length()>=3 && !fullName.isEmpty())
  isFullName= true;
  else
  System.out.println("Full Nmae is invalid. Please provide valid fullname");
 
 if(fatherName!=null && fatherName.length()>=3 && !fatherName.isEmpty())
  isFatherName= true;
  else
  System.out.println("father Name is invalid. Please provide valid fatherName");
 
 
 if(dob!=null && !dob.isEmpty())
 isDob = true;
 else
	 System.out.println("DOB is invalid .. Please provide valid dob");
 
 if(panNUmber!=null && panNUmber.length()==10 && !panNUmber.isEmpty())
 isPanNUmber = true;
 else
 System.out.println("pan number is invalud.. Please provide valid pan number");
 
 if(aadharNumber!=null && aadharNumber.length()==12  !aadharNumber.isEmpty())
 isAadharNumber = true;
 else
	 System.out.println("aadharNumber  is inavlid please provide valid aadharNumber");
 
 
 if(isFullName==true && isFatherName==true && isDob==true && isPanNUmber == true && isAadharNumber == true )
  isApplicantDetails = true;
  
  return isApplicantDetails;

 }}

