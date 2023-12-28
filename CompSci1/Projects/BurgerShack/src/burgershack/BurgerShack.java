package burgershack;

import java.util.*;

/**
 *
 * @author Caelan Kimball January 31, 2018 Program: BurgerShack
 */
public class BurgerShack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        int prompto;
//        String list;
//        String strartOrder = "yes";// Control program loop
//        String addItems = "yes";// Controls Order loop
        String finalOrder = "";
        String burger = " Burger ";
        String cBurger = " Cheeseburger ";
        String gBurger = " \"Good Burger\" ";
        String fries = " Fries ";
        String nuggies = " Chicken nuggies ";
        String strips = " Chicken Strips ";
        String lBurger = " \"Lorax steak burger\" ";
        String tBurger = " Trufula Vegan Burger ";
        String speakBurger = " \"I speak for the Trees\" Chicken Burger ";
        String bigSlurp = " \"Big Slurp\" Borger ";
        String thriceDice = " Thrice Dice ";
        String luigiTaunt = " Luigi Taunt ";

        //Start menu question
        System.out.println("Hi welcome to Lorax burger. Home of the Lorax Steak Burger.");
        System.out.print("Can I Take your order? ");
        System.out.println("Menu choices: ");
        System.out.println("  1: Burger");
        System.out.println("  2: Cheeseburger");
        System.out.println("  3: \"Good Burger\"");
        System.out.println("  4: Fries");
        System.out.println("  5: Chicken nuggies");
        System.out.println("  6: Chicken Strips");
        System.out.println("  7: \"Lorax steak burger\"");
        System.out.println("  8: Trufula Vegan Burger");
        System.out.println("  9: \"I speak for the Trees\" Chicken Burger");
        System.out.println("  10: \"Big Slurp\" Borger");
        System.out.println("  11: Thrice Dice");
        System.out.println("  12: Luigi Taunt: Unexpected Zest");

        do {
            System.out.print("Enter your order(Enter 13 to end your order): ");
            prompto = order.nextInt();

            switch (prompto) {
                case 1:
                    System.out.println("Burger");
                    finalOrder = burger.concat(finalOrder);
                    break;
                case 2:
                    System.out.println("Cheeseburger");
                    finalOrder = cBurger.concat(finalOrder);
                    break;
                case 3:
                    System.out.println("\"Good Burger\"");
                    finalOrder = gBurger.concat(finalOrder);
                    break;
                case 4:
                    System.out.println("Fries");
                    finalOrder = fries.concat(finalOrder);
                    break;
                case 5:
                    System.out.println("Chicken nuggies");
                    finalOrder = nuggies.concat(finalOrder);
                    break;
                case 6:
                    System.out.println("Chicken Strips");
                    finalOrder = strips.concat(finalOrder);
                    break;
                case 7:
                    System.out.println("\"Lorax steak burger\"");
                    finalOrder = lBurger.concat(finalOrder);
                    break;
                case 8:
                    System.out.println("Trufula Vegan Burger");
                    finalOrder = tBurger.concat(finalOrder);
                    break;
                case 9:
                    System.out.println("\"I speak for the Trees\" Chicken Burger");
                    finalOrder = speakBurger.concat(finalOrder);
                    break;
                case 10:
                    System.out.println("\"Big Slurp\" Borger");
                    finalOrder = bigSlurp.concat(finalOrder);
                    break;
                case 11:
                    System.out.println("Thrice Dice");
                    finalOrder = thriceDice.concat(finalOrder);
                    break;
                case 12:
                    System.out.println("Luigi Taunt");
                    finalOrder = luigiTaunt.concat(finalOrder);
                    break;
                case 13:
                    break;
                default:
                    System.out.println("This item is not found");

            }//end of switch

        } while (prompto != 13);//end of do-while
        System.out.println(finalOrder);

        // TODO code application logic here
    }

}
