package lab09.prob2;

public sealed interface Expression permits Constant, Add, Multiply {
    int eval();
}
