package lab05.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Customer createCustomer(String name) {
        return new Customer(name);
    }

    public static Order createOrder(Customer customer, LocalDate date) {
        if(customer == null) throw new NullPointerException("Null customer");
        Order order = new Order(date);
        customer.addOrder(order);
        return order;
    }
}
