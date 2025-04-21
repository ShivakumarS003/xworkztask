package com.xworkz.methodOverriding.stadiums;

import com.xworkz.methodOverriding.stadiums.stadium.Stadium;
import com.xworkz.methodOverriding.stadiums.wankhede.Wankhede;

public class WankhedeRunner {
    public static void main(String[] args) {
        Stadium stadium = new Stadium();
        stadium.hostMatch();
        stadium.manageCrowd();
        stadium.provideFacilities();
        stadium.maintainSecurity();
        stadium.scheduleEvents();

        Stadium stadium1 = new Wankhede();
        stadium1.hostMatch();
        stadium1.manageCrowd();
        stadium1.provideFacilities();
        stadium1.maintainSecurity();
        stadium1.scheduleEvents();

        Wankhede cs = new Wankhede();
        cs.hostMatch();
        cs.manageCrowd();
        cs.provideFacilities();
        cs.maintainSecurity();
        cs.scheduleEvents();
    }
}
