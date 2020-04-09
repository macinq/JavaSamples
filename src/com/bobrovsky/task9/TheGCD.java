//Задание 9.6.6
package com.bobrovsky.task9;

import java.util.Scanner;

public class TheGCD {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int min;
        int gsd = 1;

        if (x > y) {
            min = y;
        } else {
            min = x;
        }
        if (x == 0 && y != 0) {
            gsd = y;
        } else if (x != 0 && y == 0 ) {
            gsd = x;
        }
        for (int i = min; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                gsd = i;
                break;
            }
        }
        System.out.println("The greatest common divisor:");
        System.out.println(gsd);
    }
}
