package _08_Mehrdimensionale_Arrays._08_Einfuehrung;

import java.util.Arrays;

public class MainApp_3_test {
    public static void main(String[] args) {
        // Dreidimensionales Array, das 20 x 10 x 5 String Werte enthalten kann (Würfel)
        String[][][] wuerfel = new String[20][10][5];

// über das dreidimensionale Array iterieren
        int x = 0;
        while (x < wuerfel.length) {
            String[][] wuerfel_schnitt = wuerfel[x];
            int y  = 0;
            while (y < wuerfel_schnitt.length) {
                String[] wuerfel_spalte = wuerfel_schnitt[y];  // = wuerfel[x][y]
                int z = 0;
                while(z < wuerfel_spalte.length) {
                    wuerfel[x][y][z] = "x" + x;
                    wuerfel[x][y][z] += "-y" + y;
                    wuerfel[x][y][z] += "-z" + z;
                    z++;
                }
                y++;
            }
            x++;
        }
        System.out.println("wuerfel = " + Arrays.deepToString(wuerfel));
    }
}
