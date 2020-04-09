//Задание 8.11
package com.bobrovsky.task8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = keyboard.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("The factorial from " + n + " equals:");
        System.out.println(factorial);
    }
}
