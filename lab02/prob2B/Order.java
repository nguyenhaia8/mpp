package lab02.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNum;
    private List<OrderLine> orderLines;

    public Order(String orderNum) {
        this.orderNum = orderNum;
        this.orderLines = new ArrayList<>();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void addOrderLine(OrderLine orderLine) {
        if (orderLine.getOrder() != this) {
            throw new IllegalArgumentException("Order does not belong to this order");
        }
        orderLines.add(orderLine);
    }

    public void printOrder() {
        System.out.println("Order: " + orderNum);
        for (OrderLine orderLine : orderLines) {
            orderLine.printOrderLine();
        }
    }

}
