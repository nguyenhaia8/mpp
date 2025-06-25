package lab02.prob2B;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("100");
        OrderLine line1 = new OrderLine(order, 10);
        OrderLine line2 = new OrderLine(order, 20);

        order.addOrderLine(line1);
        order.addOrderLine(line2);

        order.printOrder();
    }
}
