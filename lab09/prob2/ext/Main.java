package lab09.prob2.ext;

import lab09.prob2.Add;
import lab09.prob2.Constant;
import lab09.prob2.Expression;
import lab09.prob2.Multiply;

public class Main {
    public static void main(String[] args) {
        Expression expr = new Multiply(
                new Add(new Constant(2), new Constant(3)),
                new Constant(4)
        );
        System.out.println(expr.eval());
    }
}
