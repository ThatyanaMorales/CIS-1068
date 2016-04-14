
public class BankAccount {

	private String accountNumber;
	private double balance;
	private String accountHolderName;
	private static int numberOfAccounts;
	

	public void deposit(double amount)
	{
		if (amount < 0)
			System.out.println("you can't deposit a negative number");
		else 
			setBalance(getBalance() + amount);
	}
	
	public void withdraw(double amount)
	{
		if (amount > getBalance())
			System.out.println("You can't withdraw more than your account.");
		else
			setBalance(getBalance() - amount);
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public void printReport()
	{
		System.out.println(getAccountNumber());
		System.out.println(getAccountHolderName());
		System.out.println(getBalance());
	}
	
	public static int getNumberOfAccounts()
	{
		return numberOfAccounts;
	}
	
	BankAccount(String accountNumber, double balance, String accountHolderName)
	{
		setAccountNumber(accountNumber);
		deposit(balance);
		setAccountHolderName(accountHolderName);
		numberOfAccounts++;
	}
	
	BankAccount(String accountNumber, String accountHolderName)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		setBalance(0.0);
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
