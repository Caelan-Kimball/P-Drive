package maskingtelemetrydata;

/**
 *
 * @author Caelan Kimball
 * @date September 16, 2019
 */
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class MaskingTelemetryData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //File creation
        File switches = new File("Switches.in");
        //Variable creation
        int dataIn;
        int mask;
        int swName = 56;
//Try catch for file reading
        try {
            Scanner fileRead = new Scanner(switches);
            double d = 117.8;
            double f = adjust(d);
            out.println(adjust(d));
            
            while (fileRead.hasNextDouble()) {
                dataIn = fileRead.nextInt();
                out.println("Switch status for data value " + dataIn + ":");
                for (int x = 0; x < 8; x++) {
                    mask = (int) Math.pow(2, x);
                    int subvalue = dataIn & mask;
                    //out.println(dataIn & mask);

                    if (subvalue > 0) {
                        out.println("Switch sw" + swName + " is \"on\"");
                    }//end of if
                    else {
                        out.println("Switch sw" + swName + " is \"off\"");
                    }//end of else
                    swName++;

                }//end of for loop
                swName = 56;//resets switch number
                out.println();//makes space between output
            }//end of while loop
        } catch (Exception ex) {
            out.println("Uh Oh!!!");
            ex.printStackTrace();
        }//end of catch

    }

    private static double adjust(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

