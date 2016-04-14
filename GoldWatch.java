/*
 *Author: Thatyana Morales
 *Contact info: thatyana.morales@temple.edu, tuf79252@temple.edu
 *Date created:9/29/15
 *When run, this program will ask for the age and amount of years the 
  person has worked for the company and it will output what gift that person
  shall receive. 
 */


//THIS IS THE MULTIBRANCH IF ELSE
/*
import javax.swing.JOptionPane;
import java.util.Scanner;
public class GoldWatch
{
    public static void main (String [] args)
    {
      
        
       
        Scanner keyboard = new Scanner (JOptionPane.showInputDialog("Please enter "
                + "age and years worked in that order: "));
        
        int Age = keyboard.nextInt();
        int yearsWorked = keyboard.nextInt();
                
        if (yearsWorked >= Age)
            JOptionPane.showMessageDialog(null, "There is no way "
                    + "that you worked for as many/more years than your age");
        
        else if (Age >= 65)
            JOptionPane.showMessageDialog(null, "A gold watch is "
                    + "bestowed upon you");
        
        else if (yearsWorked >= 25) 
            JOptionPane.showMessageDialog(null, "Thou shalt"
                        + " receiveth a silver watch.");
            
        else 
            JOptionPane.showMessageDialog(null, "You get a "
                        + "really nice pen.");
       
    }
}
*/    







//THIS IS THE NESTED IF ELSE PART
/*
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GoldWatch
{
    public static void main (String [] args)
    {
      
        
       
        Scanner keyboard = new Scanner (JOptionPane.showInputDialog("Please enter "
                + "age and years worked in that order: "));
        
        int Age = keyboard.nextInt();
        int yearsWorked = keyboard.nextInt();
                
        if (yearsWorked >= Age)
            JOptionPane.showMessageDialog(null, "There is no way "
                    + "that you worked for as many/more years than your age");
        
        else 
                if (Age >= 65)
                JOptionPane.showMessageDialog(null, "A gold watch is "
                    + "bestowed upon you");
        
                else if (Age < 65) 
                
                     if (yearsWorked >= 25) 
                        JOptionPane.showMessageDialog(null, "Thou shalt"
                        + " receiveth a silver watch.");
            
                else 
                        JOptionPane.showMessageDialog(null, "You get a "
                        + "really nice pen.");
       
    

    }
}

*/

import java.util.Scanner;
public class GoldWatch
{
    public static void main (String [] args)
    {
      
      System.out.println("Please enter age and number of years worked here: ");
      Scanner keyboard = new Scanner(System.in);
      int Age = keyboard.nextInt();
      int yearsWorked = keyboard.nextInt();
      boolean meetsCriteria;
      
      
if ((Age >= 65) || (yearsWorked >= 25)) {
    
    meetsCriteria = true;
    System.out.println("Gold watch for you!");
} else {
    System.out.println("You get nothing. Sorry about that. There's the door.");
}

    }
}