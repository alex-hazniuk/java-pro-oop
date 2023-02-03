package com.company.figures;

public class Triangle implements Figure {
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public double getSquare() {
        if (aSide >= 0 && bSide >= 0 && cSide >= 0){
            double value = (aSide + bSide + cSide) / 2.0;
            return Math.sqrt(value * (value - aSide) * (value - bSide) * (value - cSide));
        }
        return 0;
    }
}
