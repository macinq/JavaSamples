//Задание 12.5.6
package com.bobrovsky.task12;

import java.util.Random;
import java.util.Scanner;

public class Transposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        System.out.println("Enter the length:");
        int len = scanner.nextInt();
        System.out.println("Enter the number of values:");
        int val = scanner.nextInt();

        int[][] matrix = new int[size][len];
        int[][] transpose = new int[len][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j] = random.nextInt(val) + 1;
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < size; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose:");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
