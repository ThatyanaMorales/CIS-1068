
import javax.swing.JOptionPane;

/*
 * This is the game of Pico Fermi Bagel, main class. Here is where the user
 * will play the game. It will call upon the Bagel class
 *Author: Thatyana Morales
 *Contact info: tuf79252@temple.edu
 *Date created: 10/8/15
 */

public class PicoFermiBagel {
    public static void main(String[] args) {
        int answer = 0;
        int result;
        Bagel pumpkinspiceBagel = new Bagel();
        
            do{
            pumpkinspiceBagel.playGame();
            result = JOptionPane.showConfirmDialog(null, "Want to play again?", "PFB", 
                    JOptionPane.YES_NO_OPTION);
            }
        while (answer == result);
    }
    

          
}
