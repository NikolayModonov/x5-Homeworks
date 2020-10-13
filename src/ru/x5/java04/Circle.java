package ru.x5.java04;

public class Circle implements Shape {

    private double diameter;

    public Circle(double diameter) {

        this.diameter = diameter;
    }

    @Override
    public double square() {

        return (3.14 * Math.pow((0.5 * diameter), 2));
    }
}
