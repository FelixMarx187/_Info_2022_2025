package _01_Arbeit;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class testeneger {
    public static void main(String[] args) {
        String i = "A";
        byte[] bytes = i.getBytes(StandardCharsets.UTF_16);
        System.out.println(Arrays.toString(bytes));
    }
}
