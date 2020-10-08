public class SavingsAccount extends Account {
    private float interestRate;
    private int period;
    public static int num = 2000;
    private char[] lastFiveTransactions = new char[5];
    public SavingsAccount(int amount, float rate, int period) {
        super(amount);
        this.principalAmount = amount;
        interestRate = rate;
        this.period = period;
        num++;
        this.accountNumber = "sav"+num;
    }
    public double getReturns() {
        return (((getPrincipalAmount()) * (interestRate * period)) / 100) + getPrincipalAmount();
    }
    public java.lang.String getAccountNumber() {
        return this.accountNumber;
    }
    public void deposit(int amount) {
        this.principalAmount += amount;
        if (lastFiveTransactions.length - 1 >= 0)
            System.arraycopy(lastFiveTransactions, 1, lastFiveTransactions, 0, lastFiveTransactions.length - 1);
        lastFiveTransactions[4] = 'd';
    }
    public boolean withdraw(int amount) {
        if (this.principalAmount > amount) {
            this.principalAmount -= amount;
            if (lastFiveTransactions.length - 1 >= 0)
                System.arraycopy(lastFiveTransactions, 1, lastFiveTransactions, 0, lastFiveTransactions.length - 1);
            lastFiveTransactions[4] = 'w';
            return true;
        }
        else {
            return false;
        }
    }
    public java.lang.String getLastFiveTransactions() {
        String lastTran = "";
        for (char lastFiveTransaction : lastFiveTransactions) {
            lastTran = lastTran + lastFiveTransaction;
        }
        return lastTran;
    }
}