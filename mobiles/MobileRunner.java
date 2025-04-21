package com.xworkz.methodOverriding.mobiles;

import com.xworkz.methodOverriding.mobiles.mobile.Mobile;
import com.xworkz.methodOverriding.mobiles.samsung.Samsung;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.call();
        mobile.message();
        mobile.browse();
        mobile.playMusic();
        mobile.takePhoto();

        Mobile mobile1 = new Samsung();
        mobile1.call();
        mobile1.message();
        mobile1.browse();
        mobile1.playMusic();
        mobile1.takePhoto();

        Samsung smart = new Samsung();
        smart.call();
        smart.message();
        smart.browse();
        smart.playMusic();
        smart.takePhoto();
    }
}
