package day7.Task1;
/*For this task, copy the Aircraft class from the previous day to the current day's package.day.
In the Airplane class, create a static method compareAirplanes , which takes two objects of the Airplane class
(two aircraft) as arguments and outputs a message to the console about which of the planes is longer.*/
public class Task1 {
    public static void main(String[] args) {
    Airplane airplane1 = new Airplane("AN-148", 2015, 100, 50000);
    Airplane airplane2 = new Airplane("AN-150", 2019, 100, 70000);

    Airplane.compareAirplanes(airplane1,airplane2);
    }
}