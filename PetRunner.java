class PetRunner{
public static void main(String petsDetails[]){

  Pet pet1 = new Pet();
	 pet1.id = 1;
	 pet1.name = "Charlie";
	 pet1.gender = "Male";
	 System.out.println("Id of pet1 is "+pet1.id);
	 System.out.println("Name of pet1 is "+pet1.name);
	 System.out.println("Gender of pet1 is "+pet1.gender);
	 
	 System.out.println();
	 
  Pet pet2 = new Pet(); 
	 pet2.id = 2;
	 pet2.name = "Gracie";
	 pet2.gender = "Female";
	 System.out.println("Id of pet2 is "+pet2.id);
	 System.out.println("Name of pet2 is "+pet2.name);
	 System.out.println("Gender of pet2 is "+pet2.gender);
	 
	 System.out.println();
	 
  Pet pet3 = new Pet();
      pet3.id = 3;
	 pet3.name = "Bruno";
	 pet3.gender = "Male";
	 System.out.println("Id of pet3 is "+pet3.id);
	 System.out.println("Name of pet3 is "+pet3.name);
	 System.out.println("Gender of pet3 is "+pet3.gender);
}
}