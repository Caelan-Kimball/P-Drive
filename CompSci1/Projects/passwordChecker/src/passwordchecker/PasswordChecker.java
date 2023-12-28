/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordchecker;

import java.util.*;

/**
 *
 * @author 020022
 */
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String password = "XRay";
        String attempt;

        while (true) 
        {
            System.out.print("Enter a password: ");
            attempt = input.nextLine();
            if (attempt.equals(password)) 
            {
                System.out.println("The password is correct. logging in");
                break;
            }//end of if
            else 
            {
                System.out.println("Incorrect password");
            }//end of else
        }//end of while
    }

}
