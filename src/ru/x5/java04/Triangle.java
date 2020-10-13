package ru.x5.java04;

public class Triangle implements Shape {

    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double square() {

        //create perimeter p
        double p = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
