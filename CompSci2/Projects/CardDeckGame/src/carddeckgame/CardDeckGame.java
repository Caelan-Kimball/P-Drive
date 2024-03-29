package carddeckgame;
import java.util.*;

/**
 *
 * @author Caelan Kimball
 */
public class CardDeckGame {
    static Scanner TextIO = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("This program lets you play the simple card game,");
        System.out.println("HighLow.  A card is dealt from a deck of cards.");
        System.out.println("You have to predict whether the next card will be");
        System.out.println("higher or lower.  Your score in the game is the");
        System.out.println("number of correct predictions you make before");
        System.out.println("you guess wrong.");
        System.out.println();

        int gamesPlayed = 0;     // Number of games user has played.
        int sumOfScores = 0;     // The sum of all the scores from 
        //      all the games played.
        double averageScore;     // Average score, computed by dividing
        //      sumOfScores by gamesPlayed.
        boolean playAgain;       // Record user's response when user is 
        //   asked whether he wants to play 
        //   another game.
        String playAnother;

        do {
            int scoreThisGame;        // Score for one game.
            scoreThisGame = play();   // Play the game and get the score.
            sumOfScores += scoreThisGame;
            gamesPlayed++;
            System.out.print("Play again(Enter Y or N)? ");
            playAnother = TextIO.nextLine();
            playAnother = playAnother.toUpperCase();
            if(playAnother.equals("Y")){
                playAgain = true;
            }
            else{
                playAgain = false;
            }
        } while (playAgain == true);

        averageScore = ((double) sumOfScores) / gamesPlayed;

        System.out.println();
        System.out.println("You played " + gamesPlayed + " games.");
        System.out.printf("Your average score was %1.3f.\n", averageScore);
    }
    private static int play() {
        Deck deck = new Deck();  // Get a new deck of cards, and 
        //   store a reference to it in 
        //   the variable, deck.

        Card currentCard;  // The current card, which the user sees.

        Card nextCard;   // The next card in the deck.  The user tries
        //    to predict whether this is higher or lower
        //    than the current card.

        int correctGuesses;  // The number of correct predictions the
        //   user has made.  At the end of the game,
        //   this will be the user's score.

        String guess;   // The user's guess.  'H' if the user predicts that
        //   the next card will be higher, 'L' if the user
        //   predicts that it will be lower.

        deck.shuffle();  // Shuffle the deck into a random order before
        //    starting the game.

        correctGuesses = 0;
        currentCard = deck.dealCard();
        System.out.println("The first card is the " + currentCard);

        while (true) {  // Loop ends when user's prediction is wrong.

            /* Get the user's prediction, 'H' or 'L' (or 'h' or 'l'). */
            System.out.print("Will the next card be higher (H) or lower (L)?  ");
            do {
                guess = TextIO.nextLine();
                guess = guess.toUpperCase();
                if (!"H".equals(guess) && !"L".equals(guess)) {
                    System.out.print("Please respond with H or L:  ");
                }
            } while (!"H".equals(guess) && !"L".equals(guess));

            /* Get the next card and show it to the user. */
            nextCard = deck.dealCard();
            System.out.println("The next card is " + nextCard);

            /* Check the user's prediction. */
            if (nextCard.getValue() == currentCard.getValue()) {
                System.out.println("The value is the same as the previous card.");
                System.out.println("You lose on ties.  Sorry!");
                break;  // End the game.
            } else if (nextCard.getValue() > currentCard.getValue()) {
                if (guess.equals("H")) {
                    System.out.println("Your prediction was correct.");
                    correctGuesses++;
                } else {
                    System.out.println("Your prediction was incorrect.");
                    break;  // End the game.
                }
            } else {  // nextCard is lower
                if (guess.equals("L")) {
                    System.out.println("Your prediction was correct.");
                    correctGuesses++;
                } else {
                    System.out.println("Your prediction was incorrect.");
                    break;  // End the game.
                }
            }

            /* To set up for the next iteration of the loop, the nextCard
            becomes the currentCard, since the currentCard has to be
            the card that the user sees, and the nextCard will be
            set to the next card in the deck after the user makes
            his prediction.  */
            currentCard = nextCard;
            System.out.println();
            System.out.println("The card is " + currentCard);

        } // end of while loop

        System.out.println();
        System.out.println("The game is over.");
        System.out.println("You made " + correctGuesses
                + " correct predictions.");
        System.out.println();

        return correctGuesses;
    }  // end play()
}

class Deck {

    /**
     * An array of 52 or 54 cards. A 54-card deck contains two Jokers, in
     * addition to the 52 cards of a regular poker deck.
     */
    private Card[] deck;

    /**
     * Keeps track of the number of cards that have been dealt from the deck so
     * far.
     */
    private int cardsUsed;

    /**
     * Constructs a regular 52-card poker deck. Initially, the cards are in a
     * sorted order. The shuffle() method can be called to randomize the order.
     * (Note that "new Deck()" is equivalent to "new Deck(false)".)
     */
    public Deck() {
        this(false);  // Just call the other constructor in this class.
    }

    /**
     * Constructs a poker deck of playing cards, The deck contains the usual 52
     * cards and can optionally contain two Jokers in addition, for a total of
     * 54 cards. Initially the cards are in a sorted order. The shuffle() method
     * can be called to randomize the order.
     *
     * @param includeJokers if true, two Jokers are included in the deck; if
     * false, there are no Jokers in the deck.
     */
    public Deck(boolean includeJokers) {
        if (includeJokers) {
            deck = new Card[54];
        } else {
            deck = new Card[52];
        }
        int cardCt = 0; // How many cards have been created so far.
        for (int suit = 0; suit <= 3; suit++) {
            for (int value = 1; value <= 13; value++) {
                deck[cardCt] = new Card(value, suit);
                cardCt++;
            }
        }
        if (includeJokers) {
            deck[52] = new Card(1, Card.JOKER);
            deck[53] = new Card(2, Card.JOKER);
        }
        cardsUsed = 0;
    }

