/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcomeback;
import java.util.*;
import static java.lang.System.*;



/**
 *
 * @author Caelan Kimball
 */
public class WelcomeBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(in);
        String name;
        String phrase = "Welcome Back ";
        int x = 0;
        
        out.print("Enter your name: ");
        name = input.nextLine();
        x = phrase.length() + name.length();
        for(int y = 1; y <= x; y++){
        out.println(y +". "+ phrase + name);
    }
    }
    
}
