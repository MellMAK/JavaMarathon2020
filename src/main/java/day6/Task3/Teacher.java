package day6.Task3;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int point = random.nextInt(4) + 2;
        String grade;
        switch (point){
            case 5:
                grade = "\"Excellent\"";
                break;
            case 4:
                grade = "\"Good\"";
                break;
            case 3:
                grade = "\"Satisfactorily\"";
                break;
            default:
                grade = "\"Unsatisfactorily\"";
                break;
        }
        System.out.println("Teacher " + this.name +
                "\ngraded the student with the name " + student.getName() +
                "\nin the subject " + this.subject +
                "\nfor grade " + grade);

    }
}
