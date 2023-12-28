package race;

import java.io.*;
import java.util.*;
import static java.lang.System.*;
import java.util.logging.Level;

/**
 *
 * @author Caelan Kimball
 */
public class Race {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dataSet;
        String[] dataSet1 = new String[6];
        String[] dataSet2 = new String[6];
        dataSet = getData();
        System.arraycopy(dataSet, 0, dataSet1, 0, 6);
        System.arraycopy(dataSet, 6, dataSet2, 0, 6);
//        for (int x = 0; x < 12; x++) {
//            out.println(dataSet[x]);
//
//        }

//        out.println();
//        for (int x = 0; x < 6; x++) {
//            out.println(dataSet2[x]);
//        }
        Arrays.sort(dataSet1);
        out.println("For data set 1 the three fastest times are");
        for (int x = 0; x < 3; x++) {
            out.println(dataSet1[x]);
        }
        Arrays.sort(dataSet2);
        out.println("\nFor data set 2 the three fastest times are");
        for (int x = 0; x < 3; x++) {
            out.println(dataSet2[x]);
        }

    }

    public static String[] getData() {
        String[] time = new String[12];
        String timeGetter;
        try {

            File inStream = new File("raceTimes.in");
            Scanner scanTime = new Scanner(inStream);
            for (int x = 0; x < 12; x++) {
                timeGetter = scanTime.nextLine() + ":" + scanTime.nextLine();
                time[x] = timeGetter;
//                timeGetter = scanTime.nextLine() + ":" + scanTime.nextLine();
//                time[x] = timeGetter;
            }

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Race.class.getName()).log(Level.SEVERE, null, ex);
        }
        return time;
    }

}
