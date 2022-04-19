package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        if (floor <= 0) {
            System.out.println("It`s not a house. Input Error!");
        } else if (floor <= 4) {
            System.out.println("It`s a low-rise house");
        } else if (floor <= 8) {
            System.out.println("It`s a mid-rise house");
        }else{
            System.out.println("It`s a multi-storey building");
        }
    }
}
