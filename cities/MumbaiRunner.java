package com.xworkz.methodOverriding.cities;

import com.xworkz.methodOverriding.cities.city.City;
import com.xworkz.methodOverriding.cities.mumbai.Mumbai;

public class MumbaiRunner {
        public static void main(String[] args) {
            City city = new City();
            city.build();
            city.provideUtilities();
            city.manageTraffic();
            city.maintainCleanliness();
            city.offerServices();

            City city1 = new Mumbai();
            city1.build();
            city1.provideUtilities();
            city1.manageTraffic();
            city1.maintainCleanliness();
            city1.offerServices();

            Mumbai smart = new Mumbai();
            smart.build();
            smart.provideUtilities();
            smart.manageTraffic();
            smart.maintainCleanliness();
            smart.offerServices();
        }
    }


