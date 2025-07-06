package lab10.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

// The given lambda expression can be correctly typed as a BiFunction
public class BiFunctionSolution {
    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> powerAndMultiply = (x, y) -> {
            List<Double> l = new ArrayList<>();
            l.add(Math.pow(x, y));
            l.add(x*y);
            return l;
        };

        List<Double> result = powerAndMultiply.apply(2.0, 3.0);
        System.out.println(result);
    }
}
