package _0_Facharbeit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams_Beispiele {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banane","orange");
        Stream<String> stream = fruits.stream();
        LineareDatenstruktur.List<String> fruits2 = (LineareDatenstruktur.List<String>) Arrays.asList("apple","banane","orange");

    }
}
