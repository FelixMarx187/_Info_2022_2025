package _0_Package._0_Facharbeit;

import java.util.function.IntFunction;

public class LambdaExpressions_Beispiele {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello World");
        System.out.println(runnable);

        IntFunction<Integer> integerIntFunction = (int a) -> a * a;

        System.out.println(integerIntFunction.apply(3));
        System.out.println(integerIntFunction.toString());

    }
}
