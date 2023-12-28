package circletablelab;

import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author Caelan Kimball January 22, 2019 Circle lab
 */
public class CircleTableLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        //make scanner and var
        Scanner input = new Scanner("2 5 3 12 15");
        int circRadius = 0;
        String output = "radius:  %6d Circumference: %6.1f Area: %6.1f Surface Area: %6.1f Volume: %7.1f \n";
        out.println("---------------------------------------------------------------------------------------");
        while (input.hasNextInt()) {
            //get radius from user
            //out.print("Enter the radius of the circle: ");
            circRadius = input.nextInt();
            //make new circle with radius
            Circle fella = new Circle(circRadius);
            out.printf(output, fella.getRadi(), fella.getCirc(), fella.getArea(), fella.getSurfArea(), fella.getVolume());
        }
        out.println("---------------------------------------------------------------------------------------");
    }

}

class Circle {

    private int radius;
    private double area, circum, surfArea, volume;

    public Circle(int cRadius) {
        //intialize var
        radius = cRadius;
        //calc! 
        circum = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        surfArea = 4 * Math.PI * Math.pow(radius, 2);
        volume = 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }

    public int getRadi() {
        return radius;
    }

    public double getCirc() {
        return circum;
    }

    public double getArea() {
        return area;
    }

    public double getSurfArea() {
        return surfArea;
    }

    public double getVolume() {
        return volume;
    }

}
