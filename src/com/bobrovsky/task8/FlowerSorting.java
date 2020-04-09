//Задание 8.10
package com.bobrovsky.task8;

import java.util.Scanner;

public class FlowerSorting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String pot1 = "Geranium";
        String pot2 = "Violet";
        String pot3 = "Cactus";

        String left = pot1;
        String center = pot2;
        String right = pot3;

        String temp;
        System.out.println("Enter the number of days:");
        int n = keyboard.nextInt();

        for (int i = 0; i < n; i++) {
            temp = right;
            right = center;
            center = temp;
            temp = left;
            left = center;
            center = temp;
        }
        System.out.println("Order of flowers in " + n + " days:");
        System.out.println(left + " " + center + " " + right);

    }
}
