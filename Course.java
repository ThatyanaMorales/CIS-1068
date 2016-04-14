/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annettecruz
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Course {

    
    public static void main(String[] args) {
       String input;
        do{
        input = JOptionPane.showInputDialog(null, "Enter name and gpa");
        if (input.length() > 0){
        Scanner keyboard = new Scanner(input);
        String name = keyboard.next();
        double gpa = keyboard.nextDouble();
        Student nextStudent = new Student(name, gpa);
      }
        
        }
        while (input.length() > 0);
        
        Student.printReport();
    }
}

