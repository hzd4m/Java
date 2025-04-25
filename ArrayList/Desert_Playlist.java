import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Playlist {

    public static void main(String[] args) {

        String[] favoriteSongs = new String[10];

        favoriteSongs[0] = "Queen -1";
        favoriteSongs[1] = "Queen -2";
        favoriteSongs[2] = "Queen -3";
        favoriteSongs[3] = "Queen -4";
        favoriteSongs[4] = "Queen -5";
        favoriteSongs[5] = "Queen -6";
        favoriteSongs[6] = "Queen -7";
        favoriteSongs[7] = "Queen -8";
        favoriteSongs[8] = "Queen -9";
        favoriteSongs[9] = "Queen -10";

        for(int i = 0 ; i < 3 ; i++){
            System.out.println(favoriteSongs[i]);
        }

        ArrayList<String> desertsIslandPlaylist = new ArrayList<String>();
        desertsIslandPlaylist.add("MC0");
        desertsIslandPlaylist.add("MC1");
        desertsIslandPlaylist.add("MC2");
        desertsIslandPlaylist.add("MC3");
        desertsIslandPlaylist.add("MC4");

        System.out.println(desertsIslandPlaylist);

        List<String> list = Arrays.asList(favoriteSongs); 

        desertsIslandPlaylist.addAll(list);

        System.out.println(desertsIslandPlaylist.size());

    }
}
