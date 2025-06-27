package lab04.prob4E;

public class SavingsAccount extends Account{
    private String acctId;
    private double interestRate;
    private double balance;

    public SavingsAccount(String acctId, double interestRate, double balance) {
        this.acctId = acctId;
        this.interestRate = interestRate;
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
        return balance + (interestRate * balance);
    }
}
