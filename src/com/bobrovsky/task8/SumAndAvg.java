//Задание 8.3
package com.bobrovsky.task8;

import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number n:");
        int n = keyboard.nextInt();
        System.out.println("Enter the number m:");
        int m = keyboard.nextInt();

        int sum = 0;
        int amount = m - (n - 1);

        for (int i = n; i <= m ; i++) {
            sum += i;
        }

        double avg = (double) sum / amount;

        System.out.println("Sum of numbers:");
        System.out.println(sum);
        System.out.println("The average value:");
        System.out.println(avg);
    }
}
