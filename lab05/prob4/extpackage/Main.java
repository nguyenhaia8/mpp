package lab05.prob4.extpackage;

import java.time.LocalDate;

import lab05.prob4.CustOrderFactory;
import lab05.prob4.Customer;
import lab05.prob4.Order;

public class Main {
	public static void main(String[] args) {
//		Customer cust = new Customer("Bob");
//		Order order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Shirt");
//		order.addItem("Laptop");
//
//		order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Pants");
//		order.addItem("Knife set");

		Customer cust = CustOrderFactory.createCustomer("John Doe");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		Order order2 = CustOrderFactory.createOrder(cust, LocalDate.now());
		order2.addItem("Pants");
		order2.addItem("Knife set");



		System.out.println(cust.getOrders());
	}
}

		
