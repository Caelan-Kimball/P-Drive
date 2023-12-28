/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squares;
import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author 020022
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number;
        // TODO code application logic here
        Scanner input = new Scanner(in);
        out.println("This program will take a number from the user and square it");
        out.print("Enter a number you would like to square: ");
        number = input.nextDouble();
        do
        {
            number = Math.pow(number, 2);
            out.println(number);
            out.print("Enter another number(Enter 0 if you wish to stop): ");
            number = input.nextDouble();
        }while(number != 0);
    }
    
}
