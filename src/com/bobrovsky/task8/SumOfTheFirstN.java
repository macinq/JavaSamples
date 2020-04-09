//Задание 8.1
package com.bobrovsky.task8;

import java.util.Scanner;

public class SumOfTheFirstN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = keyboard.nextInt();
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        System.out.println("The sum of the first n:");
        System.out.println(sum);
    }
}
