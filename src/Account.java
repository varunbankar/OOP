import java.lang.Math; 

public abstract class Account {
	protected java.lang.String accountNumber ;
	protected int principalAmount;
	public Account(int amount) {
		principalAmount = amount;
	}
	public int getPrincipalAmount() {
		return principalAmount;
	}
	public static double pow(double a, int b) {
		return Math.pow(a, b);
	}
	public abstract java.lang.String getAccountNumber() ;
	public abstract double getReturns() ; 
}