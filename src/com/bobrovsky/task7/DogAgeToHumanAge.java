package com.bobrovsky.task7;

import java.util.Scanner;

public class DogAgeToHumanAge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter dog age:");
        int dogAge = keyboard.nextInt();
        double firstCount = 10.5;
        int secondCount = 4;
        int dogAgeToHumanAge;

        if (0 < dogAge && dogAge <= 2) {
            dogAgeToHumanAge = (int) (dogAge * firstCount);
        } else {
            dogAgeToHumanAge = (int) (2 * firstCount + (dogAge - 2) * secondCount);
        }
        System.out.println("Human age of a dog is " + dogAgeToHumanAge + " years");
    }
}
