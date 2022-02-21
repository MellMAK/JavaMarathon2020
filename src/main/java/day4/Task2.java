package day4;
/*Create a new array of size 100 and fill it with random numbers from
range from 0 to 10000.
Then, using "for each" loops output:
- the largest element of the array
- the smallest element of the array
- number of array elements ending in 0
- sum of array elements ending in 0
Sorting is not allowed.*/

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
//        the largest element of the array
        int max = array[0];
        int min = array[0];
        int count = 0;
        int sum = 0;


        for (int element : array) {
//          the largest element of the array
            if (element > max) {
                max = element;
            }
//          the smallest element of the array
            if (element < min) {
                min = element;
            }
//          number of array elements ending in 0
//          and
//          sum of array elements ending in 0
            if (element % 10 == 0) {
                count++;
                sum += element;
            }
        }
        System.out.println("The largest element of the array is " + max);
        System.out.println("The smallest element of the array is " + min);
        System.out.println("Number of array elements ending in 0 is " + count);
        System.out.println("Sum of array elements ending in 0 is " + sum);
    }
}
