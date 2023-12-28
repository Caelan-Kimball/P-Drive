package lab06_rollingdice;

/**
 *
 * @author 020022
 */
public class Lab06_RollingDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dice1;
        int dice2;
        int dice3;
        double dots = Math.random();
        dice1 = (int)(dots * 6) + 1; //Changes the number to int 
        dice2 = (int)(Math.random() * 6) + 1;
        dice3 = (int)Math.floor(Math.random() * 6 + 1);
        //dice3 = (int) (Math.ceil(Math.random() * 6 + 1)
        System.out.println("Dice 1 reads "  + dice1);
        System.out.println("Dice 2 reades " + dice2);
        System.out.println("Dice 3 reades " + dice3);
        System.out.println("The total of your dice is, " + (dice1 + dice2 + dice3) + ".");
        System.out.println(dice1 + dice2 + dice3 + ", Is the total of your dice.");
        
        
    }
    
}
