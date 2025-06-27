package lab04.prob4C;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(String empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalOrder = 0;
        for (Order order : orders) {
            if(order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year) {
                totalOrder += order.getOrderAmount();
            }
        }

        return baseSalary + (commission * totalOrder);
    }
}
