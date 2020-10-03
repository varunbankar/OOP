public class Bank implements IBank {

    public FixedDeposit[] fd;
    public SavingsAccount[] sv;
    public LoansAccount[] ln;
    public int numFDS;
    public int numLoans;
    public int numSV;

    public Bank() {
        this.fd = new FixedDeposit[MAX_FDS];
        this.sv = new SavingsAccount[MAX_SAVINGS_ACCOUNT];
        this.ln = new LoansAccount[MAX_LOANS];
        this.numFDS = 0;
        this.numLoans = 0;
        this.numSV = 0;
    }

    public boolean createAccount(char type, int amount, float interestRate, int period) {

        if (type == 'f') {
            if (this.numFDS >= MAX_FDS) return false;
            this.fd[this.numFDS] = new FixedDeposit(amount, interestRate, period);
            this.numFDS++;
            return true;
        }
        else if (type == 's') {
            if (this.numSV >= MAX_SAVINGS_ACCOUNT) return false;
            this.sv[this.numSV] = new SavingsAccount(amount, interestRate, period);
            this.numSV++;
            return true;
        }
        else if (type == 'l') {
            if (this.numLoans >= MAX_LOANS) return false;
            this.ln[this.numLoans] = new LoansAccount(amount, interestRate, period);
            this.numLoans++;
            return true;
        }
        return false;
    }

    public boolean deleteAccount(java.lang.String accno) {
        for (int i = 0; i < this.numSV; i++) {
            if (this.sv[i].accountNumber.compareTo(accno) == 0) {
                for (int j = i; j < this.numSV-1; j++) {
                    this.sv[j] = this.sv[j+1];
                }
                this.sv[this.numSV] = null;
                this.numSV--;
                return true;
            }
        }

        for (int i = 0; i < this.numLoans; i++) {
            if (this.ln[i].accountNumber.compareTo(accno) == 0) {
                for (int j = i; j < this.numLoans-1; j++) {
                    this.ln[j] = this.ln[j+1];
                }
                this.ln[this.numLoans] = null;
                this.numLoans--;
                return true;
            }
        }

        for (int i = 0; i < this.numFDS; i++) {
            if (this.fd[i].accountNumber.compareTo(accno) == 0) {
                for (int j = i; j < this.numFDS-1; j++) {
                    this.fd[j] = this.fd[j+1];
                }
                this.fd[this.numFDS] = null;
                this.numFDS--;
                return true;
            }
        }

        return false;
    }

    public double profitFromLoans() {
        double totalReturns = 0;
        int totalPrincipalAmount = 0;
        for (int i = 0; i < this.numLoans; i++) {
            totalReturns += this.ln[i].getReturns();
            totalPrincipalAmount += this.ln[i].getPrincipalAmount();
        }
        return totalReturns - totalPrincipalAmount;
    }

    public double interestToPay() {
        double totalReturns = 0;
        int totalPrincipalAmount = 0;
        for (int i = 0; i < this.numSV; i++) {
            totalReturns += this.sv[i].getReturns();
            totalPrincipalAmount += this.sv[i].getPrincipalAmount();
        }
        for (int i = 0; i < this.numFDS; i++) {
            totalReturns += this.fd[i].getReturns();
            totalPrincipalAmount += this.fd[i].getPrincipalAmount();
        }
        return totalReturns - totalPrincipalAmount;
    }
}
