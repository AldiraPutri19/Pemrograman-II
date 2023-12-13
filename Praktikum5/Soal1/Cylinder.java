package Praktikum5.Soal1;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area() {
        return Math.PI * (radius * radius) * height;
    }

    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}

