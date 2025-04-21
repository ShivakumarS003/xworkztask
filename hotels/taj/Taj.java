package com.xworkz.methodOverriding.hotels.taj;

import com.xworkz.methodOverriding.hotels.hotel.Hotel;

public class Taj extends Hotel {
    @Override
    public void bookRoom() {
        System.out.println("LuxuryHotel: Suite booked with amenities");
    }

    @Override
    public void serveFood() {
        System.out.println("LuxuryHotel: Multi-cuisine room service");
    }

    @Override
    public void cleanRoom() {
        System.out.println("LuxuryHotel: Premium housekeeping daily");
    }

    @Override
    public void checkout() {
        System.out.println("LuxuryHotel: Quick checkout with gifts");
    }

    @Override
    public void manageStaff() {
        System.out.println("LuxuryHotel: High-trained concierge team");
    }
}
