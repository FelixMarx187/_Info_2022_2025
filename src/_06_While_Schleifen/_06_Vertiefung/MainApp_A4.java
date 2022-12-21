package _06_While_Schleifen._06_Vertiefung;

public class MainApp_A4 {
    public static void main(String[] args) {

        int x = 2;
        boolean weiter = false;
        while (x <= 1000) {
            int y = 2;
            while (y < x) {
                if (x % y == 0) {
                    weiter = true;
                    break;
                }
                y++;
            }
            if (!weiter) {
                System.out.println(x);
            }
            weiter = false;
            x++;
        }
    }
}
