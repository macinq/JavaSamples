//Задание 12.5.1
package com.bobrovsky.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        int[][] array = new int[size][];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array length:");
            int len = scanner.nextInt();
            array[i] = new int[len];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter the values:");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) {
                    System.out.print(array[i][j] + "]");
                } else {
                    System.out.print(array[i][j] + ", ");
                }
            }
            if (array[i].length == 0) {
                System.out.print("]");
            }
            System.out.println();
        }
    }
}