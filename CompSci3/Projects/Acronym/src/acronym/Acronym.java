package acronym;

import static java.lang.System.*;
import java.io.*;
import java.util.*;

/**
 * @Date November 1, 2019
 * @author Caelan Kimball
 */
public class Acronym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner input = new Scanner(new File("data.in"));
            ArrayList<String> phrases = new ArrayList<>();
            while (input.hasNextLine()) {
                String line = input.nextLine();
                phrases.add(line);
            }//end of file reading with add
            int counter = 0;
            for (String s : phrases) {

                s = s.toUpperCase();
                
                String acronyms = acranMe(s);

                out.print(acronyms);
                out.println();
                //out.println(s);
            }
        } catch (FileNotFoundException ex) {
            out.println("Uh Oh file not found home boi." + ex);
        }
    }

    public static String acranMe(String s) {
        String words[] = s.split(" ");
        String acronyms = "";
        for (String se : words) {
            if (se.equals("THE") || se.equals("FOR") || se.equals("OF") || se.equals("AND")) {

            } else {
                acronyms += "" + se.charAt(0);

            }
        }
        return acronyms;
    }

}
