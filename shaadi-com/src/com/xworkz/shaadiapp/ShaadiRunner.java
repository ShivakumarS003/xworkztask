package com.xworkz.shaadiapp;

import com.xworkz.shaadiapp.shaadi.Shaadi;
import com.xworkz.shaadiapp.shaadiclientdto.ShaadiClientDto;

public class ShaadiRunner {
    public static void main(String[] args) {

        ShaadiClientDto dto = new ShaadiClientDto();
        dto.setId(1);
        dto.setName("Shruthan");
        dto.setDob("15/02/2003");
        dto.setGender("Male");
        dto.setPhoneNumber(9547895612L);
        dto.setReligion("Hindu");


        Shaadi com = new Shaadi();
        boolean ref = com.userRegistration(dto);

        if(ref==true){
            System.out.println("User registered Successfully");
            com.getUserDetails();
        }
        else System.out.println("User registration Unsuccessful");

        System.out.println(dto);
    }
}
