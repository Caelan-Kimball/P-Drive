package jukeboxheroPart3;

import java.util.*;
import java.io.*;
import static java.lang.System.*;
/**
 *
 * @author Caelan Kimball
 */
public class JukeBoxHeroPart3 {
    
    ArrayList<Song> songlist = new ArrayList<Song>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JukeBoxHeroPart3().go();
    }
    
    public void go(){
        getSongs();
        System.out.println(songlist);
        Collections.sort(songlist);
        System.out.println(songlist);
    }
    
    void getSongs(){
        try{
            File file = new File("\\\\lvshares\\Document Sharing\\DataFiles\\songlist2.txt");
            Scanner inFile = new Scanner(file);
            while(inFile.hasNextLine()){
                addSong(inFile.nextLine());
            }
            
        }catch(Exception ex){
            out.println();
        }
     
    }
    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songlist.add(nextSong);
    }
    
}
