/*
Name: Jason Tran
Due Date: 11/27/15
Contact Information: jason.tran@temple.edu
Description: BankAccount class allows user creeate an instance of a bank account with several functions
*/
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Bank1 {
    public static void main(String[] args){
        BankAccount[] bankAccounts = new BankAccount[1];
        boolean stop = true;
        
        do{ // All possible selections for user
            Object[] options = {"Add a bank account", "Deposit to an account", 
                "Withdraw from an account", "Print reports for all accounts", 
                "Search for a bank account", "Exit"};
            
            String output = (String) JOptionPane.showInputDialog(null, "How can I help you today?", 
                "Bank of Murica'", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            
            if(output != null){
                switch (output) {
                    // Adds bank accounts by expanding bank account array
                    case "Add a bank account":
                        if(BankAccount.getNumberOfAccounts() >= bankAccounts.length){
                            bankAccounts = resize(bankAccounts);
                        }
                        if(BankAccount.getNumberOfAccounts() < bankAccounts.length){
                            addAccount(bankAccounts);
                        }
                        break;
                    // Allows user deposit money to a specific account    
                    case "Deposit to an account":
                        deposit(bankAccounts);
                        break;
                        
                    case "Withdraw from an account":
                        withdraw(bankAccounts);
                        break;
                        
                    case "Print reports for all accounts":
                        bankSortPrint(bankAccounts);
                        break;
                        
                    case "Search for a bank account":
                        bankSearch(bankAccounts);
                        break;
                        
                    case "Exit":
                        stop = false;
                        JOptionPane.showMessageDialog(null, "Have a nice day! - Bank of Murica'");
                        break;
                }
                
            }else{ // runs if user cancels program
                stop = false;
                JOptionPane.showMessageDialog(null, "Have a nice day! - Bank of Murica'");
            }
        }while(stop);
    }
    // Takes in an array and doubles size if full
    public static BankAccount[] resize(BankAccount[] accounts){
    
        BankAccount[] temp = new BankAccount[accounts.length * 2];
        for(int i = 0; i < accounts.length; i++){
            temp[i] = accounts[i];
        }
        return temp;
    }
    // Adds bank account objects to an array
    public static void addAccount(BankAccount[] accountArray){
           
        String accountNumber = JOptionPane.showInputDialog(null,"What is your account number?");
        String name = JOptionPane.showInputDialog(null,"What is your full name?");
        Double balance = Double.parseDouble(JOptionPane.showInputDialog(null,"What is the balance"));
        //If user does not given suffiecent information, the if statement runs
        if(accountNumber.trim().equals("") || name.trim().equals("")){
            JOptionPane.showMessageDialog(null, "There was an error when you input your information in. Please try again.");
        }else{
            int openSpace = BankAccount.getNumberOfAccounts();
            //Determines which constructor to use depending on given information
            if(balance >= 0){
                BankAccount newAccount = new BankAccount(accountNumber,balance,name);
                accountArray[openSpace] = newAccount;
            }else{
                BankAccount newAccount = new BankAccount(accountNumber,name);
                accountArray[openSpace] = newAccount;
            }
        }
    }
    // Allows user to deposit money into a specific account
    public static void deposit(BankAccount[] accountArray){
        String accountNumber = JOptionPane.showInputDialog("What is the account number?");
        Double depositAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would you like to deposit?"));
        double arraySlot = -1;
        int actualSize = 0;
        //Finds the number of actual accounts
        for(int i = accountArray.length - 1; i >= 0; i--){
            if(accountArray[i] == null){
                actualSize = i;
            }
        }
        //Loops through every account to find one with matching number and deposits into it
        for(int i = 0; i < actualSize; i++){
            if(accountArray[i].getAccountNumber().equals(accountNumber)){
                accountArray[i].deposit(depositAmount);
                arraySlot = i;
            }
        }
        if(arraySlot < 0){
            JOptionPane.showMessageDialog(null,"Unable to find that account, please try again.");
        }
    }
    // Allows user to with money from a specific account
    public static void withdraw(BankAccount[] accountArray){
        String accountNumber = JOptionPane.showInputDialog("What is the account number?");
        Double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would you like to withdraw?"));
        double arraySlot = -1;
        
        int actualSize = 0;
        // Find actual number of bank accounts
        for(int i = accountArray.length - 1; i >= 0; i--){
            if(accountArray[i] == null){
                actualSize = i;
            }
        }
        //Loops through every account to find matching number and withrdaws from it
        for(int i = 0; i < actualSize; i++){
            if(accountArray[i].getAccountNumber().equals(accountNumber)){
                accountArray[i].withdraw(withdrawAmount);
                arraySlot = i;
            }
        }
        if(arraySlot < 0){
            JOptionPane.showMessageDialog(null,"Unable to find that account, please try again.");
        }
    }
  
    public static void bankSortPrint(BankAccount[] accountArray){
    
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

    public static void bankSearch(BankAccount[] accountArray){
    
        String accountName = JOptionPane.showInputDialog(null,"What is the name of the account you are looking for?");
        int actualSize = 0;
        int count = 0;
       
        for(int i = accountArray.length - 1; i >= 0; i--){
            if(accountArray[i] == null){
                actualSize = i;
            }
        }
       
        for(int i = 0; i < actualSize; i++){
        
            String temp = accountArray[i].getAccountHolderName();
            int arraySlot = temp.toLowerCase().indexOf(accountName.toLowerCase());
            if(arraySlot != -1){
                accountArray[i].printReport();
                count++;
            }
        }
    
        if(count == 0){
            JOptionPane.showMessageDialog(null, "No account name matched input");
        }
    }
}
