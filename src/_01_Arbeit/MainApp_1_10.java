package _01_Arbeit;

public class MainApp_1_10 {
    public static void main(String[] args) {
        System.out.println(wortAufLaengeBringen("LANGESWORT", "HA"));
    }
    public static String wortAufLaengeBringen(String pNachricht, String pSchluessel) {
        String ausgabe = "";
        for (int i = 0; i < pNachricht.length(); i++) {
            ausgabe += (char) ((pSchluessel.charAt(i % pSchluessel.length())));
        }
        return ausgabe;
    }
}
