package com.xworkz.flipkartapp.flipkart;

import com.xworkz.flipkartapp.flipkartDto.FlipkartDto;

public class Flipkart{
    public FlipkartDto dto;

    public boolean beginRegistration(FlipkartDto dto){
        boolean isRegistered = false;
        boolean isValid = validateInfo(dto);

        if(isValid == true){
            isRegistered = true;
            System.out.println("Flipkart Registration Successful");
            this.dto = dto;
        }
        else{
            System.out.println("Flipkart Registration Failed");
        }

        return isRegistered;
    }

    public boolean validateInfo(FlipkartDto dto){
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isPass = false;
        boolean isConfirmPass = false;
        boolean isAddress = false;
        boolean isPin = false;
        boolean isOtp = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isName = true;
        }
        else System.out.println("Invalid Full Name");

        if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()){
            isMobile = true;
        }
        else System.out.println("Invalid Mobile Number");

        if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()){
            isEmail = true;
        }
        else System.out.println("Invalid Email");

        if(dto.getPassword() != null && !dto.getPassword().isEmpty()){
            isPass = true;
        }
        else System.out.println("Invalid Password");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())){
            isConfirmPass = true;
        }
        else System.out.println("Passwords do not match");

        if(dto.getDeliveryAddress() != null && !dto.getDeliveryAddress().isEmpty()){
            isAddress = true;
        }
        else System.out.println("Invalid Address");

        if(dto.getPinCode() != null && !dto.getPinCode().isEmpty()){
            isPin = true;
        }
        else System.out.println("Invalid Pin Code");



        if(isName && isMobile && isEmail && isPass && isConfirmPass && isAddress && isPin ){
            isValid = true;
        }

        return isValid;
    }
    public void getUserDetails(){
        System.out.println("User Full Name is " + this.dto.getFullName());
        System.out.println("User Mobile Number is " + this.dto.getMobileNumber());
        System.out.println("User Email ID is " + this.dto.getEmailId());
        System.out.println("Account Password is " + this.dto.getPassword());
        System.out.println("User Delivery Address is " + this.dto.getDeliveryAddress());
        System.out.println("User Pin Code is " + this.dto.getPinCode());

    }
}
