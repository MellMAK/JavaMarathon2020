package day6.Task3;
/*Create a class Teacher, having the fields “Name”, “Subject”. Create class Student with the field “Name”
Each class has a constructor (with parameters), set and get methods necessary, and also the teacher has
a method evaluate (evaluate the student), taking a student as an argument, and working:
inside the method, a number from 2 to 5 is randomly generated. Evaluate() should take the values "excellent",
"Good", "Satisfactory" or "Unsatisfactory", depending on random number values.

Create 1 instance of each class, call the evaluation method on the teacher student by passing the student
as the method argument.

Don't run the tests of day 6, they turned out to be not universal.*/
public class Task3 {
    public static void main(String[] args) {
        Teacher teacherRoman = new Teacher("Roman","\"Java Programing\"");
        Student studentAlina=new Student("Alina");

        teacherRoman.evaluate(studentAlina);
    }
}
