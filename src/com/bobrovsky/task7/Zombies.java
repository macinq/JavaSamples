package com.bobrovsky.task7;

import java.util.Scanner;

public class Zombies {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int hid = keyboard.nextInt();

        if (hid % 5 == 0 && hid % 11 == 0) {
            System.out.println("It's a human. No shooting!");
        } else {
            System.out.println("It's a zombie. Ready to shoot!");
        }
    }
}
