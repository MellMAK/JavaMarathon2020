package day12.task4;
/*
 Copy the MusicBand from the previous assignment and modify it so that you can add and remove members to the group.
A participant is a string ( String ) with a first and last name. Implement a static group merge method (in the
MusicBand class), all members of group A move to group B. This method takes two instances of the MusicBand class as
arguments. Implement the printMembers method (in the MusicBand class) that prints the list of members to the console.
Check group composition after merging.*/

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();

        members1.add("Paul McCartney");
        members1.add("John Lennon");
        members1.add("Ringo Starr");
        members1.add("George Harrison");

        MusicBand band1 = new MusicBand("The Beatles",1960, members1);

        List<String> members2 = new ArrayList<>();

        members2.add("P.McCartney");
        members2.add("J.Lennon");
        members2.add("R.Starr");
        members2.add("G.Harrison");

        MusicBand band2 = new MusicBand("The Beatles 2",1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();




    }
}
