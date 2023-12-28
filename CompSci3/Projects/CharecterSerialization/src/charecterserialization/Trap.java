package charecterserialization;
import java.util.*;

/**
 *
 * @author Caelan Kimball
 */
public class Trap {

    private int damage;
    Random rand = new Random();

    public Trap() {
        damage = rand.nextInt(69) + 1;
    }

    public int getDamaqe() {
        return damage;
    }
}
