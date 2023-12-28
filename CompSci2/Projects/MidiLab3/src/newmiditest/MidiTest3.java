package newmiditest;

/**
 *
 * @author Caelan Kimball December 4, 2018 Random midi sounds with a loop
 */
import static java.lang.System.*;
import java.util.*;
import javax.sound.midi.*;
import java.io.*;

/**
 *
 * @author 020022
 */
public class MidiTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sequencer player = null;
        try {
            String netPath = "P:\\";
            File songfile = new File(netPath + "darude-sandstorm.mid");
            player = MidiSystem.getSequencer();
            if(player == null){
                out.println("Error time");
            }
            else{
                player.open();
            }
            Scanner reader = new Scanner(songfile);
            out.println(Arrays.toString(MidiSystem.getMidiDeviceInfo()));
            out.println("starting here");
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence seq = MidiSystem.getSequence(songfile);
            
            player.setSequence(seq);
            player.setTempoInBPM(180);
            player.start();
            //Track track = seq.createTrack();
            
            int j = 1;
            int k = 1;
            int h = 1;

           // for (int h = 80; h > 1; h -= 2) {
                while (reader.hasNextInt()) {
                    j = reader.nextInt();
                    k = reader.nextInt();
                
                    //out.println(j);
                    //track.add(makeEvent(144, 1, j, 100, h));
                    //track.add(makeEvent(128, 1, j, 100, h+=k));
                }

       //     }
            sequencer.setSequence(seq);
//            sequencer.setTempoInBPM(110);
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

               out.print(".\b");
            }
            Thread.sleep(200);
            sequencer.close();

        }//end of try
        catch (Exception ex) {
            out.println("Uh oh!!");
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }//end of main

    /**
     *
     * @param comd
     * @param chan
     * @param one
     * @param two
     * @param tick
     * @return
     */
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
