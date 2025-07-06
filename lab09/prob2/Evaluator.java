package lab09.prob2;

public class Evaluator {
    public static int evaluate(Expression expression) {
        if (expression instanceof Constant) {
            Constant constant = (Constant) expression;
            return constant.eval();
        } else if (expression instanceof Add) {
            Add add = (Add) expression;
            return evaluate(add.first()) + evaluate(add.second());
        } else if (expression instanceof Multiply) {
            Multiply multiply = (Multiply) expression;
            return evaluate(multiply.first()) * evaluate(multiply.second());
        } else {
            throw new RuntimeException("Unsupported expression: " + expression);
        }
    }
}
