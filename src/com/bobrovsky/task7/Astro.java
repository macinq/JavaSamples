package com.bobrovsky.task7;

import java.util.Scanner;

public class Astro {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int year1 = keyboard.nextInt();
        System.out.println("Enter somebody's birth year:");
        int year2 = keyboard.nextInt();

        int firstN1 = (int) (year1 / 1000.0);
        int firstN2 = (int) (year2 / 1000.0);

        int secondN1;
        int thirdN1;
        if (1900 <= year1 && year1 < 2000) {
            secondN1 = (int) ((year1 - 1000) / 100.0);
            thirdN1 = (int) ((year1 - 1900) / 10.0);
        } else {
            secondN1 = (int) ((year1 - 2000) / 100.0);
            thirdN1 = (int) ((year1 - 2000) / 10.0);
        }

        int secondN2;
        int thirdN2;
        if (1900 <= year2 && year2 < 2000) {
            secondN2 = (int) ((year2 - 1000) / 100.0);
            thirdN2 = (int) ((year2 - 1900) / 10.0);
        } else {
            secondN2 = (int) ((year2 - 2000) / 100.0);
            thirdN2 = (int) ((year2 - 2000) / 10.0);
        }

        int fourthN1 = year1 % 10;
        int fourthN2 = year2 % 10;

        int sum1 = firstN1 + secondN1 + thirdN1 + fourthN1;
        int sum2 = firstN2 + secondN2 + thirdN2 + fourthN2;

        System.out.println(firstN1 + " + " + secondN1 + " + " + thirdN1 + " + " + fourthN1 + " = " + sum1);
        System.out.println(firstN2 + " + " + secondN2 + " + " + thirdN2 + " + " + fourthN2 + " = " + sum2);

        if (sum1 > sum2) {
            System.out.println("You both fit together");
        } else {
            System.out.println("You are not a good couple");
        }
    }
}
