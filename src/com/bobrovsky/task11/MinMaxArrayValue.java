//Задане 11.4.3
package com.bobrovsky.task11;

import java.util.Random;

public class MinMaxArrayValue {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 100;
        int value = 1000;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            int element = random.nextInt(value) + 1;
            array[i] = element;
        }

        int min = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                min = array[i];
                max = array[i];
            } else if (array[i] <= min) {
                min = array[i];
            } else if (array[i] >= max){
                max = array[i];
            }
        }
        System.out.println("Minimum value:");
        System.out.println(min);
        System.out.println("Maximum value:");
        System.out.println(max);
    }
}
