package Proxy.ISP;

public class Sawa implements ISP {

    @Override
    public String getResource(String url) {
        String res = "";
        if (url.equalsIgnoreCase("www.google.com"))
            res = "Google site";

        if (url.equalsIgnoreCase("www.facebook.com"))
            res = "Facebook site";

        else
            res = "404 Error";

        return res;
    }

}
