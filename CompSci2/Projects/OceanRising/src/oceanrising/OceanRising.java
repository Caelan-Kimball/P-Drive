/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oceanrising;
import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author 020022
 */
public class OceanRising {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int years;
        double millimeters = 1.5;
        // TODO code application logic here
        out.println("The ocean level will be " + oceanCalc.oceanMan(millimeters , 5) + " millimeters higher in 5 years.");
        out.println("The ocean level will be " + oceanCalc.oceanMan(millimeters , 7) + " millimeters higher in 7 years.");
        out.println("The ocean level will be " + oceanCalc.oceanMan(millimeters , 10) + " millimeters higher in 10 years.");
        out.println("The ocean level will be " + oceanCalc.oceanMan(millimeters , 15) + " millimeters higher in 15 years.");
        
    }
    
}//class holding method
class oceanCalc{
//Method for sea level calculation
    public static double oceanMan(double seaLevel, int years){
        double seaRise = seaLevel * years;
        return seaRise;
    }
}