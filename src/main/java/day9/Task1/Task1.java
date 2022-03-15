package day9.Task1;

/*Create a class Human. The person must have a “name” field. This field in the class must have a constructor, get and
set methods. Also, at There should be a printInfo() method that prints information to the console about a person in
the format: “My name is....” .Then, create a class Student, which is inherited from the class Human. The student has an
additional string field - the name of his educational groups. For this field, you also need to create a getter and
setter. Constructor in class The student must take two arguments as input - the name and the name of the educational
groups. The printInfo() method in the Student class should be overridden so that the format of the message output to the
console is as follows:
“My name is...”
“I`m a student from...”
And finally, in our program there should be one more entity - the Teacher. The teacher must also inherit from the Person
class.
In this case, the teacher has an additional string field - the name of the subject, led by this instructor. For this
field, you need to create a get and set methods. The constructor in the class The teacher must accept two argument -
the name of the teacher and the name of the taught subject. Method printInfo() in the Teacher class should be overridden
in such a way that so that the format of the message output to the console is as follows:
“My name is...”
“I`m a teacher ...”
(exactly two lines should be displayed - you must use the keyword
super)
In the main() method of the Task1 class, create an object of the Student class and an object of the class Teacher.
Print the name of the study group in the student object to the console and the name of the subject of the object-
teacher. Then, call printInfo() on objects and look at the result.*/
public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ron", "Biology");
        Student student = new Student("Roman", "B-12");

        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
