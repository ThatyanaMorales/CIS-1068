/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annettecruz
 */
public class BalloonTester {
    public static void main(String[] args) {
        Balloon s1 = new Balloon();
        Balloon s2 = new Balloon();
        
        /*
        s1.setColor("Red");
        s1.setAltitude(50);
        s2.setColor("Blue");
        s2.setAltitude(2 * s1.getAltitude());
        
        if (s1.equals(s2))
            System.out.println("They are equal");
        else
            System.out.println("They are NOT equal");
                */
        
        s1.setColor("Red");
        s1.setAltitude(-100);
        s2.setColor("red");
        s2.setAltitude(2 * s1.getAltitude());
        s2.increaseAltitude(-((9 * s2.getAltitude()) / 10));
        s1.increaseAltitude(10);
        if (s1.equals(s2))
            System.out.println("They are equal");
        else
            System.out.println("They are NOT equal");
    }
}
