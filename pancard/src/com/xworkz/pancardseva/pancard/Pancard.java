package com.xworkz.pancardseva.pancard;

import com.xworkz.pancardseva.pancardDto.PancardDto;

public class Pancard {
    public  PancardDto dto;
    public boolean applyPan(PancardDto dto) {
        boolean isPanIssued = false;
        boolean isValid = validateDetails(dto);

        if (isValid == true) {
            isPanIssued = true;
            this.dto = dto;
            System.out.println("PAN Application Submitted Successfully");
        } else {
            System.out.println("PAN Application Failed");
        }

        return isPanIssued;
    }

    public boolean validateDetails(PancardDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isFather = false;
        boolean isDob = false;
        boolean isGender = false;
        boolean isAadhaar = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isAddress = false;
        boolean isType = false;

        if(dto.getApplicantName() != null && !dto.getApplicantName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Name");

        if(dto.getFatherName() != null && !dto.getFatherName().isEmpty()) {
            isFather = true;
        } else System.out.println("Invalid Father's Name");

        if(dto.getDob() != null && !dto.getDob().isEmpty()) {
            isDob = true;
        } else System.out.println("Invalid DOB");

        if(dto.getGender() != null && !dto.getGender().isEmpty()) {
            isGender = true;
        } else System.out.println("Invalid Gender");

        if(dto.getAadhaarNumber() != null && !dto.getAadhaarNumber().isEmpty()) {
            isAadhaar = true;
        } else System.out.println("Invalid Aadhaar Number");

        if(dto.getMobile() != null && !dto.getMobile().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile");

        if(dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email");

        if(dto.getAddress() != null && !dto.getAddress().isEmpty()) {
            isAddress = true;
        } else System.out.println("Invalid Address");

        if(dto.getPanType() != null && !dto.getPanType().isEmpty()) {
            isType = true;
        } else System.out.println("Invalid PAN Type");

        if(isName && isFather && isDob && isGender && isAadhaar && isMobile && isEmail && isAddress && isType) {
            isValid = true;
        }

        return isValid;
    }
    public void getApplicantDetails() {
        System.out.println("Applicant Name is " + this.dto.getApplicantName());
        System.out.println("Father's Name is " + this.dto.getFatherName());
        System.out.println("Date of Birth is " + this.dto.getDob());
        System.out.println("Gender is " + this.dto.getGender());
        System.out.println("Aadhaar Number is " + this.dto.getAadhaarNumber());
        System.out.println("Mobile Number is " + this.dto.getMobile());
        System.out.println("Email ID is " + this.dto.getEmail());
        System.out.println("Address is " + this.dto.getAddress());
        System.out.println("PAN Type is " + this.dto.getPanType());
    }
}
