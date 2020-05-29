//Задание 12.5.4
package com.bobrovsky.task12;

import java.util.Random;
import java.util.Scanner;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        System.out.println("Enter the number of values:");
        int val = scanner.nextInt();

        int[][] matrix = new int[size][size];
        int sumDiagonal = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(val) + 1;
            }
        }

        for (int i = 0; i < size; i++) {
            sumDiagonal += matrix[i][i];
        }

        System.out.println("Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Sum of the main diagonal:");
        System.out.println(sumDiagonal);
    }
}
