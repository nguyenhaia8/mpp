package lab10.prob5.exercise2;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Examples {
    Function<String, String> toUpper1 = s -> s.toUpperCase();
    Function<String, String> toUpper2 = String::toUpperCase;
    Function<String, String> toLower1 = s -> s.toLowerCase();
    Function<String, String> toLower2 = String::toLowerCase;

    BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
    BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
    BiFunction<Integer, Integer, Integer> power = (a, b) -> (int)Math.pow(a, b);

    Supplier<Double> randomDouble1 = () -> Math.random();
    Supplier<Double> randomDouble2 = Math::random;

    void evaluator() {
        System.out.println(toUpper1.apply("Hello"));
        System.out.println(toUpper2.apply("Hello"));

        System.out.println(toLower1.apply("Hello"));
        System.out.println(toLower2.apply("Hello"));

        System.out.println(sum.apply(1, 2));
        System.out.println(multiply.apply(1, 2));
        System.out.println(power.apply(2, 3));

        System.out.println(randomDouble1.get());
        System.out.println(randomDouble2.get());
    }

    public static void main(String[] args) {
        new Examples().evaluator();
    }
}
