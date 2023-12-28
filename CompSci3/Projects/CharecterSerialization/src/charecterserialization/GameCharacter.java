package charecterserialization;

import java.io.*;

/**
 *
 * @author Caelan Kimball
 */
public class GameCharacter implements Serializable{
    int power;
    String type;
    String[] weapons;
    
    public GameCharacter(){
        
    }
    public GameCharacter(int p, String t, String[] w){
        power = p;
        type = t;
        weapons = w;
    }
    public int getPower(){
        return power;
    }
    public String getWeapons(){
        String weaponList = "";
        
        for(int i = 0; i < weapons.length; i++){
            weaponList += weapons[i] + " ";
        }
        return weaponList;
    }
    public String getType(){
        return type;
    }
    public void setPower(int p){
        power = p;
    }
}
