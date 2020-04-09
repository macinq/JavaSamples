package com.bobrovsky.task7;

import java.util.Scanner;

public class HomePainting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the volume of the paint can:");
        int volume = keyboard.nextInt();
        System.out.println("Enter wall dimensions (W/L/H):");
        int width = keyboard.nextInt();
        int length = keyboard.nextInt();
        int height = keyboard.nextInt();

        int area = (width + length) * height;
        double exact = (double) area / volume;
        int amount = (int) (exact + 1); // не меньше целой банки

        System.out.println("Exact amount of cans: " + exact);
        System.out.println("Minimum amount of cans: " + amount);
    }
}
