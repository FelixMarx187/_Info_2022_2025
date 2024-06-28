package _0_Package._Challenge;

import LineareDatenstruktur.List;
import Ressources.listePrint;

import java.util.Random;

public class BewerbungsEinstellungs {
    static listePrint list = new listePrint();

    public static void main(String[] args) {
        BewerbungsEinstellungs mainApp = new BewerbungsEinstellungs();
        int[] nums = mainApp.randomArray(20);
        List<Integer> liste = new List<>();
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    liste.append(i);
                    liste.append(j);
                }
            }
        }
        list.print(liste);
    }
    public int[] randomArray(int lenght) {
        int[] pArray  = new int[lenght];
        for (int i = 0; i < pArray.length; i++) {
            pArray[i] = new Random().nextInt(0,20);
        }
        return pArray;
    }
}
