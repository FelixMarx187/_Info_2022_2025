package _01_Arbeit;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class updown {
    public static void main(String[] args) {
        try {
            // Messen der Download-Geschwindigkeit
            URL url = new URL("http://speedtest.net/speedtest-servers-static/static/tests/1MB.zip");
            URLConnection connection = url.openConnection();
            connection.connect();
            long startTime = System.currentTimeMillis();
            connection.getInputStream().read();
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            double downloadSpeed = (1024 * 1024) / ((double) duration / 1000);
            System.out.println("Download speed: " + downloadSpeed + " Mbps");

            // Messen der Upload-Geschwindigkeit
            url = new URL("http://speedtest.net/speedtest-servers-static/static/tests/upload.php");
            connection = url.openConnection();
            connection.setDoOutput(true);
            connection.connect();
            startTime = System.currentTimeMillis();
            connection.getOutputStream().write("test".getBytes());
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            double uploadSpeed = (1024 * 1024) / ((double) duration / 1000);
            System.out.println("Upload speed: " + uploadSpeed + " Mbps");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
