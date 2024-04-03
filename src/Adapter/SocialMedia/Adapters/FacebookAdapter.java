package Adapter.SocialMedia.Adapters;

import Adapter.SocialMedia.ISocialMedia;
import Adapter.SocialMedia.Types;
import Adapter.SocialMedia.Services.Facebook;

public class FacebookAdapter implements ISocialMedia {
    private Facebook adaptee;

    public FacebookAdapter(Facebook instance) {
        this.adaptee = instance;
    }

    @Override
    public void postText(String data) {
        adaptee.writePost(Types.Text, data);
    }

    @Override
    public void postImage(String data) {
        adaptee.writePost(Types.Image, data);
    }

    @Override
    public void postVideo(String data) {
        adaptee.writePost(Types.Video, data);
    }

}
