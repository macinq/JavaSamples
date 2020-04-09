//Задание 10.3.4
package com.bobrovsky.task10;

import java.util.Scanner;

public class DigitRemoval {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = keyboard.nextInt();
        System.out.println("Enter the number to be deleted:");
        int del = keyboard.nextInt();

        int res = 0;
        int ten = 1;
        int sep;

        while (num > 0) {
            sep = num % 10;
            if (sep != del ) {
                res += ten * sep;
                ten *= 10;
            }
            num /= 10;
        }

        System.out.println("Result:");
        System.out.println(res);
    }
}