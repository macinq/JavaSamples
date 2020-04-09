//Задание 8.4
package com.bobrovsky.task8;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = keyboard.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd:");
        System.out.println(sum);
    }
}
