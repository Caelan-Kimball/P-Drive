package triangletester;

import static java.lang.System.*;
import java.util.*;

/**
 *
 * Name: Caelan Kimball Date: January 10, 2019 Description: Triangle Tester
 * project
 */
public class TriangleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create variables and Scanner for user input
        Scanner input = new Scanner(in);
        double base, height;
        //Get User base and height for triangle
        out.print("Please enter the base of your triangle: ");
        base = input.nextDouble();
        out.print("Please enter the height of your triangle: ");
        height = input.nextDouble();
        //create new triangle object using user input
        Triangle righty = new Triangle();
        righty.setBase(base);
        righty.setHeight(height);
        //outputs for the program
        out.println("The base of your triangle is " + righty.getBase() + " Units");
        out.println("The height of your triangle is " + righty.getHeight() + " Units");
        out.println("The area of your triangle is " + righty.area() + " Units squared");
        out.println("The hypotenuse of your triangle is " + righty.hypot() + " Units");

    }

}
//creation of the triangle class

class Triangle {

    //class variables
    private double base, height;

    //constructor for triangle
    public Triangle() {

    }

    public void setBase(double aBase) {
        base = aBase;
    }
    
    public double getBase(){
        return base;
    }
    
        public void setHeight(double aHeight) {
        height = aHeight;
    }
    
    public double getHeight(){
        return height;
    }

    double hypot() {
        double hypotenuse;
        hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return hypotenuse;
    }

    double area() {
        double area = 0;
        area = base * height / 2;
        return area;
    }
}
