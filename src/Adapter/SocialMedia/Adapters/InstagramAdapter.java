package Adapter.SocialMedia.Adapters;

import Adapter.SocialMedia.ISocialMedia;
import Adapter.SocialMedia.Services.Instagram;

public class InstagramAdapter implements ISocialMedia {
    private Instagram adaptee;

    public InstagramAdapter(Instagram instance) {
        this.adaptee = instance;
    }

    @Override
    public void postText(String data) {
        throw new UnsupportedOperationException("Unimplemented method 'postText'");
    }

    @Override
    public void postImage(String data) {
        adaptee.addImage(data);
    }

    @Override
    public void postVideo(String data) {
        adaptee.addVideo(data);
    }

}
