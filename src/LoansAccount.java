public class LoansAccount extends Account {
	private float interestRate;
	public static int num=5000;
	private int period;
	public LoansAccount(int amount,float rate, int period) {
		super(amount);
		this.interestRate = rate;
		this.period = period;
		num++;
		this.accountNumber = "loan"+num;
	}
	public java.lang.String getAccountNumber(){
		return this.accountNumber;
	}
	public double getReturns(){
		return getPrincipalAmount()*(pow(1.0+ (((double)interestRate)/100),period));
	}
}