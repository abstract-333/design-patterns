package Adapter.SocialMedia.Services;

public class Instagram {
    private String username;

    public Instagram(String username) {
        this.username = username;
    }

    public void addImage(String data)

    {
        System.out.println(this.getClass().getSimpleName() + ' ' + username + ":Image " + data);
    }

    public void addVideo(String data) {
        System.out.println(this.getClass().getSimpleName() + ' ' + username + ":Video " + data);
    }
}