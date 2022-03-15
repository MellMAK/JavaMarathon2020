package day9.Task1;

public class Student extends Human {
    private String group;

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("I`m  student from " + group);
    }
}
