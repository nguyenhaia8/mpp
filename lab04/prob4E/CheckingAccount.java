package lab04.prob4E;

public class CheckingAccount extends Account{
    private String acctId;
    private double balance;
    private double monthlyFee;

    public CheckingAccount(String acctId, double monthlyFee, double balance) {
        this.acctId = acctId;
        this.monthlyFee = monthlyFee;
        this.balance = balance;
    }

    @Override
    public String getAccountID() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdateBalance() {
        return balance - monthlyFee;
    }
}
