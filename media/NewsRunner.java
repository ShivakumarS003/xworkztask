package com.xworkz.methodOverriding.Media;

import com.xworkz.methodOverriding.Media.media.Media;
import com.xworkz.methodOverriding.Media.news.News;

public class NewsRunner {
    public static void main(String[] args) {
        Media media = new Media();
        media.publish();
        media.broadcast();
        media.edit();
        media.schedule();
        media.archive();

        Media media1 = new News();
        media1.publish();
        media1.broadcast();
        media1.edit();
        media1.schedule();
        media1.archive();

        News news = new News();
        news.publish();
        news.broadcast();
        news.edit();
        news.schedule();
        news.archive();
    }
}
