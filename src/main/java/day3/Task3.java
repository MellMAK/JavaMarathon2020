package day3;

import java.util.Scanner;
/*Implement a program that prompts the user for two numbers 5 times - dividend and divisor. For these two numbers,
the program calculates the result of division and prints it to the console. If the user enters 0 as the divisor,
instead of in order to stop the loop forcibly, we skip the iteration and print the message “Division by 0” to the
console. The else keyword cannot be used in this program.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) {
                System.out.println("Division by 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
