package newmiditest;

/**
 *
 * @author Caelan Kimball
 * December 4, 2018 
 * Random midi sounds with a loop
 */
import static java.lang.System.*;
import java.util.*;
import javax.sound.midi.*;

public class NewMidiTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            out.println(Arrays.toString(MidiSystem.getMidiDeviceInfo()));

            out.println("starting here");
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int j = 1;
            int k = 1;

            for (int h = 80; h > 1; h -= 2) {

                j = (int) (Math.random() * h);
                k = (int) (Math.random() * 12);

                track.add(makeEvent(144, k, j, 100, h));
                track.add(makeEvent(128, k, j, 100, h + 4));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(120);
            sequencer.start();
            out.println("started...");

            while (true) {
                if (!sequencer.isRunning()) {
                    sequencer.stop();
                    out.println("stopped");
                    break;
                }
                /* for some reason the program
            won't end without this print statement or one like it */

                out.println(".\b");
            }
            Thread.sleep(20000);
            sequencer.close();

        }//end of try
        catch (Exception ex) {
            out.println("Uh oh!!");
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }//end of main

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            out.println("Error making MidiEvent\n");
        }
        return event;
    }

}
