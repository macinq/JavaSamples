//Задание 8.7
package com.bobrovsky.task8;

import java.util.Scanner;

public class WinnieThePooh {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of days:");
        int n = keyboard.nextInt();
        System.out.println("Enter pot volume:");
        int x = keyboard.nextInt();
        System.out.println("Enter handful volume:");
        int y = keyboard.nextInt();

        int sum = 0;
        int pot = x;
        int day = 0;

        for (int i = 0; n > 0 && pot > 0; i++) {
            pot = x - y * i;
            sum += pot;
            n--;
            day++;
        }
        System.out.println("Total accumulated:");
        System.out.println(sum);
        System.out.println("The pot became empty on day " + day);
    }
}
