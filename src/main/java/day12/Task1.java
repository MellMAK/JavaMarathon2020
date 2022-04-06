package day12;
/*
Create a list of strings, add 5 car brands to it, print the list to the console.
Add 1 more car in the middle, remove the first car from the list. Print the list.
 */
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> carsList = new ArrayList<>();

        carsList.add("VW");
        carsList.add("Audi");
        carsList.add("Mercedes");
        carsList.add("Ferrari");
        carsList.add("Lamborghini");

        System.out.println(carsList);

        carsList.add(3,"Ford");

        carsList.remove(0);

        System.out.println(carsList);
    }
}
