package day5.Task2;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(String model,int year, String color) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}
