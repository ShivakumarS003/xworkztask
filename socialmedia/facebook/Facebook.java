package com.xworkz.methodOverriding.socialmedia.facebook;

import com.xworkz.methodOverriding.socialmedia.Socialmedia.SocialMedia;

public class Facebook extends SocialMedia {
    @Override
    public void postContent() {
        System.out.println("Instagram: Uploading a photo or reel");
    }

    @Override
    public void likeContent() {
        System.out.println("Instagram: Double-tapping to like");
    }

    @Override
    public void shareContent() {
        System.out.println("Instagram: Sharing via stories or DMs");
    }

    @Override
    public void followUser() {
        System.out.println("Instagram: Sending a follow request");
    }

    @Override
    public void commentOnPost() {
        System.out.println("Instagram: Adding emojis or replies");
    }
}
