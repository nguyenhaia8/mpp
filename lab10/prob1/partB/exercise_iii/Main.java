package lab10.prob1.partB.exercise_iii;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> innerSupplier = new RandomSupplier();
        double randomNumber = innerSupplier.get();

        System.out.println("Random number: " + randomNumber);
    }

    static class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
