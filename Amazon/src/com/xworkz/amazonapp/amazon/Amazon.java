package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.amazonDto.AmazonDto;

public class Amazon {
    public AmazonDto dto;
    public boolean processRegistration(AmazonDto dto){
        boolean isRegistered = false;
        boolean detailsValid = checkDetails(dto);

        if(detailsValid == true){
            isRegistered = true;
            this.dto = dto;
            System.out.println("Amazon Registration Successful");
        }
        else{
            System.out.println("Amazon Registration Failed");
        }

        return isRegistered;
    }

    public boolean checkDetails(AmazonDto dto){
        boolean isValid = false;

        boolean isUserName = false;
        boolean isMobileOrEmail = false;
        boolean isPassword = false;
        boolean isRetypePassword = false;
        boolean isAddress = false;
        boolean isCountry = false;
        boolean isOtp = false;

        if(dto.getUserName() != null && !dto.getUserName().isEmpty()){
            isUserName = true;
        }
        else System.out.println("Invalid User Name");

        if(dto.getMobileNumberOrEmail() != null && !dto.getMobileNumberOrEmail().isEmpty()){
            isMobileOrEmail = true;
        }
        else System.out.println("Invalid Mobile or Email");

        if(dto.getCreatePassword() != null && !dto.getCreatePassword().isEmpty()){
            isPassword = true;
        }
        else System.out.println("Invalid Password");

        if(dto.getRetypePassword() != null && dto.getRetypePassword().equals(dto.getCreatePassword())){
            isRetypePassword = true;
        }
        else System.out.println("Password does not match");

        if(dto.getAddress() != null && !dto.getAddress().isEmpty()){
            isAddress = true;
        }
        else System.out.println("Invalid Address");

        if(dto.getCountry() != null && !dto.getCountry().isEmpty()){
            isCountry = true;
        }
        else System.out.println("Invalid Country");



        if(isUserName && isMobileOrEmail && isPassword && isRetypePassword && isAddress && isCountry ){
            isValid = true;
        }

        return isValid;
    }
    public void getUserDetails(){
        System.out.println("User Name is " + this.dto.getUserName());
        System.out.println("User Mobile or Email is " + this.dto.getMobileNumberOrEmail());
        System.out.println("Account Password is " + this.dto.getCreatePassword());
        System.out.println("User Address is " + this.dto.getAddress());
        System.out.println("User Country is " + this.dto.getCountry());

    }
}
