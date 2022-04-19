package day8.Task2;
/*Copy the Airplane class from Day 6. Modify the class so that the following code outputs information about the
aircraft, similar to calling the info() method.*/
public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("MIG-29", 2022, 17,11000);
        System.out.println(airplane);
    }
}
