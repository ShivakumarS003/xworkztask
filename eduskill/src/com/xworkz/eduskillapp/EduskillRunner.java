package com.xworkz.eduskillapp;

import com.xworkz.eduskillapp.eduskill.Eduskill;
import com.xworkz.eduskillapp.eduskilldto.EduskillStudentDto;

public class EduskillRunner {
    public static void main(String[] args) {

        EduskillStudentDto dto = new EduskillStudentDto();
        dto.setStudentId(1);
        dto.setStudentName("Shiva");
        dto.setGender("Male");
        dto.setUsn("4PS21EC125");
        dto.setPhoneNumber(7411012130L);
        dto.setEmail("Shivu03@gmail.com");


    Eduskill skill = new Eduskill();
    boolean ref =  skill.studentLogIn(dto);
    if(ref==true){
        System.out.println("Student Registration Successful");
        skill.getStudentDetails();
    }
    else System.out.println("Student Registration Failed");

        System.out.println(dto);
}

}
