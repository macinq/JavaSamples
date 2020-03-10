package com.listing;

import java.util.Scanner;

public class NameAgeHeightMassToBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int now = 2020;
        String name;
        int age;
        double height;
        double mass;

        System.out.print("Your name: ");
        name = input.nextLine();

        System.out.print("Your age: ");
        age = input.nextInt();

        System.out.print("Your height (in meters): ");
        height = input.nextDouble();

        System.out.print("Body mass (in kilograms): ");
        mass = input.nextDouble();

        double bmi = mass / height / height;

        System.out.println("Hello, " + name + "!");
        System.out.println("You were born in " + (now - age - 1) + ".");
        System.out.printf("Your body mass index: %5.2f\n", bmi);
    }
}