    /**
     * Put all the used cards back into the deck (if any), and shuffle the deck
     * into a random order.
     */
    public void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            int rand = (int) (Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }

    /**
     * As cards are dealt from the deck, the number of cards left decreases.
     * This function returns the number of cards that are still left in the
     * deck. The return value would be 52 or 54 (depending on whether the deck
     * includes Jokers) when the deck is first created or after the deck has
     * been shuffled. It decreases by 1 each time the dealCard() method is
     * called.
     */
    public int cardsLeft() {
        return deck.length - cardsUsed;
    }

    /**
     * Removes the next card from the deck and return it. It is illegal to call
     * this method if there are no more cards in the deck. You can check the
     * number of cards remaining by calling the cardsLeft() function.
     *
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card dealCard() {
        if (cardsUsed == deck.length) {
            throw new IllegalStateException("No cards are left in the deck.");
        }
        cardsUsed++;
        return deck[cardsUsed - 1];
        // Programming note:  Cards are not literally removed from the array
        // that represents the deck.  We just keep track of how many cards
        // have been used.
    }

    /**
     * Test whether the deck contains Jokers.
     *
     * @return true, if this is a 54-card deck containing two jokers, or false
     * if this is a 52 card deck that contains no jokers.
     */
    public boolean hasJokers() {
        return (deck.length == 54);
    }

} // end class Deck

class Card {

    public final static int SPADES = 0;   // Codes for the 4 suits, plus Joker.
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;
    public final static int JOKER = 4;

    public final static int ACE = 1;      // Codes for the non-numeric cards.
    public final static int JACK = 11;    //   Cards 2 through 10 have their 
    public final static int QUEEN = 12;   //   numerical values for their codes.
    public final static int KING = 13;

    /**
     * This card's suit, one of the constants SPADES, HEARTS, DIAMONDS, CLUBS,
     * or JOKER. The suit cannot be changed after the card is constructed.
     */
    private final int suit;

    /**
     * The card's value. For a normal card, this is one of the values 1 through
     * 13, with 1 representing ACE. For a JOKER, the value can be anything. The
     * value cannot be changed after the card is constructed.
     */
    private final int value;

    /**
     * Creates a Joker, with 1 as the associated value. (Note that "new Card()"
     * is equivalent to "new Card(1,Card.JOKER)".)
     */
    public Card() {
        suit = JOKER;
        value = 1;
    }

    /**
     * Creates a card with a specified suit and value.
     *
     * @param theValue the value of the new card. For a regular card
     * (non-joker), the value must be in the range 1 through 13, with 1
     * representing an Ace. You can use the constants Card.ACE, Card.JACK,
     * Card.QUEEN, and Card.KING. For a Joker, the value can be anything.
     * @param theSuit the suit of the new card. This must be one of the values
     * Card.SPADES, Card.HEARTS, Card.DIAMONDS, Card.CLUBS, or Card.JOKER.
     * @throws IllegalArgumentException if the parameter values are not in the
     * permissible ranges
     */
    public Card(int theValue, int theSuit) {
        if (theSuit != SPADES && theSuit != HEARTS && theSuit != DIAMONDS
                && theSuit != CLUBS && theSuit != JOKER) {
            throw new IllegalArgumentException("Illegal playing card suit");
        }
        if (theSuit != JOKER && (theValue < 1 || theValue > 13)) {
            throw new IllegalArgumentException("Illegal playing card value");
        }
        value = theValue;
        suit = theSuit;
    }

    /**
     * Returns the suit of this card.
     *
     * @returns the suit, which is one of the constants Card.SPADES,
     * Card.HEARTS, Card.DIAMONDS, Card.CLUBS, or Card.JOKER
     */
    public int getSuit() {
        return suit;
    }

    /**
     * Returns the value of this card.
     *
     * @return the value, which is one of the numbers 1 through 13, inclusive
     * for a regular card, and which can be any value for a Joker.
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a String representation of the card's suit.
     *
     * @return one of the strings "Spades", "Hearts", "Diamonds", "Clubs" or
     * "Joker".
     */
    public String getSuitAsString() {
        switch (suit) {
            case SPADES:
                return "Spades";
            case HEARTS:
                return "Hearts";
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            default:
                return "Joker";
        }
    }

    /**
     * Returns a String representation of the card's value.
     *
     * @return for a regular card, one of the strings "Ace", "2", "3", ...,
     * "10", "Jack", "Queen", or "King". For a Joker, the string is always
     * numerical.
     */
    public String getValueAsString() {
        if (suit == JOKER) {
            return "" + value;
        } else {
            switch (value) {
                case 1:
                    return "Ace";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                case 10:
                    return "10";
                case 11:
                    return "Jack";
                case 12:
                    return "Queen";
                default:
                    return "King";
            }
        }
    }

    /**
     * Returns a string representation of this card, including both its suit and
     * its value (except that for a Joker with value 1, the return value is just
     * "Joker"). Sample return values are: "Queen of Hearts", "10 of Diamonds",
     * "Ace of Spades", "Joker", "Joker #2"
     */
    public String toString() {
        if (suit == JOKER) {
            if (value == 1) {
                return "Joker";
            } else {
                return "Joker #" + value;
            }
        } else {
            return getValueAsString() + " of " + getSuitAsString();
        }
    }

} // end class Card
