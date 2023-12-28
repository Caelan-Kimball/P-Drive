package charecterserialization;

import static java.lang.System.*;
import java.io.*;
import java.util.Random;

/**
 *
 * @author Caekan Kimball
 */
public class CharecterSerialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        GameCharacter characterOne = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dust"});
        GameCharacter characterTwo = new GameCharacter(200, "Troll", new String[]{"bare hands", "big ax"});
        GameCharacter characterThree = new GameCharacter(120, "Magician", new String[]{"spells", "invisibility"});
        Trap traped = new Trap();
        Random rand = new Random();
        try {
            FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            os.writeObject(characterOne);
            os.writeObject(characterTwo);
            os.writeObject(characterThree);

            os.close();
            out.println("quick save\n");

            out.println("One's starting power: " + characterOne.getPower());
            out.println("Two's starting power: " + characterTwo.getPower());
            out.println("Three's starting power: " + characterThree.getPower());
            int x = rand.nextInt(3) + 1;
            switch (x) {
                case 1:
                    out.println("Uh oh One ran into a trap");
                    characterOne.setPower(characterOne.getPower() - traped.getDamaqe());
                    out.println("One's current power: " + characterOne.getPower());
                    break;
                case 2:
                    out.println("Uh oh Two ran into a trap");
                    characterTwo.setPower(characterTwo.getPower() - traped.getDamaqe());
                    out.println("Two's current power: " + characterTwo.getPower());
                    break;
                case 3:
                    out.println("Uh oh Three ran into a trap");
                    characterThree.setPower(characterThree.getPower() - traped.getDamaqe());
                    out.println("Three's current power: " + characterThree.getPower());
                    break;
            }

        } catch (IOException ex) {
            out.println("Uh Oh! The file was not found fella.");
        }
        out.println();
        characterOne = null;
        characterTwo = null;
        characterThree = null;

        try {
            FileInputStream fileStream = new FileInputStream("MyGame.ser");
            ObjectInputStream is = new ObjectInputStream(fileStream);
            GameCharacter oneRestrore = (GameCharacter) is.readObject();
            GameCharacter twoRestrore = (GameCharacter) is.readObject();
            GameCharacter threeRestrore = (GameCharacter) is.readObject();
            out.println("Objects restored");
            out.println("One's type: " + oneRestrore.getType());
            out.println("Two's type: " + twoRestrore.getType());
            out.println("Three's type: " + threeRestrore.getType());
            out.println("One's power: " + oneRestrore.getPower());
            out.println("Two's power: " + twoRestrore.getPower());
            out.println("Three's power: " + threeRestrore.getPower());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
