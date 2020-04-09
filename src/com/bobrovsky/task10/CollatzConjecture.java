//Задание 10.3.6
package com.bobrovsky.task10;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number (n > 0):");
        int n = keyboard.nextInt();

        int count = 0;
        do {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            count++;
        } while (n != 1);

        System.out.println("Number of iterations:");
        System.out.println(count);
    }
}
