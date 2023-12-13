package Praktikum5.Soal1;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " with length " + length + " and width " + width;
    }
}
