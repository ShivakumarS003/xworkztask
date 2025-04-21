package com.xworkz.methodOverriding.cities.mumbai;

import com.xworkz.methodOverriding.cities.city.City;

public class Mumbai extends City {
    @Override
    public void build() {
        System.out.println("SmartCity: Building with modern tech");
    }

    @Override
    public void provideUtilities() {
        System.out.println("SmartCity: Smart grid and water recycling");
    }

    @Override
    public void manageTraffic() {
        System.out.println("SmartCity: AI-based traffic signals");
    }

    @Override
    public void maintainCleanliness() {
        System.out.println("SmartCity: Drones monitoring cleanliness");
    }

    @Override
    public void offerServices() {
        System.out.println("SmartCity: Services through mobile apps");
    }
}
