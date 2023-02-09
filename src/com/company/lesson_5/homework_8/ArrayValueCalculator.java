package com.company.lesson_5.homework_8;

public class ArrayValueCalculator {
    private static final int MATRIX_SIZE = 4;

    public int doCalc(String[][] numbers) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        if (numbers != null) {
            if (numbers.length != MATRIX_SIZE) {
                throw new ArraySizeException("Change matrix size. It should be 4x4!");
            }
            for (int i = 0; i < MATRIX_SIZE; i++) {
                if (numbers[i] == null || numbers[i].length != MATRIX_SIZE) {
                    throw new ArraySizeException("Change matrix size. It should be 4x4!");
                }
                for (int j = 0; j < MATRIX_SIZE; j++) {
                    try {
                        sum += Integer.parseInt(numbers[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Invalid data in row - " + i
                                + ", column - " + j);
                    }
                }
            }
            return sum;
        }
        throw new RuntimeException("Matrix isn`t initialized");
    }
}
