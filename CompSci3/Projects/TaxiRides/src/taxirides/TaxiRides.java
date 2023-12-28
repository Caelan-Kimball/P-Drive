package taxirides;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author Caelan Kimball
 * Date: September 4, 2019
 * Project: Taxi Ride
 */
public class TaxiRides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double startingCost = 2.00;
        double extra5th = 0.78;
        double waitCost = .50;
        
        try {
            File data = new File("data.in");
            Scanner boi = new Scanner(data);
            boi.useDelimiter("\\s\\D+");
            while (boi.hasNext()) {
                double miles1 = boi.nextDouble();
                //String Garbage = boi.next();
                int waitTime = boi.nextInt();
                //Garbage = boi.nextLine();
                
                out.println("Cost of Trip: $" + costCalculator(miles1, waitTime));
//        out.println(waitTime);
            }
        } catch (Exception ex) {
            out.println("Uh Oh");
        }
    }

    static double costCalculator(double miles, int wait) {
        double totalCost = 00;
        //double milesInFiths = miles / .2;
        double extraCost;
        int waitTime = wait;
        int waitTimeInSeconds = wait * 60;
        totalCost += 2.00;

        extraCost = Math.ceil((miles - .2) / .2) * .78;
        totalCost += extraCost;
        if (waitTime > 0) {
            totalCost += (waitTimeInSeconds / 60) * .5;

        }
        return totalCost;
    }
}
