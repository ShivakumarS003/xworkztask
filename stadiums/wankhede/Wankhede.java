package com.xworkz.methodOverriding.stadiums.wankhede;

import com.xworkz.methodOverriding.stadiums.stadium.Stadium;

public class Wankhede extends Stadium {
    @Override
    public void hostMatch() {
        System.out.println("CricketStadium: Hosting an international cricket match");
    }

    @Override
    public void manageCrowd() {
        System.out.println("CricketStadium: Managing cheering cricket fans");
    }

    @Override
    public void provideFacilities() {
        System.out.println("CricketStadium: Providing dugouts and dressing rooms");
    }

    @Override
    public void maintainSecurity() {
        System.out.println("CricketStadium: Coordinating with police for match security");
    }

    @Override
    public void scheduleEvents() {
        System.out.println("CricketStadium: Scheduling domestic and IPL matches");
    }
}
