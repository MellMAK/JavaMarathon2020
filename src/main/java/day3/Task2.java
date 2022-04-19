package day3;

import java.util.Scanner;
/*Implement a program that is still running, accepts two numbers as input from the user - the dividend and the divisor.
For these two numbers, the program calculates the division result and prints it to the console. The program stops when
the user enters 0 as a divisor.*/
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) {
                break;
            }
            System.out.println(a / b);
        }


    }
}
