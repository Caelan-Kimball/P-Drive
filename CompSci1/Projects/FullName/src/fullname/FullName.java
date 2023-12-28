
package fullname;
import java.util.*;


/**
 * October 25, 2017
 * @author Caelan Kimball
 */
public class FullName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.print("What is your first name? ");
        firstName = input.nextLine();
        System.out.print("What is your last name? ");
        lastName = input.nextLine();
        System.out.print("Your full name is " + firstName + " " + lastName + ".\n");
        System.out.println("Last name first it is " + lastName +", " + firstName);
    }
    
}
