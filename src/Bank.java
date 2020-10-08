public class Bank implements IBank
{
	public FixedDeposit[] fd;
	public SavingsAccount[] sv;
	public LoansAccount[] ln;
	public int numFDS;
	public int numLoans;
	public int numSV;
	
	public Bank()
	{
		fd=new FixedDeposit[MAX_FDS];
        ln=new LoansAccount[MAX_LOANS];
        sv=new SavingsAccount[MAX_SAVINGS_ACCOUNT];
	}
	
	public boolean createAccount(char type,int amount,float interest,int period) 
	{
        if(type=='f') 
        {
                if(numFDS < MAX_FDS)
                {
                    FixedDeposit fd1 = new FixedDeposit(amount,interest,period);
                    fd[numFDS++]=fd1;
                    return true;
                }
                else
                {
                	return false;
                }
        }
        else if(type=='s')
        {
                if(numSV<MAX_SAVINGS_ACCOUNT)
                {
                    SavingsAccount fd1 = new SavingsAccount(amount,interest,period);
                    sv[numSV++]=fd1;
                    return true;
                }
                else
                {
                	return false;
                }
        }      
        else if(type=='l')
        {
                if(numFDS<MAX_LOANS)
                {
                    LoansAccount fd1 = new LoansAccount(amount,interest,period);
                    ln[numLoans++]=fd1;
                    return true;
                }
                else
                {
                	return false;
                }         
        }
        else
        {
        	return false;
        }
    }	
	public boolean deleteAccount(String accno)
    {
        if(accno.startsWith("sav"))
        {
            for(int i=0;i<numSV;i++)
            {
                if(sv[i].getAccountNumber().equals(accno))
                {
                    sv[i] = null;
                    if (numSV - i + 1 >= 0) System.arraycopy(sv, i + 1, sv, i + 1 - 1, numSV - i + 1);
                    sv[--numSV] = null;
                    return true;
                }
            }
        }
        else if(accno.startsWith("fd"))
        {
            for(int i=0;i<numFDS;i++)
            {
                if(fd[i].getAccountNumber().equals(accno))
                {
                    fd[i] = null;
                    if (numFDS - i + 1 >= 0) System.arraycopy(fd, i + 1, fd, i + 1 - 1, numFDS - i + 1);
                    fd[--numFDS] = null;
                    return true;
                }
            }
        }
        else if(accno.substring(0,4).equals("loan"))
        {
            for(int i=0;i<numLoans;i++)
            {
                if(ln[i].getAccountNumber().equals(accno))
                {
                    ln[i] = null;
                    if (numLoans - i + 1 >= 0) System.arraycopy(ln, i + 1, ln, i + 1 - 1, numLoans - i + 1);
                    ln[--numLoans] = null;
                    return true;
                }
            }
        }
        else 
        {
            return false;
        }
        return false;
    }
	public double profitFromLoans() 
	{
        double profit_loan=0;
        for(int i=0;i<numLoans;i++) 
        {
            if(ln[i]!=null)
            profit_loan+=(ln[i].getReturns()-ln[i].getPrincipalAmount());
        }
        return profit_loan;
    }
	public double interestToPay()
    {
        double interest_to_pay = 0;
        for(int i=0;i<numSV;i++ )
        {
            if(sv[i]!=null)
            	interest_to_pay+= (sv[i].getReturns()-sv[i].getPrincipalAmount() );
        }
        for(int i=0;i<numFDS;i++ )
        {
            if(fd[i]!=null)
            	interest_to_pay+= (fd[i].getReturns()-fd[i].getPrincipalAmount() );
        }
        return interest_to_pay;
    }
}