import java.util.Scanner;
public class ChangeMaker
{
    public static void main (String [] args)
    {   
    
        int itemPrice, amountPaid, changeRequired, 
            quarters, dimes, nickels, pennies;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Welcome to the \"Spare Change!\" Dollar Store");
        System.out.println("Please enter the price of your item and the amount ");
        System.out.println("you paid in whole numbers please");
        System.out.println("I will tell you your change and coins needed");
        
        itemPrice = keyboard.nextInt ();
        amountPaid = keyboard.nextInt ();
        changeRequired = amountPaid - itemPrice;
        
        quarters = changeRequired / 25;
        changeRequired = changeRequired % 25;
        dimes = changeRequired / 10;
        changeRequired = changeRequired % 10;
        nickels = changeRequired / 5;
        changeRequired = changeRequired % 5;
        pennies = changeRequired / 1;
        
        changeRequired = amountPaid - itemPrice;
        
        System.out.println(changeRequired + " cents in change can be given as ");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
        
        System.out.println("Thank you for shopping at \"Spare Change!\","
                + " where everything we sell makes cents!");
    }
}