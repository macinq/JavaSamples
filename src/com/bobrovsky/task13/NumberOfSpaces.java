//Задание 13.3.1
package com.bobrovsky.task13;

import java.util.Scanner;

public class NumberOfSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text:");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                count++;
            }
        }

        System.out.println("Number of spaces:");
        System.out.println(count);
    }
}
