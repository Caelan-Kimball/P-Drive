package countthechange;
import java.util.*;

/**
 *
 * @author: Caelan Kimball
 * Date: November 15, 2017
 * Project: Count the Change
 */
public class CountTheChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare variable and scanner
        Scanner input = new Scanner(System.in);
        double quarter = 0.25;
        double dime = 0.10;
        double nickle = 0.05;
        double penny = 0.01;
        int numOfQuarters;
        int numOfDimes;
        int numOfNickles;
        int numOfPennies;
        double totalindollars;
        //Get number of each
        System.out.print("Enter the number of quarters you have: ");
        numOfQuarters = input.nextInt();
        System.out.print("Enter the number of dimes you have: ");
        numOfDimes = input.nextInt();
        System.out.print("Enter the number of niclkes you have: ");
        numOfNickles = input.nextInt();
        System.out.print("Enter the number of pennies you have: ");
        numOfPennies = input.nextInt();
        //Begin calculation of total into dollars
        totalindollars = (numOfDimes * dime) + (numOfNickles * nickle) + (numOfPennies * penny) + (numOfQuarters * quarter);
        System.out.println("You have " + totalindollars + " in change");
        
        
    }
    
}
