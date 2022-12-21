package _08_Mehrdimensionale_Arrays._08_Einfuehrung;

import java.util.Arrays;

public class MainApp_3 {
    public static void main(String[] args) {
        String[][][] wuerfel = new String[20][10][5];

        int x = 0;
        while (x < wuerfel.length) {
            String[][] wuerfel_schnitt = wuerfel[x];
            int y = 0;
            while (y < wuerfel_schnitt.length) {
                String[] wuerfel_spalte = new String[y];
                int z = 0;
                while (z < wuerfel_spalte.length) {
                    wuerfel[x][y][z] = "x " + x;
                    wuerfel[x][y][z] = "-y " + y;
                    wuerfel[x][y][z] = "-z " + z;
                    z++;
                }
                y++;
            }
            x++;
        }
        System.out.println("würfel = " + Arrays.deepToString(wuerfel));
    }
}
