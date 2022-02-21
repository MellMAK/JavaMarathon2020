package day4;

import java.util.Random;

/*Create a new array of size 100 and fill it with random numbers from range from 0 to 10000. Find the maximum among the
sums of three neighboring elements. For the found triple with print the value of the sum and the index of the first
element of the triple with the maximum sum.

Example:
*For simplicity, the example is shown on an array of size 10
[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
Three of a kind with the maximum sum: [2789, 4, 8742]*/
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int maxSumOfThree = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sumOfThree = 0;
            for (int j = i; j < i + 3; j++) {
                sumOfThree += array[j];
            }
            if (sumOfThree > maxSumOfThree) {
                maxSumOfThree = sumOfThree;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSumIdx);
        System.out.println(maxSumOfThree);

    }
}
