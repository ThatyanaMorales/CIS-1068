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
public class ArrayTester {
    public static void main(String[] args) {
       
        String size1 = JOptionPane.showInputDialog(null, "How many students"
                + " would you like to add??????????????????????");
        
        int size = Integer.parseInt(size1);
     
        Student [] newStudent = new Student [size];
   
Object[] options = {"Add a new student",
                    "Search for a student",
                    "Exit"};
int answer;
        int slot = 0;
        do{  
            answer = JOptionPane.showOptionDialog(null, "What would you like to do?", 
                "Student", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, options, options[2]);

            if (answer == JOptionPane.YES_OPTION)
            {
                
                String str = JOptionPane.showInputDialog(null, "Enter student's name and id");
                Scanner keyboard = new Scanner(str);
                String name = keyboard.next();
                String id = keyboard.next();
                Student s1 = new Student(name, id);
                newStudent[slot] = s1;
                slot++;
                
            }
            
            if (answer == JOptionPane.NO_OPTION)
            {
                String inputID = JOptionPane.showInputDialog(null, "Plz enter ID yo");
                Student s2 = new Student("No name", inputID);
                for (int i = 0; i < size; i++){
                    if (newStudent[i].equals(s2)){
                        System.out.println(newStudent[i].getName());
                    }else{ 
                        System.out.println("no match found");
                    }
                }
            }

            if (answer == JOptionPane.CANCEL_OPTION)
                JOptionPane.showMessageDialog(null, "Goodbye", null, JOptionPane.OK_OPTION);
            }
        while (answer != JOptionPane.CANCEL_OPTION);
        }
}

