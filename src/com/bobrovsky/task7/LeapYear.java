package com.bobrovsky.task7;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int year = keyboard.nextInt();

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Your year is leap year");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Your year is leap year");
        } else if (year % 100 == 0) {
            System.out.println("Your year is not leap year");
        } else {
            System.out.println("Your year is not leap year");
        }
    }
}
