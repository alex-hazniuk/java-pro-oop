package com.company.lesson3.hometask5.figures;

public class SquareCounter {
    public void getSumSquares(Figure[] figures) {
        if (figures != null && figures.length > 0) {
            double sumSquares = 0;
            for (Figure figure : figures) {
                sumSquares += figure != null ? figure.getSquare() : 0;
            }
            System.out.println(sumSquares);
        } else {
            System.out.println("No figures!");
        }
    }
}
