package day6.Task2;

/*Create class Airplane ( Airplane ) with fields:
- producer (manufacturer)
- year (year of release)
- length (length)
-weight (weight)
- fuel (amount of fuel in the tank) + getter for this field
Create a constructor in the Airplane class that takes values as arguments four class fields (set the value of the
“amount of fuel in the tank” field to 0). In a constructor, use the "this" keyword to pass values to fields.
In addition, the class must implement the info() method. Also, it is necessary to implement the fillUp() method,
which as an argument takes a number and fills the plane's fuel tank to that value. Create a new object of the Aircraft
class with arbitrary data. Change year and length with setters, call fillUp() method two times, passing different
values. Call the info() method.

Don't run the tests of day 6, they turned out to be not universal.*/
public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("AN-148", 1900, 5, 42000);
        airplane.setYear(2022);
        airplane.setLength(30);
        airplane.fillUp(500);
        airplane.fillUp(2000);
        airplane.info();
    }
}
