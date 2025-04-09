package com.xworkz.jiohotstarapp.jiohotstar;

import com.xworkz.jiohotstarapp.jiohotstarDto.JioHotstarDto;

public class JioHotstar {
    public JioHotstarDto dto;
    public boolean registerAccount(JioHotstarDto dto) {
        boolean isRegistered = false;
        boolean valid = validateInput(dto);

        if(valid == true) {
            isRegistered = true;
            this.dto = dto;
            System.out.println("Jio Hotstar Registration Successful");
        } else {
            System.out.println("Jio Hotstar Registration Failed");
        }

        return isRegistered;
    }

    public boolean validateInput(JioHotstarDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isPlan = false;
        boolean isDevice = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Full Name");

        if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile Number");

        if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email ID");

        if(dto.getSubscriptionPlan() != null && !dto.getSubscriptionPlan().isEmpty()) {
            isPlan = true;
        } else System.out.println("Invalid Subscription Plan");

        if(dto.getDeviceType() != null && !dto.getDeviceType().isEmpty()) {
            isDevice = true;
        } else System.out.println("Invalid Device Type");

        if(isName && isMobile && isEmail && isPlan && isDevice) {
            isValid = true;
        }

        return isValid;
    }
    public void getCustomerDetails(){
        System.out.println("User Full Name is " + this.dto.getFullName());
        System.out.println("User Mobile Number is " + this.dto.getMobileNumber());
        System.out.println("User Email ID is " + this.dto.getEmailId());
        System.out.println("User Subscription Plan is " + this.dto.getSubscriptionPlan());
        System.out.println("User Device Type is " + this.dto.getDeviceType());

    }
}
