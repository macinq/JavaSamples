//Задание 10.3.2
package com.bobrovsky.task10;

import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = keyboard.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n > 0);
    }
}
