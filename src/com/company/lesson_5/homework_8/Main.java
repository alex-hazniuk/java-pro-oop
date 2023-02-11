package com.company.lesson_5.homework_8;

public class Main {
    public static void main(String[] args) {
        String[][] words = {{"2", "4", "0", "0"},
                {"0", null, "0", "0"},
                {"0", "0", "0", "0"},
                {"0", "0", "0", "0"}};
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        try {
            System.out.println(calculator.doCalc(words));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
