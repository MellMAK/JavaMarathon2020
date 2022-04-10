package day12.task5;

/*
Now a member of a musical group has not only a name, but also an age. Accordingly, now a member is not as a string, but
as an object of the MusicArtist class. You need to implement the MusicArtist class and modify the MusicBand class so
that the participants are objects of the MusicArtist class. After that, you need to do the same as required in task 4
*/

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();

        members1.add(new MusicArtist("Paul McCartney",19));
        members1.add(new MusicArtist("John Lennon",20));
        members1.add(new MusicArtist("Ringo Starr",21));
        members1.add(new MusicArtist("Ringo Starr",21));
        members1.add(new MusicArtist("George Harrison",22));

        MusicBand band1 = new MusicBand("The Beatles",1960, members1);

        List<MusicArtist> members2 = new ArrayList<>();

        members2.add(new MusicArtist("P.McCartney", 19));
        members2.add(new MusicArtist("J.Lennon",20));
        members2.add(new MusicArtist("R.Starr",21));
        members2.add(new MusicArtist("G.Harrison", 22));

        MusicBand band2 = new MusicBand("The Beatles 2",1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();

    }
}
