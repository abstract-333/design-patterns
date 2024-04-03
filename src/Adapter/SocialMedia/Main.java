package Adapter.SocialMedia;

import Adapter.SocialMedia.Adapters.FacebookAdapter;
import Adapter.SocialMedia.Adapters.InstagramAdapter;
import Adapter.SocialMedia.Services.Facebook;
import Adapter.SocialMedia.Services.Instagram;

public class Main {

    public static void main(String[] args) throws Exception {
        ISocialMedia facebook = new FacebookAdapter(new Facebook("UserFB"));
        facebook.postImage("C://file.png");
        facebook.postText("C://file.txt");
        facebook.postVideo("C://file.mp4");

        ISocialMedia instagram = new InstagramAdapter(new Instagram("UserInsta"));
        instagram.postImage("C://file.png");
        instagram.postVideo("C://file.mp4");
    }
}
