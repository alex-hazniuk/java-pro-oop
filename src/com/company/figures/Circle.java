package com.company.figures;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        if (radius >= 0) {
            return Math.PI * radius * radius;
        }
        return 0;
    }
}
