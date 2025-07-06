package lab09.prob2;

public record Constant(int val) implements Expression {
    @Override
    public int eval() {
        return val;
    }
}
