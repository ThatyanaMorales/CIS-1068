


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annettecruz
 */
public class Balloon {
private int altitude;
private String color;

public String getColor(){
return color;}

public void setColor(String newColor){
color = newColor;
}

public void increaseAltitude(int amount){
altitude = altitude + amount;
if (amount < 0)
    if ((amount + altitude) < 0)
            System.out.println("A balloon cannot have negative altitude");

}
public int getAltitude(){

return altitude;}

public void setAltitude(int newAltitude){
altitude = newAltitude;
}

public boolean equals(Balloon balloon){
if ((this.getColor().equalsIgnoreCase(balloon.getColor())) && 
     this.getAltitude() == balloon.getAltitude())

return true;
else return false;


}
        
        






}
