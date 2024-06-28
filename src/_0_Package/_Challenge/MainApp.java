package _0_Package._Challenge;

import Ressources.inputClass;
import Ressources.listePrint;
import LineareDatenstruktur.List;

import java.util.Arrays;
import java.util.Random;

public class MainApp {
    static listePrint list = new listePrint();
    static inputClass inputClass = new inputClass();

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();

        System.out.print("Länge: ");
        int laenge = inputClass.inputInt();
        int[] nums = mainApp.randomArray(laenge);

        System.out.print("Target: ");
        int target = inputClass.inputInt();

        System.out.println("--------------------------");

        List<Integer> liste = new List<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    liste.append(i);
                    liste.append(j);
                }
            }
        }
        //nums Liste
        System.out.println("Numbers: " + Arrays.toString(nums));
        //target
        System.out.println("Target: " + target);
        //Print Methode
        System.out.print("Liste: ");
        list.print(liste);
    }

    public static int[] randomArray(int lenght) {
        int[] nums = new int[lenght];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(0,20);
        }
        return nums;
    }
}
