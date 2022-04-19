package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*The number n is entered from the keyboard - the size of the array. Need to create an array of the specified size and
fill it with random numbers from 0 to 10. Then output the contents of the array to the console, as well as output to
the console information about:
a) The length of the array
b) Number of numbers greater than 8
c) The number of numbers equal to 1
d) The number of even numbers
e) The number of odd numbers
f) The sum of all elements of the array*/

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        int moreThanEight = 0;
        int equalsOne = 0;
        int evenNumb = 0;
        int oddNumb = 0;
        int sumNumb = 0;
        Random randomNumb = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumb.nextInt(10);
            if (array[i] > 8) {
                moreThanEight++;
            }
            if (array[i] == 1) {
                equalsOne++;
            }
            if (array[i] % 2 == 0) {
                evenNumb++;
            }
            if (array[i] % 2 != 0) {
                oddNumb++;
            }
            sumNumb += array[i];

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Array length: " + array.length);
        System.out.println("Number of numbers greater than 8: " + moreThanEight);
        System.out.println("The number of numbers equal to 1: " + equalsOne);
        System.out.println("Thr number of even numbers: " + evenNumb);
        System.out.println("The number of odd numbers: " + oddNumb);
        System.out.println("The sum of all array elements: " + sumNumb);


    }
}
