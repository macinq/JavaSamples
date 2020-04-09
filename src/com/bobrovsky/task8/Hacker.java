//Задание 8.8
package com.bobrovsky.task8;

import java.util.Scanner;

public class Hacker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = keyboard.nextInt();

        int temp = 0;
        for (int i = 1; i <= num; i *= 2) {
            temp = i;
        }

        if (num == temp) {
            System.out.println("The number is binary");
        } else {
            System.out.println("The number is not binary");
        }
    }
}
