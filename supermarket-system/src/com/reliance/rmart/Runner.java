package com.reliance.rmart;

import com.reliance.rmart.sections.Sections;
import com.reliance.rmart.staff.Staff;

public class Runner {
    public static void main(String[] args) {

        String names[]={"Dairy Products","Detergents","Vegetables"};
         String itemsOfDP[]={"Milk","Curd","Paneer"};


        Sections sections[] = new Sections[3];

        Sections section1 = new Sections();
        section1.id=1;
        section1.names=names;
        section1.items=itemsOfDP;





        Staff staff[] = new Staff[3];

    }
}
