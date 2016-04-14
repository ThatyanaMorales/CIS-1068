
public class SavingAccount extends BankAccount {

	SavingAccount(String accountNumber, double balance, String accountHolderName) 
	{
		super(accountNumber, balance, accountHolderName);
	}
		
	SavingAccount(String accountNumber, String accountHolderName) 
	{
		super(accountNumber, accountHolderName);	
	}

static int numberOfWithdraws = 0;
@Override
public void withdraw(double amount) ///////withdraws from savings account
{
	double balance = getBalance(); ///////sets balance as a variable
	numberOfWithdraws++;
	
	if (numberOfWithdraws > 6) ///////only a max of 6 withdraws per savings account
		System.out.println("Only up to 6 withdraws per savings acct.");
	else 
		if (amount > balance) ///////won't allow to withdraw more than balance
			System.out.println("You cant withdraw more than balance.");
		else
			super.withdraw(amount);
	
	
}
	
	
}
