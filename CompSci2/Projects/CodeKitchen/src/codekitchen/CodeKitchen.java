package codekitchen;

import javax.sound.midi.*;

/**
 *
 * @author Caelan Kimball November 30, 2018
 */
public class CodeKitchen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CodeKitchen mini = new CodeKitchen();
        mini.play();
    }

    public void play() {
        Sequencer player = null;
        try {
            player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
            if (player.isRunning()) {
               // player.wait(1000,100);
                // player.stop();
                

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            System.out.println(player);
            //player.close();
        }
        System.out.println("codekitchen.CodeKitchen.play()");
    }//end of play
}//close class
