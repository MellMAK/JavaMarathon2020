package day4;

import java.util.Random;

/*Fill a two-dimensional array (matrix) with random numbers from 0 to 50. Size
matrices set m=12 , n=8 ( m - row dimension, n - column dimension).
Print the index of the line in the console, the sum of the numbers in which is maximum. If such
there are several lines, print the index of the last one.*/
public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
                sum += matrix[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSumIdx);
    }
}
