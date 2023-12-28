
package evenorodd;
import java.util.*;
/**
 *
 * @author Caelan Kimball
 * Date: January 24, 2018
 * Program Even or odd
 */
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        
        while (bool)
        {
        System.out.print("Enter an integer(-9999 to stop): ");
        int number = input.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("The integer " + number + " is even" );
        }//end of if
        else
        {
            System.out.println("The integer " + number + " is odd");
        }//end of else
        if (number == -9999)
            bool = false;
        }//end of while
        
    }
    
}
