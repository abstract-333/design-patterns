package Adapter;

public interface ISocialMedia {
    abstract public void postText(String data);

    abstract public void postImage(String data);

    abstract public void postVideo(String data);
}
