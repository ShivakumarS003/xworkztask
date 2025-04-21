package com.xworkz.methodOverriding.mountains;

import com.xworkz.methodOverriding.mountains.himalaya.Himalaya;
import com.xworkz.methodOverriding.mountains.mountain.Mountain;

public class Runner {
    public static void main(String[] args) {
        Mountain mountain = new Mountain();
        mountain.grow();
        mountain.erode();
        mountain.hostWildlife();
        mountain.attractTourists();
        mountain.storeWater();

        Mountain mountain1 = new Himalaya();
        mountain1.grow();
        mountain1.erode();
        mountain1.hostWildlife();
        mountain1.attractTourists();
        mountain1.storeWater();

        Himalaya h = new Himalaya();
        h.grow();
        h.erode();
        h.hostWildlife();
        h.attractTourists();
        h.storeWater();
    }
}
