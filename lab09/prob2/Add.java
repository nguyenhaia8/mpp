package lab09.prob2;

public record Add(Expression first, Expression second) implements Expression {
    @Override
    public int eval() {
        return first.eval() + second.eval();
    }
}
