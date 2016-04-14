public class CheckingAccount extends BankAccount {

	CheckingAccount(String accountNumber, double balance, String accountHolderName) {
		super(accountNumber, balance, accountHolderName);
	
	}
	
	CheckingAccount(String accountNumber, String accountHolderName) {
		super(accountNumber, accountHolderName);
		
	}

@Override
public void withdraw(double amount) ///////withdraw from checking
{
	double balance = getBalance();
	double OVERDRAFT = 10;
	if (amount > getBalance()) ///////if the amount exceeds the balance
		if (amount > (getBalance() + 100))
			System.out.println("You cant withdraw more than $100 past your balance.");
		else 
			balance = balance - amount - OVERDRAFT;
}


public void writeCheck(double amount)
{
	double balance = getBalance();
	double OVERDRAFTCHECK = 35;
	if ((amount > balance) && (amount <= (balance + 100))) ///////if amount is bigger than balance but smaller than exceeding by 
		withdraw(amount);
	if (amount > (balance + 100))
		balance = balance - amount - OVERDRAFTCHECK;
		
}
	
	
}
