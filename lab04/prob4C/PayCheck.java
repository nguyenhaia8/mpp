package lab04.prob4C;

public final class PayCheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public PayCheck(double grossPay) {
        this.grossPay = grossPay;
        this.fica = 0.23 * grossPay;
        this.state = 0.05 * grossPay;
        this.local = 0.01 * grossPay;
        this.medicare = 0.03 * grossPay;
        this.socialSecurity = 0.075 * grossPay;
    }

    public double getNetPay() {
        return grossPay - (fica + state + local + medicare + socialSecurity);
    }

    public void print() {
        System.out.printf(
                """
                Gross Pay: $%.2f
                FICA: $%.2f
                State: $%.2f
                Local: $%.2f
                Medicare: $%.2f
                Social Security: $%.2f
                Net Pay: $%.2f
                """, grossPay, fica, state, local, medicare, socialSecurity, getNetPay());
    }

}
