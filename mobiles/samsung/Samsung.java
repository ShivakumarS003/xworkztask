package com.xworkz.methodOverriding.mobiles.samsung;

import com.xworkz.methodOverriding.mobiles.mobile.Mobile;

public class Samsung extends Mobile {
    @Override
    public void call() {
        System.out.println("Smartphone: VoIP calling");
    }

    @Override
    public void message() {
        System.out.println("Smartphone: Chat apps used");
    }

    @Override
    public void browse() {
        System.out.println("Smartphone: Fast 5G browsing");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone: Streaming music online");
    }

    @Override
    public void takePhoto() {
        System.out.println("Smartphone: AI-enhanced photo");
    }
}
