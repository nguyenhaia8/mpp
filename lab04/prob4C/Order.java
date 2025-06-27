package lab04.prob4C;

import java.time.LocalDate;

public class Order {
    private String orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    public Order(String orderNo, LocalDate orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
