//Задание 11.4.2
package com.bobrovsky.task11;

import java.util.Random;
import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = 100;
        int value = 50;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(value) + 1;
        }

        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < size ; i++) {
            if (num == array[i]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("This number was not found.");
        } else {
            System.out.println("This number was found in the index:");
            System.out.println(index);
        }
    }
}
