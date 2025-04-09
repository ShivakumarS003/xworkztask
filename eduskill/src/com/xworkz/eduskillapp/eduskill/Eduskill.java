package com.xworkz.eduskillapp.eduskill;

import com.xworkz.eduskillapp.eduskilldto.EduskillStudentDto;

public class Eduskill {
    public EduskillStudentDto dto;

    public boolean studentLogIn(EduskillStudentDto dto){
        boolean isStudentLogIn = false;

        boolean registered = validateDetails(dto);
        if(registered==true){
            isStudentLogIn=true;
            this.dto = dto;
        }

        return isStudentLogIn;
    }

    public boolean validateDetails(EduskillStudentDto dto){
       boolean  isValidateDetails = false;

       boolean isStudentId = false;
       boolean isStudentName = false;
       boolean isGender = false;
       boolean isUsn = false;
       boolean isPhoneNumber = false;
       boolean isEmail = false;

       if(dto.getStudentId() > 0){
           isStudentId=true;
       } else System.out.println("Invalid StudentId");

       if(dto.getStudentName()!=null && !dto.getStudentName().isEmpty()){
           isStudentName = true;
       } else System.out.println("Invalid Student Name");

       if(dto.getUsn()!=null && !dto.getUsn().isEmpty()){
           isUsn= true;
       } else System.out.println("Invalid USN");

       if(dto.getGender()!=null &&  !dto.getGender().isEmpty()){
           isGender= true;
       }else System.out.println("Invalid Gender");

       if(dto.getPhoneNumber()>6000000000L && dto.getPhoneNumber()<=9999999999L){
           isPhoneNumber=true;
       }else System.out.println("Invalid Phone Number");

       if (dto.getEmail()!=null && !dto.getEmail().isEmpty()){
           isEmail=true;
       }else System.out.println("Invalid Email");

       if(isStudentId && isStudentName && isUsn && isGender && isPhoneNumber && isEmail){
           isValidateDetails= true;
       }

       return isValidateDetails;
    }
    public void getStudentDetails(){
        System.out.println("Student ID is " + this.dto.getStudentId());
        System.out.println("Student Name is " + this.dto.getStudentName());
        System.out.println("USN is " + this.dto.getUsn());
        System.out.println("Gender is " + this.dto.getGender());
        System.out.println("Phone Number is " + this.dto.getPhoneNumber());
        System.out.println("Email ID is " + this.dto.getEmail());

    }
}
