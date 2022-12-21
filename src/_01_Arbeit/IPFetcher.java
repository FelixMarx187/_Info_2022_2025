package _01_Arbeit;

import java.net.InetAddress;

public class IPFetcher {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Ihre Ip lautet: " + ip.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
