package day12.task3;
/*Create a MusicBand class with name and year fields. Create 10 or more instances of the MusicBand class, add them to
the list (choose such musical bands that were created both before 2000 and after, the genre is not important).
Shuffle the list.

Create static method in Task3 class. This method takes a list of groups as an argument and returns a new list consisting
of groups founded after 2000. Output both lists to the console (original and with groups founded after 2000)*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("AAA",1970);
        MusicBand mb2 = new MusicBand("BBB",1975);
        MusicBand mb3 = new MusicBand("CCC",1990);
        MusicBand mb4 = new MusicBand("DDD",1997);
        MusicBand mb5 = new MusicBand("EEE",2000);
        MusicBand mb6 = new MusicBand("GGG",2001);
        MusicBand mb7 = new MusicBand("FFF",2008);
        MusicBand mb8 = new MusicBand("OOO",2008);
        MusicBand mb9 = new MusicBand("LLL",2010);
        MusicBand mb10 = new MusicBand("TTT",2003);
        MusicBand mb11 = new MusicBand("XXX",2015);

        List<MusicBand> musicBands = new ArrayList();

        musicBands.add(mb1);
        musicBands.add(mb2);
        musicBands.add(mb3);
        musicBands.add(mb4);
        musicBands.add(mb5);
        musicBands.add(mb6);
        musicBands.add(mb7);
        musicBands.add(mb8);
        musicBands.add(mb9);
        musicBands.add(mb10);
        musicBands.add(mb11);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));



    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();

        for (MusicBand band:bands) {
            if (band.getYear()>2000){
                musicBandsAfter2000.add(band);
            }
        }
        return musicBandsAfter2000;
    }
}
