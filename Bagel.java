
/*

secretnumber: do while, enter negative numver if want to exit

 */

/**
 *
 * @author annettecruz
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class Bagel {
private int firstGuess; 
private int secondGuess;
private int thirdGuess;
private int secret1;
private int secret2;
private int secret3;
private String myGuess = "";
int guessCount = 0;
int answer = 1;

   
/*
Starts a new round of the game by generating a new number and asking the user to guess until
there is a match
*/
public void playGame(){
    generateSecretNumber();
    welcomeMessage();
    do{
    myGuess = JOptionPane.showInputDialog("Enter a 3 digit number");
    
    if (myGuess != null && myGuess.length() == 3)
    {
        isGuessCorrect(myGuess);
        if (isGuessCorrect(myGuess) == true)
            System.out.println("Winner!");
        else printHint(myGuess);
            System.out.println("Your Guess: " + myGuess);
            System.out.println("Tries: " + ++guessCount);
            System.out.println("");
    }
    else if(myGuess == null){System.out.println("you lost");}
    
    else {
            JOptionPane.showInputDialog("Enter a 3 digit number once again");
            }}
    while (isGuessCorrect(myGuess) == false || myGuess == null);
   
    
    
}

/*
Generates a secret 3-digit number that the user has to guess.
*/

private void welcomeMessage(){
JOptionPane.showMessageDialog(null, "Welcome to the game Pico Fermi Bagel!"
    + "\n The computer will generate a \"secret\" three digit number at random. \n"
    + "\n The first number will not be 0, and all the digits will be different.\n"
    + "\n The user tries to guess the number.\n"
    + "\n If the user guesses correctly, then the game is over.\n"
    + "\n If not, the computer gives a hint and the player tries again.\n",
       "PFB", JOptionPane.OK_OPTION);
    
    JOptionPane.showMessageDialog(null, "Fermi: correct number in the correct place"
            + "\n Pico: correct number in the wrong place\n"
            + "\n Bagels: none of the digits match\n", 
            "PFB", JOptionPane.OK_OPTION);
    }

private void generateSecretNumber(){
    Random rnd = new Random();
    
    secret1 = rnd.nextInt(9)+1; //first digit of secret number, range 1-9
    secret2 = rnd.nextInt(10); //2nd digit range 0-9
    secret3 = rnd.nextInt(10); //3rd digit range 0-9
    
    if (secret1 == secret2)
    secret2 = rnd.nextInt(10); //reevaluate if equal to s1
    
         
        if ((secret3 == secret2) || (secret3 == secret1))
        secret3 = rnd.nextInt(10); //reassign if equal to s2 or s1
         
    
}

/*
Evaluate the user's guess. Return true if correct, false if not correct.
*/
private boolean isGuessCorrect(String myGuess) 
{
//break up myGuess into 3 digits and run thru equality of ints
    firstGuess = Integer.parseInt(myGuess.substring(0, 1)); //integer versions of string
    secondGuess = Integer.parseInt(myGuess.substring(1, 2));
    thirdGuess = Integer.parseInt(myGuess.substring(2, 3));
    
    if ((firstGuess == secret1) && 
        (secondGuess == secret2) &&
        (thirdGuess == secret3))
   
return true;

else return false;
    
}

/*
Print hints to System.out to help the user guess the correct number
*/
private void printHint(String myGuess){
//fermi 
firstGuess = Integer.parseInt(myGuess.substring(0, 1)); 
    secondGuess = Integer.parseInt(myGuess.substring(1, 2));
    thirdGuess = Integer.parseInt(myGuess.substring(2, 3));  
if (firstGuess == secret1)
        System.out.println("fermi");
if (secondGuess == secret2)
        System.out.println("fermi");
if (thirdGuess == secret3)
        System.out.println("fermi");
//pico
if (firstGuess != secret1)
    if ((firstGuess == secret2) || (firstGuess == secret3))
        System.out.println("pico");
if (secondGuess != secret2)
    if ((secondGuess == secret1) || (secondGuess == secret3))
        System.out.println("pico");
if (thirdGuess != secret3)
    if ((thirdGuess == secret1) || (thirdGuess == secret2))
        System.out.println("pico");


if ((secondGuess != secret3) && (firstGuess != secret1) && (firstGuess != secret2) &&
        (secondGuess != secret3) && (secondGuess != secret1) && (secondGuess != secret2) &&
        (thirdGuess != secret1) && (thirdGuess != secret2) && (thirdGuess != secret3))
    System.out.println("bagels");
    
    
}
}