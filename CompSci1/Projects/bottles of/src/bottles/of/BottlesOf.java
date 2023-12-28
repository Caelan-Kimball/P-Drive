/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottles.of;
import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author 020022
 */
public class BottlesOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bottles;
        
        Scanner input = new Scanner(in);
        out.print("Enter the number of bottles you have on the wall: ");
        bottles = input.nextInt();
        out.print('\n');
        for(int x = bottles; x > 0;)
        {
            if(x == 1)
            {
                out.println(x + " bottle of Coke on the wall.");
                out.println(x + " bottle of Coke");
                out.println("Take one down pass it around.");
                x--;
                out.println(x + " bottles of Coke on the wall.\n");
                break;
            }
            out.println(x + " bottles of Coke on the wall.");
            out.println(x + " bottles of Coke");
            out.println("Take one down pass it around.");
            x--;
            out.println(x + " bottles of Coke on the wall. \n");
            
             if(x == 2)
            {
                out.println(x + " bottles of Coke on the wall.");
                out.println(x + " bottles of Coke");
                out.println("Take one down pass it around.");
                x--;
                out.println(x + " bottle of Coke on the wall.\n");
            }
            
        }
        
        }
    }
    
