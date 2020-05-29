//Задание 11.4.1
package com.bobrovsky.task11;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 2;
        int value = 50;
        int[] array = new int[size];
        int sum = 0;
        double avg;

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(value) + 1;
        }

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        avg = (double) sum / size;

        System.out.println("Sum:");
        System.out.println(sum);
        System.out.println("Average:");
        System.out.println(avg);
    }
}
