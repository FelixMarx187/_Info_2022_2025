package _01_Arbeit;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class PCSpecs {
    public static void main(String[] args) {
        // Betriebssystem-Informationen
        System.out.println("Betriebssystem: " + System.getProperty("os.name"));
        System.out.println("Version: " + System.getProperty("os.version"));
        System.out.println("Architektur: " + System.getProperty("os.arch"));

        // Java-Version
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // Benutzerinformationen
        System.out.println("Benutzername: " + System.getProperty("user.name"));
        System.out.println("Benutzer-Heimverzeichnis: " + System.getProperty("user.home"));

        // Speicherinformationen
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        System.out.println("Maximaler Speicher: " + memoryMXBean.getHeapMemoryUsage().getMax() / (1024 * 1024) + " MB");

        // CPU-Informationen
        OperatingSystemMXBean operatingSystemMXBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        System.out.println("Verfügbare Prozessoren: " + operatingSystemMXBean.getAvailableProcessors());

        // Weitere CPU-Informationen
        System.out.println("Systemlast: " + operatingSystemMXBean.getSystemLoadAverage());
    }
}
