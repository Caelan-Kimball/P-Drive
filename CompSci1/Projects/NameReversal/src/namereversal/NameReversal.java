/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namereversal;
import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author 020022
 */
public class NameReversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, reversed = "";
        // TODO code application logic here
        Scanner input = new Scanner(in);
        out.print("Please input your name: ");
        name = input.nextLine();
        for(int x = name.length() - 1 ;x >= 0 ; x-- )
        {
            reversed += name.substring(x, x + 1);
            
        }
        out.println(name);
        out.println(reversed.toLowerCase());
    }
    
}
