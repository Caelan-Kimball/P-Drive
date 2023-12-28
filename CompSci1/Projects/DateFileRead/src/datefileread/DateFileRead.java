package datefileread;

import java.util.*;
import java.io.*;

/**
 * Date: November 28, 2017
 * @author Caelan Kimball
 */
public class DateFileRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)//throws Exception
    {
        try{
            // TODO code application logic here
            File datafile = new File("abs.dat");
            Scanner reader = new Scanner(datafile);
            while(reader.hasNextLine())
            {
                 double val1 = reader.nextDouble();
                 double val2 = reader.nextDouble();
                 //double val3 = reader.nextDouble();
                 
                 System.out.printf("%.1f\n" ,Math.abs(val1 - val2));
            }//end of while
            
        }
         catch(IOException ioe){
             System.out.println("I/O exception");
         }
    } 
    
}
