package _01_Arbeit;

public class LOL {
    public static void main(String[] args) {
        int lol = Integer.MIN_VALUE;
        int counter = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            counter++;
            lol++;
            System.out.println(counter +": " + lol);
        }
    }
}
