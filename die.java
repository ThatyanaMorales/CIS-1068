import javax.swing.JOptionPane;
 import java.util.Scanner;
 
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
 *
 * @author tuf79252
 */
 public class DieTester {
 public static void main(String[] args) { 
 int answer = 0;
 int result;
 Die sixside = new Die();
 
 do{
 String rollers = JOptionPane.showInputDialog(null, "Enter the number of rolls: ");
 int rollersInt = Integer.parseInt(rollers);
 sixside.rollPercentage(rollersInt);
 
 result = JOptionPane.showConfirmDialog(null, "Want to play again?", "Roll", JOptionPane.YES_NO_OPTION);
 }
 while (answer == result);
 
 
 }
 }
 
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
 *
 * @author tuf79252
 */
 import java.util.Random;
 
 public class Die {
 private int number;
 public void rollPercentage(int numberOfRolls){
 int roll1 = 0;
 int roll2 = 0;
 int roll3 = 0;
 int roll4 = 0;
 int roll5 = 0;
 int roll6 = 0;
 for (int i = 0; i <= numberOfRolls; i++)
 {roll(); 
 
 if (number == 1)
 roll1 = ++roll1;
 if (number == 2)
 roll2 = ++roll2;
 if (number == 3)
 roll3 = ++roll3;
 if (number == 4)
 roll4 = ++roll4;
 if (number == 5)
 roll5 = ++roll5;
 if (number == 6)
 roll6 = ++roll6;}
 
 System.out.println("Total rolls: " + numberOfRolls);
 System.out.println("1: " + roll1 + " rolls - " + ((double) roll1 / numberOfRolls) + " percent");
 System.out.println("2: " + roll2 + " rolls - " + ((double) roll2 / numberOfRolls) + " percent");
 System.out.println("3: " + roll3 + " rolls - " + ((double) roll3 / numberOfRolls) + " percent");
 System.out.println("4: " + roll4 + " rolls - " + ((double) roll4 / numberOfRolls) + " percent");
 System.out.println("5: " + roll5 + " rolls - " + ((double) roll5 / numberOfRolls) + " percent");
 System.out.println("6: " + roll6 + " rolls - " + ((double) roll6 / numberOfRolls) + " percent");
 
 }
 
 private int roll(){
 Random rnd = new Random();
 
 number = rnd.nextInt(6)+1;
 
 return number;
 
 }
 
 
 
 }