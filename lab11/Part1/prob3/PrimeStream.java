package lab11.Part1.prob3;

import java.util.stream.Stream;

public class PrimeStream {
    // Part A
    public static final Stream<Integer> primes = Stream.iterate(2, n -> {
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    });

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int maxDivisor = (int)Math.sqrt(number);
        for (int i = 3; i <= maxDivisor; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Part B
    public void printFirstNPrimes(long n) {
        Stream.iterate(2, i -> {
            int next = i + 1;
            while (!isPrime(next)) {
                next++;
            }
            return next;
        }).limit(n).forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
