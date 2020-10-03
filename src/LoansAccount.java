public class LoansAccount extends Account {

    private float interestRate;
    public static int num = 5000;
    private int period;

    public LoansAccount(int amount, float rate,  int period) {
        super(amount);
        this.interestRate = rate;
        this.period = period;
        LoansAccount.num += 1;
        this.accountNumber = "loan" + LoansAccount.num;
    }

    @Override
    String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    double getReturns() {
        return this.principalAmount * Math.pow(1.0 + (((double) interestRate) / 100), period);
    }

}
