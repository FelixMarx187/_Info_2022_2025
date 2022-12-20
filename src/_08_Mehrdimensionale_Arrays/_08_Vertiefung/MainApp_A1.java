package _08_Mehrdimensionale_Arrays._08_Vertiefung;

import java.util.Arrays;

public class MainApp_A1 {
    public static void main(String[] args) {
        //1.1
        String[][] personen = {{"Harry", "Müller"}, {"Silke", "Meier"}, {"John", "Doe",}, {"Angela", "Schmitz"}};

        //1.2
        int a = personen.length; // a = 4
        String b = personen[2][0]; // b = John
        String c = personen[3][1]; //c = Schmitz
        String[] d = personen[0]; // Speicheradresse von Personen[0]
        String e = Arrays.toString(personen[0]); //e = [Harry Müller]

        //1.3
        int idx = 0;
        while (idx < personen.length) {
            if (idx == idx) {
                System.out.println("Index " + idx + " | Vorname: " + personen[idx][0] + " Nachname: " + personen[idx][1]);
            }
            idx++;
        }
        //--------------------------
        System.out.println();
        System.out.println();
        System.out.println();
        //--------------------------

        //1.4
        int[][] arr = new int[10][5];
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr.length) {
                arr[i][j] = arr.length;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
