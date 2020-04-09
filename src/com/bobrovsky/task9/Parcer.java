//Задание 9.6.8
package com.bobrovsky.task9;

import java.util.Scanner;

public class Parcer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Number of values:");
        int num = keyboard.nextInt();
        System.out.println("Values:");
        int value;

        int min = 0;
        int max = 0;
        for (int i = 1; i <= num ; i++) {
            value = keyboard.nextInt();

            if (i == 1) {
                max = value;
                min = value;
            } else if (value <= min){
                min = value;
            } else {
                max = value;
            }
        }
        System.out.println("Minimum value:");
        System.out.println(min);
        System.out.println("Maximum value:");
        System.out.println(max);
    }
}
