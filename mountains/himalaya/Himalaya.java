package com.xworkz.methodOverriding.mountains.himalaya;

import com.xworkz.methodOverriding.mountains.mountain.Mountain;

public class Himalaya extends Mountain {
    @Override
    public void grow() {
        System.out.println("Himalayas: Still rising due to tectonic activity");
    }

    @Override
    public void erode() {
        System.out.println("Himalayas: Erosion due to monsoon");
    }

    @Override
    public void hostWildlife() {
        System.out.println("Himalayas: Home to snow leopards");
    }

    @Override
    public void attractTourists() {
        System.out.println("Himalayas: Adventure and spirituality");
    }

    @Override
    public void storeWater() {
        System.out.println("Himalayas: Main source for many rivers");
    }
}
