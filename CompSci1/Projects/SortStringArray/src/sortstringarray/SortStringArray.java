package sortstringarray;

import java.util.Arrays;
import static java.lang.System.*;

/**
 *
 * @author Caelan Kimball
 * Date: April 4, 2018
 */
public class SortStringArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y  = 0;
        
        String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        String ss2[] = Arrays.copyOf(ss, 10);
        Arrays.sort(ss);
        Arrays.sort(ss2);
        for(int x = ss.length - 1; x >= 0; x--)
        {
            ss2[y] = ss[x];
            y++;
        }
        out.println("Ascend \t Descend\n");
        for(int x = 0; x < ss.length; x ++)
        {
           out.println(ss[x] + "\t "  + ss2[x]);
           
        }
        
    }
    
}
