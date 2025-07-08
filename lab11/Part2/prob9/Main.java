package lab11.Part2.prob9;

import java.util.stream.IntStream;

public class Main {
    public static void printSquares (int num) {
        IntStream.iterate(1, n -> n + 1).limit(num).forEach(n -> System.out.print(n*n + ", "));
    }
    public static void main(String[] args) {
        printSquares(4);
    }
}
