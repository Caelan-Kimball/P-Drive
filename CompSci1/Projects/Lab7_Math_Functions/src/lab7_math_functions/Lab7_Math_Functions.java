package lab7_math_functions;
import java.util.*;

/**
 *
 * @author Caelan Kimball
 * Date: November 1, 2017
 * Project: Math Functions
 */
public class Lab7_Math_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Declare two variables
        double x;
        double y;
        System.out.print("Enter variable x ");
        x = input.nextDouble();
        System.out.print("Enter variable y ");
        y = input.nextDouble();
        System.out.println("When x is " + x + " and y is " + y);
        System.out.println("1) The square root of (x+y) is " + Math.sqrt(x+y));
        System.out.println("2) The absolute value of (y-x) is " + Math.abs(y - x));
        System.out.println("3) x to the power of y is " + Math.pow(x, y));
        System.out.println("4) y to the power of x is " + Math.pow(y, x));
        System.out.println("5) The larger of x and y is " + Math.max(x, y));
        System.out.println("6) The smaller of x and y is " + Math.min(x, y));
        System.out.println("7) x rounded up is " + Math.ceil(x));
        System.out.println("8) y rounded up is " + Math.floor(y));
        System.out.println("9) (x * y) rounded to the nearest integer is " + Math.round(x*y));
        
        
        
    }
    
}
