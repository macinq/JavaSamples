//Задание 12.5.5
package com.bobrovsky.task12;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BalanceSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        System.out.println("Enter the number of cols:");
        int col = scanner.nextInt();
        System.out.println("Enter the number of values:");
        int val = scanner.nextInt();

        int[][] table = new int[row][col];
        int[] sumRow = new int[row];
        int[] sumCol = new int[col];
        int sumR = 0;
        int sumC = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                table[i][j] = random.nextInt(val) + 1;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumCol[j] += table[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sumRow[j] += table[j][i];
            }
        }

        for (int i = 0; i < sumRow.length; i++) {
            sumR += sumRow[i];
        }
        for (int i = 0; i < sumCol.length; i++) {
            sumC += sumCol[i];
        }

        System.out.println("Balance sheet:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The sums of rows:");
        System.out.println(Arrays.toString(sumRow) + " = " + sumR);
        System.out.println("The sums of cols:");
        System.out.println(Arrays.toString(sumCol) + " = " + sumC);

        if (sumC == sumR) {
            System.out.println("The sums are equal");
        } else {
            System.out.println("The sums are not equal");
        }
    }
}
