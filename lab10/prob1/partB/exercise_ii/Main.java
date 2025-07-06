package lab10.prob1.partB.exercise_ii;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Using method reference
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Random number:" + randomSupplier.get());

        // Using lambda
        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Random number: " + supplier.get());
    }
}
