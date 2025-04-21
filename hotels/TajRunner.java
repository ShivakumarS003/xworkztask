package com.xworkz.methodOverriding.hotels;

import com.xworkz.methodOverriding.hotels.hotel.Hotel;
import com.xworkz.methodOverriding.hotels.taj.Taj;

public class TajRunner {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.bookRoom();
        hotel.serveFood();
        hotel.cleanRoom();
        hotel.checkout();
        hotel.manageStaff();

        Hotel hotel1 = new Taj();
        hotel1.bookRoom();
        hotel1.serveFood();
        hotel1.cleanRoom();
        hotel1.checkout();
        hotel1.manageStaff();

        Taj luxury = new Taj();
        luxury.bookRoom();
        luxury.serveFood();
        luxury.cleanRoom();
        luxury.checkout();
        luxury.manageStaff();
    }
}
