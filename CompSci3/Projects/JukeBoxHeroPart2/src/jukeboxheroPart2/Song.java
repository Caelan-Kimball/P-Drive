/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukeboxheroPart2;

/**
 *
 * @author Caelan Kimball
 */
public class Song {

    String title, artist, rating, bpm;
    


    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle(){
        return title;
    }
            
    public String getArtist(){
        return artist;
    }
    
    public String getRating(){
        return rating;
    }
            
    public String getBpm(){
        return bpm;
    }
    
    @Override
    public String toString(){
        return title;
    }
}
