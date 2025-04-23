package com.xworkz.toString.pg;

public class PgRunner {
    public static void main(String[] args) {
        PgDto dto = new PgDto();
        dto.setId(1);
        dto.setPgName("Royal PG");
        dto.setPhoneNumber(9412478514L);
        dto.setLocation("Bengaluru");
        dto.setRent(7000.00);

        System.out.println(dto);
    }

}
