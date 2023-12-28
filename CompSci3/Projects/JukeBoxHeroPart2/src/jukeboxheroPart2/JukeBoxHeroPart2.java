package jukeboxheroPart2;

import java.util.*;
import java.io.*;
import static java.lang.System.*;
/**
 *
 * @author Caelan Kimball
 */
public class JukeBoxHeroPart2 {
    
    ArrayList<String> songlist = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JukeBoxHeroPart2().go();
    }
    
    public void go(){
        getSongs();
        System.out.println(songlist);
        Collections.sort(songlist);
        System.out.println(songlist);
    }
    
    void getSongs(){
        try{
            File file = new File("\\\\lvshares\\Document Sharing\\DataFiles\\songlist.txt");
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
        songlist.add(tokens[0]);
    }
    
}
