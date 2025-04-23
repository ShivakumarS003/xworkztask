package com.xworkz.toString.hotel;

public class HotelRunner {
    public static void main(String[] args) {
        HotelDto hotel = new HotelDto();
        hotel.setName("The Grand Palace");
        hotel.setLocation("Mysuru");
        hotel.setRating(5);
        hotel.setManagerName("Babu");
        hotel.setRoomCount(150);

        System.out.println(hotel);
    }
}
