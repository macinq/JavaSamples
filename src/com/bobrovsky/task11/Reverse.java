//Задание 11.4.5
package com.bobrovsky.task11;

import java.util.Random;

public class Reverse {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int value = 10;

        System.out.println("Direct:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int element = random.nextInt(value) + 1;
            array[i] = element;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }

        System.out.println("Reverse:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
