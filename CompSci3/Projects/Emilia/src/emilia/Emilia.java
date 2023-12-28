package emilia;
import java.io.*;
import java.util.*;
import static java.lang.System.*;
/**
 *
 * @author Caelan Kimball
 */
public class Emilia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            File fileTime = new File("emilia.dat");
            Scanner scannyDo = new Scanner(fileTime);
            int dataCount = scannyDo.nextInt();
            
        } catch (FileNotFoundException ex) {
            out.println("No file found you monkey");
        }
    }
    
}
