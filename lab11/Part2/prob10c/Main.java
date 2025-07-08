package lab11.Part2.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> myIntStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntSummaryStatistics myIntSummaryStatistics = myIntStream.collect(Collectors.summarizingInt((x) -> x.intValue()));

        System.out.println("Min: " + myIntSummaryStatistics.getMin() + ", Max: " + myIntSummaryStatistics.getMax());
    }
}
