package uilcompscitester;
import static java.lang.System.*;
import java.io.*;
import java.util.*;


/**
 *
 * @author XxCa3lan__Kimball3r69xX
 */
public class UILCompSciTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fileTime = new File("\\\\lvshares\\Document Sharing\\DataFiles\\numbers.txt");
        try {
            Scanner scannydo = new Scanner(fileTime);
            while(scannydo.hasNextLine()){
                int x  = scannydo.nextInt();
                out.print(x + " ");
            }
            out.println();
        } catch (IOException ex) {
            out.println("Uh Oh! We've encountered a problem.");
        }
    }
    
}
