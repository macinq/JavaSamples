//Задание 11.4.8
package com.bobrovsky.task11;

import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int value = 10;
        int[] array = new int[size];

        System.out.println("Array:");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(value) + 1;
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Sort:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
