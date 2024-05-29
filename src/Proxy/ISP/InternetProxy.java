package Proxy.ISP;

import java.util.ArrayList;

public class InternetProxy implements ISP {
    private ArrayList<String> blockedSites;

    private ISP isp;

    public InternetProxy(ISP isp) {
        this.isp = new Sawa();
        this.blockedSites = new ArrayList<String>();
        blockedSites.add("www.google.com");
    }

    public void blockedSite(String url) {
        blockedSites.add(url);
    }

    public boolean isBlocked(String url) {
        return blockedSites.contains(url);
    }

    @Override
    public String getResource(String url) {
        if (isBlocked(url)) {
            return "Blocked Site!!!";
        } else {
            return isp.getResource(url);
        }
    }

}