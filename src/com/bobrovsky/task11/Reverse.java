//Задание 11.4.5
package com.bobrovsky.task11;

import java.util.Random;

public class Inverse {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int element = random.nextInt(10) + 1;
            array[i] = element;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            int temp = array[i];
            array[i] = array[10 - i - 1];
            array[10 - i - 1] = temp;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
