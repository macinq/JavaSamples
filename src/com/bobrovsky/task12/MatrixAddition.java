//Задание 12.5.3
package com.bobrovsky.task12;

import java.util.Scanner;
import java.util.Random;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        System.out.println("Enter the length:");
        int len = scanner.nextInt();
        System.out.println("Enter the number of values:");
        int val = scanner.nextInt();

        int[][] matrixA = new int[size][len];
        int[][] matrixB = new int[size][len];
        int[][] matrixC = new int[size][len];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < len; j++) {
                matrixA[i][j] = random.nextInt(val) + 1;
                matrixB[i][j] = random.nextInt(val) + 1;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < len; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Matrix A:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix B:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix C (Sum):");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
