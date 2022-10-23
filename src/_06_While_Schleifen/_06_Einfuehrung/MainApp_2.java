package _06_While_Schleifen._06_Einfuehrung;

public class MainApp_2 {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 10) {
            double value = Math.random();
            System.out.println(counter + ": " + value);
            counter++;
        }
    }
}
