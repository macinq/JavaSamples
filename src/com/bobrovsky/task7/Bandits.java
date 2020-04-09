package com.bobrovsky.task7;

import java.util.Scanner;

public class Bandits {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("all equals");
        } else if (num1 != num2 && num2 != num3 && num3 != num1) {
            System.out.println("all different");
        } else {
            System.out.println("equal or different");
        }
    }
}
