package com.xworkz.methodOverriding.Media.news;

import com.xworkz.methodOverriding.Media.media.Media;

public class News extends Media {
    @Override
    public void publish() {
        System.out.println("NewsChannel: News published hourly");
    }

    @Override
    public void broadcast() {
        System.out.println("NewsChannel: Live news broadcasted");
    }

    @Override
    public void edit() {
        System.out.println("NewsChannel: News clips edited for clarity");
    }

    @Override
    public void schedule() {
        System.out.println("NewsChannel: Programs scheduled daily");
    }

    @Override
    public void archive() {
        System.out.println("NewsChannel: News archived by date");
    }
}
