/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weighton.differentplanets;
import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author 020022
 */
public class WeightOnDifferentPlanets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(in);
        int selection;
        double weight;
        out.print("What is your weight in pounds on earth? ");
        weight = input.nextDouble();
        input.nextLine();
        out.println("What planet would you like to find your weight on(please enter in numbers)");
        out.println("\n1.Voltar \n2.Krypton \n3.Fertos \n4.Servontos \n");
        out.print("Selection: ");
        selection = input.nextInt();
        input.nextLine();
        switch(selection)
        {
            case 1:
                out.println("your weight on the planet Voltar is " + (weight * 0.091) + " lbs");
                break;
            case 2:
                out.println("Your weight on the planet Krypton is " + (weight * 0.720) + " lbs");
                break;
            case 3:
                out.println("Your weight on the planet Fertos is " + (weight * 0.865) + " lbs");
                break;
            case 4:
                out.println("Your weight on the planet Servontos is " + (weight * 4.612) + " lbs");
                break;
            default:
                out.println("That planet was not listed.");
                break;
            
        }
        
        
    }
    
}
