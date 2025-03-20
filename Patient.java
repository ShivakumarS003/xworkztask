
1... INSTANCE VARIABLE : DECLARED WITHIN THE OPENING AND CLOSING BARCES OF CLASS AND BEFORE THE MAIN METHOD WITHOUT USING STATIC KEYWORD

class Patient{
int patientId;
 String patientName;
public static void main(String args[]){
System.out.println("The patient ID is "+patientId);
System.out.println("Thepatient Name is "+patientName)
}}





REASON: The error you're encountering is due to the fact that you're trying 
        to access the instance variables patientId and patientName from a static 
		method (main method). Instance variables belong to specific objects (instances) of the class, 
		whereas the main method is a static method that does not belong to any particular object.
		
MEANING: you can't directly access non-static instance variables (like patientId and patientName) 
         inside a static context without creating an instance of the class. ( USAGE IS SHOWN IN NEXT SLIDE)
    
// INSTANCEVARIABLE ARE DISCUSSED LATER IN OBJECTS CREATION (USING KEYWORD "NEW") 



