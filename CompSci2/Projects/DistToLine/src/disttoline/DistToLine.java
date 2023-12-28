/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disttoline;

/**
 * September 12, 2018 Distance To Line lesson 20
 *
 * @author Caelan Kimball
 */
import java.util.*;
import static java.lang.System.*;

public class DistToLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(in);

        out.print("Enter the A value for the line: ");
        getDist.A = input.nextDouble();

        out.print("Enter the B value for the line: ");
        getDist.B = input.nextDouble();

        out.print("Enter the C value for the line: ");
        getDist.C = input.nextDouble();

        out.print("Enter the x coordinate for the point: ");
        double x = input.nextDouble();

        out.print("Enter the y coordinate of the point: ");
        double y = input.nextDouble();

        double j = getDist.getDist(x, y);

        out.println("The Distance to the line is " + j);

    }

}

class getDist {

    public static double A, B, C;

    public static double getDist(double a, double b) {
        double getDist = Math.abs(A * a + B * b + C) / Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        return getDist;
    }
}
