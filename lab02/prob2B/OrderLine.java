package lab02.prob2B;

public class OrderLine {
    public Order order;
    public int lineNumber;
    public OrderLine(Order order, int lineNumber) {
        this.order = order;
        this.lineNumber = lineNumber;
    }

    public Order getOrder() {
        return order;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void printOrderLine() {
        System.out.println("Order Line " + lineNumber);
    }
}
