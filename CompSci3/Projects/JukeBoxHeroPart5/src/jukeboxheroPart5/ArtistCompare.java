package jukeboxheroPart5;

import java.util.*;

/**
 *
 * @author Caelan Kimball
 */
public class ArtistCompare implements Comparator<Song>{

    @Override
    public int compare(Song one, Song two) {
        return one.getArtist().compareTo(two.getArtist());
    }
    
}