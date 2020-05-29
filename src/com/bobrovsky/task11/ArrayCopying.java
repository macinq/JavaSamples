//Задание 11.4.6
package com.bobrovsky.task11;

import java.util.Random;

public class ArrayCopying {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 15;
        int value = 10;

        System.out.println("Array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(value) + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Copy:");
        int[] copy = new int[size];
        for (int i = 0; i < size; i++) {
            copy[i] = array[i];
            System.out.print(copy[i] + " ");
        }

    }
}
