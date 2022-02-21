package day5.Task2;

/*Create a class Motorcycle , with the fields “Year”, “Color”, "Model". Create an instance of the Motorcycle class
using the constructor (setters are not use). Adhere to the principles of encapsulation and use the keyword "this".
Getter to get the year of manufacture, color, model, display the value in console.*/
public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Harley Davidson", 2022, "Pink");
        System.out.println(motorbike.getModel() + " " + motorbike.getYear() + " " + motorbike.getColor());
    }
}
