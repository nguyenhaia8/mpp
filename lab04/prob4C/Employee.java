package lab04.prob4C;

public abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public PayCheck calcCompensation(int month, int year) {
        double gross = calcGrossPay(month, year);
        return new PayCheck(gross);
    }

    public abstract double calcGrossPay(int month, int year);

    public void print() {
        System.out.println("Employee ID: " + empId);
    }
}
