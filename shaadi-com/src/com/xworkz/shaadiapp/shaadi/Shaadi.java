package com.xworkz.shaadiapp.shaadi;

import com.xworkz.shaadiapp.shaadiclientdto.ShaadiClientDto;

public class Shaadi {
   public ShaadiClientDto dto;
     public boolean userRegistration(ShaadiClientDto dto){
        boolean isUserRegistered = false;
        boolean registered = validateDetails(dto);
        if(registered==true){
            isUserRegistered = true;
            this.dto = dto;
        }

        return isUserRegistered;
     }

     public boolean validateDetails(ShaadiClientDto dto){
        boolean isValid = false;
        boolean isId = false;
        boolean isName = false;
        boolean isGender = false;
        boolean isDob = false;
        boolean isPhoneNumber = false;
        boolean isReligion = false;

        if(dto.getId()>0){
            isId = true;
        }
        if(dto.getName()!=null){
            isName =true;
        }
        if(dto.getDob()!=null){
            isDob = true;
        }
        if(dto.getGender()!=null){
            isGender=true;
        }
        if(dto.getPhoneNumber()>6000000000L){
            isPhoneNumber=true;
        }
        if(dto.getReligion()!=null){
            isReligion=true;
        }
        if(isId && isName && isDob && isGender && isPhoneNumber && isReligion){
            isValid=true;
        }
        return isValid;
     }
     public void getUserDetails(){
         System.out.println("ID is " + this.dto.getId());
         System.out.println("Name is " + this.dto.getName());
         System.out.println("Date of Birth is " + this.dto.getDob());
         System.out.println("Gender is " + this.dto.getGender());
         System.out.println("Phone Number is " + this.dto.getPhoneNumber());
         System.out.println("Religion is " + this.dto.getReligion());

     }
}
