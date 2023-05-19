package TwoSum;

/*
Aufgabenstellung:
Schreibe die Methode "summeFinden", die aus einem vorgegebenen Array zwei Zahlen miteinander so addiert, dass ein vorgegebener
Zielwert herauskommt. Gib dann die Indices beider Zahlen zurück.

Vorgaben:
  - Es gibt immer eine Lösung.
  - Es darf kein Index mit sich selbst addiert werden.

Anmerkung:
  - Falls es keine Lösung gibt (was nicht sein kann), darf die Standardinitialisierung des Parameters zurückgegeben
    werden, also [0, 0]. [0, 0] bedeutet also, dass es keine Lösung gab.

 */

import java.util.Arrays;

public class SummeAusArrayFinden_SV {

    public static void main(String[] args) {
        // Teste deine Lösung, indem du die print-Ausgaben auskommentierst.
        int[] intArray = {2, 7, 11, 15};
//        System.out.println(Arrays.toString(summeFinden(intArray, 9)));
//        System.out.println(Arrays.toString(summeFinden(intArray, 18)));
//        System.out.println(Arrays.toString(summeFinden(intArray, 17)));
//        System.out.println(Arrays.toString(summeFinden(intArray, 22)));

        // Dieser Fall ist nicht möglich, kann aber trotzdem getestet werden, um [0, 0] als Rückgabewert zu erhalten.
//        System.out.println(Arrays.toString(summeFinden(intArray, 14)));

    }
}
