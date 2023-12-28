package basicallyspeaking;

/**
 *
 * @author Caelan Kimball
 */
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class BasicallySpeaking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int number;
        Scanner bobby = new Scanner(in);
        //out.print("Enter a number: ");
        //number = bobby.nextInt();
        out.println("Decimal\t\tBinary\t\tOctal\t    Hex\t\tCharacter");
        for (int j = 65; j <= 9000; j--) {
            out.print(j + "\t\t" + Integer.toBinaryString(j)
                    + "\t\t" + Integer.toOctalString(j)
                    + "\t    "
                    + Integer.toHexString(j) + "\t\t"
                    + (char) j + "\n");
        }
    }

}
