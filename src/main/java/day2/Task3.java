package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Incorrect input");
        }

        int x = a + 1;
        while (x < b) {
            if (x % 5 == 0 && x % 10 !=  0) {
                System.out.print(x + " ");
            }
            x++;
        }
    }
}
