package nextvalues;
import java.util.*;

/**
 *
 * @author Caelan Kimball
 * Date: November 13, 2017
 * Program: Nextvalues.java
 */
public class Nextvalues {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int alpha;
        double beta;
        boolean bool;
        char c;
        String theta;
        String epsilon;
        System.out.print("Enter an interger ");
        alpha = input.nextInt();
        System.out.print("Enter a decimal value ");
        beta = input.nextDouble();
        System.out.print("Enter a boolean value (True or False) ");
        bool = input.nextBoolean();
        System.out.print("Enter a Word ");
        theta = input.next();
        input.nextLine();
        System.out.print("Enter a Sentence ");
        epsilon = input.nextLine();
        System.out.print("Enter a char ");
        c = input.nextLine().charAt(0);
        System.out.printf("Your numbers were %d %.4f %b\n", alpha, beta, bool);
        System.out.printf("%s %s %s %c\n",theta , epsilon, theta , c);
        
    }
    
}
