package com.company.lesson3.hometask5.figures;

public class Square implements Figure {
    private  double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        if (side >= 0) {
            return side * side;
        }
        return 0;
    }
}
