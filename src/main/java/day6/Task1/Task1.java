package day6.Task1;


/*Implement two methods in the Car and Motorcycle classes: info () - displays the string "This is a car"
(or "This is a motorcycle") to the console; yearDifference () - takes a number (year) as input, and returns the
difference between transferred year and year of manufacture of the vehicle

Don't run the tests of day 6, they turned out to be not universal.*/
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Tesla");
        car.setColor("Black");
        car.setYear(2019);

        Motorbike motorbike = new Motorbike("Harley Davidson", 2015, "Pink");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2022));
        System.out.println(motorbike.yearDifference(2022));

    }
}
