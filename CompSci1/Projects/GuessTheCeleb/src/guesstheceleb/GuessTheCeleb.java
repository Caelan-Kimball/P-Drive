package guesstheceleb;
/**
 * Date: November 9, 2017
 * Project: Guess the celebrity
 * @author Caelan kimball
 */
public class GuessTheCeleb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "Steven Hird";
        String name2 = "Ben Mckenzie";
        String name3 = "James Earl Jones";
        int x = name1.length() - 3;
        int y = name2.length() - 3;
        int z = name3.length() - 3;
        String clue = name1.substring(2 , x);
        String clue2 = name2.substring(2 , y);
        String clue3 = name3.substring(2 , z);
        System.out.println(name1 + " >>> " + clue);
        System.out.println(name2 + " >>> " + clue2);
        System.out.println(name3 + " >>> " + clue3);
    }
    
}
