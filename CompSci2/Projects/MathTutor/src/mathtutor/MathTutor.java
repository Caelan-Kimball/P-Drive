package mathtutor;
import static java.lang.System.*;
import java.util.*;

/**
 *
 * @author Caelan Kimball
 * September 24, 2018
 * Math tutor program
 */
public class MathTutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables and scanner
        Scanner input = new Scanner(in);
        int num1 = numberGenerator();
        int num2 = numberGenerator();
        int num3 = (int) (Math.random() * ((5 - 1) + 1)) + 1;
        //displays problem
        out.println("Here is your problem");
        displayProblem(num1, num2);
        out.println();
//        switch(num3){
//            case 1:
//               out.print("A)" + answerProblem1(num1, num2));
//                answerProblem2(num1, num2);
//        }
        //waits for user input
        out.print("Hit enter to reveal the answer...");
        input.nextLine();
        //displays problem and answear
        out.println('\n');
        displayProblem(num1, num2);
        answerProblem1(num1, num2);
        
        
    }
    //Methods for the program
    public static int numberGenerator(){
        int num1 = (int) (Math.random() * ((1000 - 1) + 1)) + 1;
        return num1;
    }
    public static void displayProblem(int num1, int num2)
    {
        out.println("    " + num1);
        out.println("+   " + num2);
        out.println("-------");
        
    }
    public static void answerProblem1(int num1, int num2){
        out.println("   " + (num1+num2));
    }
//        public static int answerProblem2(int num1, int num2){
//        out.println("   " + (num1+num2));
//    }
//            public static int answerProblem3(int num1, int num2){
//        out.println("   " + (num1+num2));
//    }
//                public static int answerProblem4(int num1, int num2){
//        out.println("   " + (num1+num2));
//    }
}
