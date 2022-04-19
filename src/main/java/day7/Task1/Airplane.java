package day7.Task1;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Producer: " + producer +
                " year: " + year +
                " length: " + length +
                " weight: " + weight +
                " fuel: " + fuel);
    }

    public void fillUp(int liters) {
        fuel += liters;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println(airplane1.producer + " is longer than " + airplane2.producer);
        } else if (airplane1.length < airplane2.length) {
            System.out.println(airplane2.producer + " is longer than " + airplane2.producer);
        }else {
            System.out.println(airplane2.producer + " length equals " + airplane2.producer);
        }

    }
}
