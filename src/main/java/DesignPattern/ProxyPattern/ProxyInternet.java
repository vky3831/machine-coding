package DesignPattern.ProxyPattern;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet {
    Set<String> bannedSites = new HashSet<String>();
    Internet internet = new RealInternet();
    ProxyInternet(){
        bannedSites.add("banned.com");
    }

    @Override
    public void connectTo(String host) {
        if(bannedSites.contains(host)){
            System.out.println("Access Denied to " + host);
            return;
        }
        internet.connectTo(host);
    }
}
