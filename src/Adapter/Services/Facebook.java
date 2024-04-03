package Adapter.Services;

import Adapter.Types;

public class Facebook {
    private String username;

    public Facebook(String username) {
        this.username = username;
    }

    public void writePost(Types type, String data) {
        System.out.println(this.getClass().getSimpleName() + ' ' + username + ':' + type + " " + data);
    }
}
