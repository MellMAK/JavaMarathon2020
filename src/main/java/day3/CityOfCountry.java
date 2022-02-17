/*Implement a program that prints the name of the country to the console, taking on
city name input.
 */
package day3;

import java.util.Scanner;
/*Implement a program that prints the name of the country to the console, taking on city name input.
The program should run until it is entered the word "Stop".*/
public class CityOfCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String city = sc.nextLine();
            if (city.equals("Stop")){
                break;
            }
            switch (city){
                case "Warsaw":
                case "Cracow":
                case "Gdansk":
                    System.out.println("Poland");
                    break;
                case "Kyiv":
                case "Lviv":
                case "Odessa":
                    System.out.println("Ukraine");
                    break;
                case "Rome":
                case "Milan":
                case "Turin":
                    System.out.println("Italy");
                    break;
                default:
                    System.out.println("Another country");
                    break;
            }
        }
    }
}
