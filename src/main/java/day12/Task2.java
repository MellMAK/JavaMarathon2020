package day12;
/*
Create a new list, fill it with even numbers from 0 to 30 and from 300 to 350. Display the list.
*/
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                arrList.add(i);
            }
        }
        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                arrList.add(i);
            }
        }
        System.out.println(arrList);
    }
}
