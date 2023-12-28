package seperatewords;
import java.util.*;
import static java.lang.System.*;


/**
 *
 * @author Caelan Kimball
 */
public class SeperateWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(in);
        String sentence;
        out.println("Type a sentence below");
        sentence = input.nextLine();
        String words[] = sentence.split(" ");
        for(String word : words)
        {
            if(word.charAt(word.length() -1 ) == '.')
            {
                word = word.substring(0, word.length() - 1);
            }
        
            out.println(word);
        }
        out.println(sentence);
    }
    
}
