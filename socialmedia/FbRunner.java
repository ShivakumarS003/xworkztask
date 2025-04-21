package com.xworkz.methodOverriding.socialmedia;

import com.xworkz.methodOverriding.socialmedia.Socialmedia.SocialMedia;
import com.xworkz.methodOverriding.socialmedia.facebook.Facebook;

public class FbRunner {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.postContent();
        sm.likeContent();
        sm.shareContent();
        sm.followUser();
        sm.commentOnPost();

        SocialMedia sm1 = new Facebook();
        sm1.postContent();
        sm1.likeContent();
        sm1.shareContent();
        sm1.followUser();
        sm1.commentOnPost();

        Facebook fb = new Facebook();
        fb.postContent();
        fb.likeContent();
        fb.shareContent();
        fb.followUser();
        fb.commentOnPost();
    }
}
