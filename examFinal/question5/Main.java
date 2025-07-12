package examFinal.question5;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //A
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        String answer = toUpperCase.apply("Hello World");
        System.out.println(answer);

        //B
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;


        // D
        BiFunction<String, String, String> combine = (s1, s2) -> s1 + " " +s2;
        System.out.println(combine.apply("Jane", "Doe"));

        // C
        Comparator<Integer> comparator = (a, b) -> Integer.compare(a, b);
    }
}
