package brian;
import java.io.*;
import static java.lang.System.out;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Caelan Kimball
 */
public class Brian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            File fileTime = new File("brian.dat");
            Scanner fileRead = new Scanner(fileTime);
            int numberofFiles = fileRead.nextInt();
            int javaVers = 0;
            int year;
            for(int x = 0; x < numberofFiles;x++){
                year = fileRead.nextInt();
                javaVers = (year - 1995)/2;
                out.println("In the year "+year + ", Brian will be coding in Java " + javaVers+ "!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Brian.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
    
}
