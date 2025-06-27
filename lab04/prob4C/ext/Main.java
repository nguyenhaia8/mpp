package lab04.prob4C.ext;

import lab04.prob4C.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Hourly("EMP01", 25, 40);
        Employee emp2 = new Salaried("EMP2", 5000);
        Commissioned emp3 = new Commissioned("EMP3", 0.1, 2000);

        emp3.addOrder(new Order("ORDER001", LocalDate.of(2025, 6, 15), 5000));
        emp3.addOrder(new Order("ORDER002", LocalDate.of(2025, 6, 25), 3000));
        emp3.addOrder(new Order("ORDER003", LocalDate.of(2025, 7, 25), 9000));

        System.out.println("Hourly Employee Paycheck:");
        emp1.calcCompensation(6, 2025).print();
        System.out.println();

        System.out.println("Salaried Employee Paycheck:");
        emp2.calcCompensation(6, 2025).print();
        System.out.println();

        System.out.println("Commissioned Employee Paycheck:");
        emp3.calcCompensation(6, 2025).print();
        System.out.println();
    }
}
