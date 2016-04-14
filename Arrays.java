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

public class Arrays {
static int[] myNumbers = new int[100];
       
    
public static void main(String[] args) {
System.out.println("The numbers stored in the array are: ");
printAllNumbers();
System.out.println(); 
System.out.println("The largest number is: ");
printLargestNumber();
System.out.println(); 
System.out.println("The average number is: ");
printAverageNumber();
System.out.println(); 
System.out.println("Every other number is: ");
printEveryOtherNumber();
System.out.println(); 
System.out.println("Even numbers are: ");
copyAndPrintEvenNumbers();
System.out.println(); 
    } 
      
public static void printAllNumbers(){
       
    Random rnd = new Random();    
        for (int i = 0; i < 100; i++){
            myNumbers[i] = rnd.nextInt(99)+1;
        System.out.println(myNumbers[i]);  
        }
}

public static void printLargestNumber(){
int max = Integer.MIN_VALUE;
 for (int i = 0; i < 100; i++)
 {max = Math.max(max, myNumbers[i]);}
    System.out.println(max);
}

public static void printAverageNumber(){
int sum = 0;
for (int i = 0; i < 100; i++)
{sum = sum + myNumbers[i]; }
double average = sum / 100;
    System.out.println(average);
}

public static void printEveryOtherNumber(){
for (int i = 0; i < 100; i+=2)
{System.out.println(myNumbers[i]);
}
}

public static void copyAndPrintEvenNumbers(){
int count = 0;
    for (int index = 0; index < 100; index++)
{if ((myNumbers[index] % 2) == 0)
    count++;
}
    
    int[] myEvenNumbers = new int[count];
    int counterTwo = 0;
    for(int x = 0; x < 100; x++){
        if(myNumbers[x] % 2 == 0){
            myEvenNumbers[counterTwo] = myNumbers[x];
            counterTwo++;}}
  for (int a = 0; a <= count; a++)
        System.out.println(myEvenNumbers[a]);          
}}