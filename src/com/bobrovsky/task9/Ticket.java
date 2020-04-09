//Задание 9.6.9
package com.bobrovsky.task9;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter ticket number:");
        int num = keyboard.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                sum1 += num % 10;
                num /= 10;
            } else {
                sum2 += num % 10;
                num /= 10;
            }
        }

        if (sum1 == sum2) {
            System.out.println("Lucky ticket!");
        } else {
            System.out.println("Next time you will be lucky.");
        }
    }
}
