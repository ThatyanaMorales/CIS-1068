import javax.swing.JOptionPane;
import java.util.Scanner;
public class Bank {
	
public static void main(String [] args)
{
	BankAccount [] accountArray = new BankAccount[1];
	
	Object[] options = 
		{"Add a new account", 
		 "Deposit to an account",
		 "Withdraw from an account",
		 "Sort all and print report",
		 "Search for a Bank Account",
		 "Exit"
		};
	
	int answer;
	int index;
	do
	{
		answer = JOptionPane.showOptionDialog(null, 
				"What would you like to do?", 
				"Bank Account", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, options, options[5]);
		
		if (answer == 0) //add a new account
		{
			index = 0;
			String stud = JOptionPane.showInputDialog(null, "Enter account number, balance, and name");
			Scanner keyboard = new Scanner(stud);
			String number = keyboard.next();
			double balance = keyboard.nextDouble();
			String name = keyboard.next();

			if (BankAccount.getNumberOfAccounts() >= accountArray.length)
			{
				BankAccount [] secondArray = new BankAccount[(accountArray.length) * 2];
				for (int i = 0; i < accountArray.length; i++)
				{
					secondArray[i] = accountArray[i];
				}
				accountArray = secondArray;
			}
			
			if ((number.equals("") || (name.equals(""))))
			{
				System.out.println("Error: Account number and name must be entered.");
			}
			else if (balance > 0.0)
			{
				BankAccount newAccount = new BankAccount(number, balance, name);
				accountArray[index] = newAccount;
			}
			else if (balance <= 0.0)
			{
				BankAccount newAccount = new BankAccount(number, name);
				accountArray[index] = newAccount;
			}
			index++;
			
		}
		
		if (answer == 1) //deposit to an amount
		{
			String acct = JOptionPane.showInputDialog("Please enter account number and deposit amount");
			Scanner keyboard = new Scanner(acct);
			String searchNumber1 = keyboard.next();
			double depositAmount = keyboard.nextDouble();
			
			double arraySlot = -1;
			int actualSize = 0;
			
			for (int i = 0; i < accountArray.length - 1; i++)
			{
				if (accountArray[i] == null)
				{
					actualSize = i;
				}
			}
			
			for (int i = 0; i < actualSize; i++)
			{
				if (accountArray[i].getAccountNumber().equals(searchNumber1)){
					accountArray[i].deposit(depositAmount);
				arraySlot = i;}
				
				}
			if (arraySlot < 0)
			{
				System.out.println("Error: There is no account with this number in our records");
			}
		}
		
		if (answer == 2) // withdraw from an amount
		{
			String acct = JOptionPane.showInputDialog("Please enter account number and withdraw amount");
			Scanner keyboard = new Scanner(acct);
			String searchNumber2 = keyboard.next();
			double withdrawAmount = keyboard.nextDouble();
			
			double arraySlot = -1;
			int actualSize = 0;
			
			for (int i = 0; i < accountArray.length - 1; i++)
			{
				if (accountArray[i] == null)
				{
					actualSize = i;
				}
			}
			
			for (int i = 0; i < actualSize; i++)
			{
				if (accountArray[i].getAccountNumber().equals(searchNumber2))
					accountArray[i].withdraw(withdrawAmount);
				arraySlot = i;
				
				}
			if (arraySlot < 0)
			{
				System.out.println("Error: There is no account with this number in our records");
			}
		}
		
		if (answer == 3) // sort all based on balance in descending, and print report of all accounts as well as total # of accts and total and average balance
		{
			sortArray (accountArray);
				
		}
		
		if (answer == 4) // search for a bank account
		{
			String name = JOptionPane.showInputDialog("Please enter name");
			int actualSize = 0;
			int count = 0;
			
			for (int i = 0; i < accountArray.length - 1; i++)
			{
				if (accountArray[i] == null)
				{
					actualSize = i;
				}
			}
			
			 for(int i = 0; i < actualSize; i++){
			        
		            String temp = accountArray[i].getAccountHolderName();
		            int arraySlot = temp.toLowerCase().indexOf(name.toLowerCase());
		            if(arraySlot != -1){
		                accountArray[i].printReport();
		                count++;
		            }
		        }
		}
		
		}
	while (answer != 5);
	}
	
public static void sortArray(BankAccount[] accountArray){
    
    int total = 0;
  
    int actualSize = 0;
    for(int i = accountArray.length - 1; i >= 0; i--){
        if(accountArray[i] == null){
            actualSize = i;
        }
    }
  
    for(int i = 0; i < actualSize - 1; i++){
        int arraySlot = i;
        for(int j = i; j < actualSize; j++){
            if(accountArray[j].getBalance() > accountArray[arraySlot].getBalance()){
                arraySlot = j;
            }
        }
        BankAccount larger = accountArray[arraySlot];
        accountArray[arraySlot] = accountArray[i];
        accountArray[i] = larger;
    }
 
    for(int i = 0; i < actualSize; i++){
        total += accountArray[i].getBalance();
        accountArray[i].printReport();
    }
    double average = (double) total / BankAccount.getNumberOfAccounts();
    System.out.println("Total balance is: " + total); 
    System.out.println("Average balance is: " + average);
}
}
