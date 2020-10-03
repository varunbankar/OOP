public class FixedDeposit extends Account {

    private float interestRate;
    public static int num = 1000;
    private int period;

    public FixedDeposit(int amount, float rate, int period) {
        super(amount);
        this.interestRate = rate;
        this.period = period;
        FixedDeposit.num += 1;
        this.accountNumber = "fd" + FixedDeposit.num;
    }

    @Override
    String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    double getReturns() {
        return this.principalAmount * (Math.pow(1.0 + (((double) interestRate) / 100), period));
    }

}
