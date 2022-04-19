package day9.Task1;

public class Teacher extends Human{
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("I`m teacher " + subject);
    }
}
