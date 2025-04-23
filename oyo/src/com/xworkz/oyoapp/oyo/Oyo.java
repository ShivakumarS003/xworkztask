package com.xworkz.oyoapp.oyo;

import com.xworkz.oyoapp.oyoDto.OyoDto;

public class Oyo {
    public OyoDto dto;
        public boolean registerCustomer(OyoDto dto) {
            boolean isRegistered = false;
            boolean isValid = validateDetails(dto);

            if(isValid == true) {
                isRegistered = true;
                this.dto = dto;
                System.out.println("OYO Registration Successful");
            } else {
                System.out.println("OYO Registration Failed");
            }

            return isRegistered;
        }

        public boolean validateDetails(OyoDto dto) {
            boolean isValid = false;

            boolean isName = false;
            boolean isMobile = false;
            boolean isEmail = false;
            boolean isPassword = false;
            boolean isConfirm = false;

            if(dto.getFullName() != null && !dto.getFullName().isEmpty()) {
                isName = true;
            } else System.out.println("Invalid Full Name");

            if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
                isMobile = true;
            } else System.out.println("Invalid Mobile Number");

            if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
                isEmail = true;
            } else System.out.println("Invalid Email ID");

            if(dto.getPassword() != null) {
                isPassword = true;
            } else System.out.println("Password Cannot be Null");

            if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
                isConfirm = true;
            } else System.out.println("Confirm Password should match Password");

            if(isName && isMobile && isEmail && isPassword && isConfirm) {
                isValid = true;
            }

            return isValid;
        }
        public void getCustomerDetails(){
            System.out.println("User Full Name is " + this.dto.getFullName());
            System.out.println("User Mobile Number is " + this.dto.getMobileNumber());
            System.out.println("User Email ID is " + this.dto.getEmailId());
            System.out.println("Account Password is " + this.dto.getPassword());

        }
    }


