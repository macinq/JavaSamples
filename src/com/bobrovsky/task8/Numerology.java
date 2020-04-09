//Задание 8.9
package com.bobrovsky.task8;

import java.util.Scanner;

public class Numerology {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = keyboard.nextInt();
        int sum = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum % 2 == 0) {
            System.out.println("The number " + sum + " is even -- love");
        } else {
            System.out.println("The number " + sum + " is odd -- not love");
        }
    }
}
