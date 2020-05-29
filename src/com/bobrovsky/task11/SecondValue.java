//Задание 11.4.4
package com.bobrovsky.task11;

import java.util.Random;

public class SecondValue {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 2;
        int value = 100;

//        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        int[] array = {1, 2};
//        int[] array = {1, 2, 3, 4, 5};
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = random.nextInt(value) - 50;
//            System.out.print(array[i] + " ");
//        }

        System.out.println();
        int max = 0;
        int second = 0;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    max = array[i];
                    second = array[i + 1];
                } else {
                    max = array[i + 1];
                    second = array[i];
                }
            } else if (array[i] > max) {
                second = max;
                max = array[i];
            } else if (max != array[i] && array[i] > second) {
                second = array[i];
            }
        }

        System.out.println("Maximum value:");
        System.out.println(max);
        System.out.println("Second value:");
        System.out.println(second);
    }
}

//        for (int i = 0; i < size; i++) {
//            if (array[0] > array[i]) {
//                int temp = array[0];
//                array[0] = array[size - 1];
//                array[size - 1] = temp;
//            }
//        }