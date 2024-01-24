package _01_Arbeit;

import java.net.InetAddress;
import java.net.Socket;

public class IPFetcher {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            Socket socket = new Socket();
            int port = socket.getPort();
            System.out.println("PC-NAME: " + ip.getHostName() +" IP-Adresse: " + ip.getHostAddress() + " Port: " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
