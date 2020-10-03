public class SavingsAccount extends Account {

    private float interestRate;
    private char[] lastFiveTransactions;
    public static int num = 2000;
    private int period;

    public SavingsAccount(int amount, float rate, int period) {
        super(amount);
        this.interestRate = rate;
        this.period = period;
        SavingsAccount.num += 1;
        this.accountNumber = "sav" + SavingsAccount.num;
        lastFiveTransactions = new char[5];
    }


    @Override
    String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    double getReturns() {
        return this.principalAmount + (((this.principalAmount) * (interestRate * period)) / 100);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.principalAmount += amount;
            this.updateLastFiveTransactions('d');
        }
    }

    public boolean withdraw(int amount) {
        if (amount < this.principalAmount) {
            principalAmount -= amount;
            this.updateLastFiveTransactions('w');
            return true;
        }
        return false;
    }

    public java.lang.String getLastFiveTransactions() {
        StringBuilder lastFiveTransactionsString = new StringBuilder();
        for (char c: this.lastFiveTransactions) {
            if (c != '\u0000') {
                lastFiveTransactionsString.append(c);
            }
        }
        return lastFiveTransactionsString.toString();
    }

    private void updateLastFiveTransactions(char type) {
        for (int i = 0; i < 4; i++) {
            this.lastFiveTransactions[i] = this.lastFiveTransactions[i+1];
        }
        this.lastFiveTransactions[4] = type;
    }

}
