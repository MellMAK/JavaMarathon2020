package day5.Task1;

/*Create a class Car, with the fields “Year”, “Color”, “Model”. Create get and set methods for each field. Create
an instance of the Car class, set each field as a setter, display the value of each field as a getter to the console.
The class you create must follow the principles of encapsulation.*/
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Tesla");
        car.setColor("Black");
        car.setYear(2022);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getYear());
    }
}
