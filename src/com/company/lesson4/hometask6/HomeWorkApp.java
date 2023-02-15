package com.company.lesson4.hometask6;

import java.util.Scanner;

public class HomeWorkApp {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(ifSumInScope(1, 10));
        checkNegativePositiveNumber(0);
        System.out.println(ifNegativePositiveNumber(-1));
        printLineIndicatedQuantity("I do my homework", 2);
        System.out.println(ifLeapYear(2000));
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    private static void printThreeWords() {
        System.out.println("Enter three fruits");
        String firstFruit = scanner.nextLine();
        String secondFruit = scanner.nextLine();
        String thirdFruit = scanner.nextLine();
        System.out.printf("%s\n%s\n%s\n", firstFruit, secondFruit, thirdFruit);
    }

    private static void checkSumSign() {
        System.out.println("Enter first addendum");
        int a = scanner.nextInt();
        System.out.println("Enter second addendum");
        int b = scanner.nextInt();
        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    private static void printColor() {
        System.out.println("Enter number to indicate color");
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    private static void compareNumbers() {
        System.out.println("Enter number a");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("“a >= b”");
        } else {
            System.out.println("“a < b”");
        }
    }

    private static boolean ifSumInScope(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }

    private  static void checkNegativePositiveNumber(int number) {
        if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }

    private static boolean ifNegativePositiveNumber(int number) {
        return number < 0;
    }

    private static void printLineIndicatedQuantity(String line, int quantity) {
        while (quantity > 0) {
            System.out.println(line);
            quantity--;
        }
    }

    private  static boolean ifLeapYear(int year) {
        return  year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
