/*
*Author: Thatyana Morales
*This program will ask you to enter 3 sides of a triangle 
The program will output what type of triangle your sides create as well as 
the area of your triangle
*tuf79252@temple.edu
*Due Date: 9/28/15 at 11:59 PM
 */
import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TypeofTriangle {
    
    public static void main (String [] args)
    {
        
       
        Scanner input = new Scanner (JOptionPane.showInputDialog("Please enter "
                        + "3 values for the" + " sides of a triangle"));
                
        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        double sideC = input.nextDouble();
        double smallestSide = Math.min((Math.min(sideA, sideB)), sideC);
        double biggestSide = Math.max((Math.max(sideA, sideB)), sideC);
        double middleSide = ((sideA + sideB + sideC) - (smallestSide + biggestSide));
        
        
        
        if ((biggestSide > (smallestSide + middleSide))){
            
                JOptionPane.showMessageDialog(null, "This isn't a triangle");
        }
        
        else
        
        {
            
        if ((sideA == sideB) && (sideB == sideC))
            
                JOptionPane.showMessageDialog(null, "This triangle "
                        + "is Equilateral.");
        
        if (((smallestSide * smallestSide) + (middleSide * middleSide)) == 
                (biggestSide * biggestSide))
               
                JOptionPane.showMessageDialog(null, "This triangle "
                        + "is Right");
        
        if (((smallestSide * smallestSide) + (middleSide * middleSide)) < 
                (biggestSide * biggestSide))
             
                JOptionPane.showMessageDialog(null, "This triangle "
                        + "is Obtuse");
        
        if (((smallestSide * smallestSide) + (middleSide * middleSide)) > 
                (biggestSide * biggestSide))
             
                JOptionPane.showMessageDialog(null, "This triangle "
                        + "is Acute");
        
        if (((sideA == sideB) && (sideA > sideC)) || 
                ((sideB == sideC) && (sideB > sideA)) || 
                ((sideA == sideC) && (sideA > sideB)))
            
                JOptionPane.showMessageDialog(null, "This is also Isosceles");
        
            
        }
       double HalfPerimeter =  ((sideA + sideB + sideC) / 2);  
      
       JOptionPane.showMessageDialog(null, "And the area of your triangle with"
               + " sides " + sideA + ", " + sideB + ", and " + sideC +
       " is " + (Math.sqrt(HalfPerimeter * (HalfPerimeter - sideA) *
               (HalfPerimeter - sideB) * (HalfPerimeter - sideC))));
        
       
    }
    
    
    
}

