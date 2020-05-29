//Задание 11.4.7
package com.bobrovsky.task11;

import java.util.Random;

public class Duplication {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 20;
        int value = 20;
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        for (int i = 0; i < 20; i++) {
            array1[i] = random.nextInt(value) + 1;
            array2[i] = random.nextInt(value) + 1;
        }

        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array1[i] == array2[j]) {
                    res[i] = array1[i];
                    break;
                }
            }
        }

        System.out.println("Common values found:");
        for (int i = 0; i < size; i++) {
            int found = 0;
            for (int j = 0; j < size; j++) {
                if (res[i] == res[j] && i != j) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                System.out.print(res[i] + " ");
            }
        }
    }
}

