package com.bobrovsky.task7;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = keyboard.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}
