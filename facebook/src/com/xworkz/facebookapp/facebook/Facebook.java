package com.xworkz.facebookapp.facebook;

import com.xworkz.facebookapp.facebookDto.FacebookDto;

public class Facebook {
    public FacebookDto dto;
    public boolean registerUser(FacebookDto dto){
        boolean isRegistered = false;
        boolean isValid = validateUser(dto);

        if(isValid == true){
            isRegistered = true;
            this.dto = dto;
            System.out.println("Facebook Registration Successful");
        }
        else{
            System.out.println("Facebook Registration Failed");
        }

        return isRegistered;
    }

    public boolean validateUser(FacebookDto dto){
        boolean isValidUser = false;

        boolean isFirstName = false;
        boolean isLastName = false;
        boolean isMobileOrEmail = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;
        boolean isBirthDate = false;
        boolean isGender = false;

        if(dto.getFirstName() != null && !dto.getFirstName().isEmpty()){
            isFirstName = true;
        }
        else System.out.println("Invalid First Name");

        if(dto.getLastName() != null && !dto.getLastName().isEmpty()){
            isLastName = true;
        }
        else System.out.println("Invalid Last Name");

        if(dto.getMobileOrEmail() != null && !dto.getMobileOrEmail().isEmpty()){
            isMobileOrEmail = true;
        }
        else System.out.println("Invalid Mobile or Email");

        if(dto.getNewPassword() != null && !dto.getNewPassword().isEmpty()){
            isPassword = true;
        }
        else System.out.println("Invalid Password");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getNewPassword())){
            isConfirmPassword = true;
        }
        else System.out.println("Confirm Password doesn't match");

        if(dto.getBirthDate() != null && !dto.getBirthDate().isEmpty()){
            isBirthDate = true;
        }
        else System.out.println("Invalid Birth Date");

        if(dto.getGender() != null && !dto.getGender().isEmpty()){
            isGender = true;
        }
        else System.out.println("Invalid Gender");

        if(isFirstName && isLastName && isMobileOrEmail && isPassword && isConfirmPassword && isBirthDate && isGender){
            isValidUser = true;
        }

        return isValidUser;
    }
    private String firstName;
    private String lastName;
    private String mobileOrEmail;
    private String newPassword;
    private String confirmPassword;
    private String birthDate;
    private String gender;

    public void getUserDetails(){
        System.out.println("User First Name is "+this.dto.getFirstName());
        System.out.println("User Last Name is "+this.dto.getLastName());
        System.out.println("User MobileOrEmail is "+this.dto.getMobileOrEmail());
        System.out.println("User Password is "+this.dto.getNewPassword());
        System.out.println("User DOB is "+this.dto.getBirthDate());
        System.out.println("User gender is "+this.dto.getGender());
    }
}
