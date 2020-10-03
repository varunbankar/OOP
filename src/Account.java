public abstract class Account {

    protected String accountNumber;
    protected int principalAmount;

    public Account(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be less than 0");
        this.principalAmount = amount;
    }

    public int getPrincipalAmount() {
        return this.principalAmount;
    }

    public static double pow(double a, int b) {
        return Math.pow(a, b);
    }

    abstract String getAccountNumber();

    abstract double getReturns();

}
