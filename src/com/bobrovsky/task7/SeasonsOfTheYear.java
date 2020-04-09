package com.bobrovsky.task7;

import java.util.Scanner;

public class SeasonsOfTheYear {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your year:");
        int year = keyboard.nextInt();
        System.out.println("Enter month number (1-12):");
        int month = keyboard.nextInt();
        int days;
        String season;
        boolean leap;

        if (year % 100 == 0 && year % 400 == 0) {
            leap = true;
        } else if (year % 4 == 0 && year % 100 > 0) {
            leap = true;
        } else if (year % 100 == 0) {
            leap = false;
        } else {
            leap = false;
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 2) {
            if (leap == true) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            days = 30;
        }

        if (12 == month || month <= 2) {
            season = "Winter";
        } else if (3 >= month && month <= 5) {
            season = "Spring";
        } else if (6 >= month && month <= 8) {
            season = "Summer";
        } else {
            season = "Autumn";
        }

        System.out.println("This month: " + days + "days, " + season);
    }
}
