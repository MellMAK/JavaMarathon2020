package day9.Task2;
/*  Create an abstract class Figure. This class will be abstract representation of a geometric figure in our program. All
figures in our program have a color, so the Figure.class has a string "color" field. Create a constructor, getter and
setter for this field.
    The Figure.class has two abstract methods:
 - public abstract double area();
 - public abstract double perimeter();
    The implementation of the first method must return the area of the figure, and the implementation the second method
should return the perimeter of the figure.
    Create 3 geometric figures: Circle, Rectangle and Triangle. Each of the figures must be inherited from the abstract
class Figure. The Circle class will have one field - the radius of the circle. The Rectangle class will have two fields
- width and height. The Triangle class will have three fields - the length of each side. For each of these three classes,
you need to implement a constructor that accepts the dimensions of the shape and the color of the shape as input. In the
same classes, you need to implement two methods area() and perimeter(). The implementation of these methods will be
different for each of the geometric figures.
    After the geometric figures are fully realized, you have to implement one more class - TestFigures . In this class,
in main() method must be created and placed in the array  some geometric figures.
    In the same class, implement two methods. The first method, taking an array of geometric figures as input, should
return the sum of the perimeters of the red figures. The second method, taking an array as input geometric figures,
should return the sum of the areas of the red figures.
Call these two methods on the figures array and print the result to the console.*/
public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5),
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure figure :
                figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure figure :
                figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.area();
            }
        }
        return sum;
    }
}
