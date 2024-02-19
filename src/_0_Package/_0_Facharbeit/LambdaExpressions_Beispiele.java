package _0_Package._0_Facharbeit;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class LambdaExpressions_Beispiele {
    public static void main(String[] args) {
        List<String> namen = Arrays.asList("Michael","Felix","Johannes","Mario","Marie");

        List<Integer> namenLänge = namen.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());

        System.out.println(namenLänge);
    }
}
