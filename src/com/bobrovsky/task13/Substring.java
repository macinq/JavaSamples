//Задание 13.3.7
package com.bobrovsky.task13;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the index:");
        int index = scanner.nextInt();
        System.out.println("Enter the length:");
        int length = scanner.nextInt();
        String str2;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = new char[length];

        for (int i = 0; i < length; i++) {
            ch2[i] = ch1[i + index];
        }
        str2 = new String(ch2);

        System.out.println("substring:");
        System.out.println(str2);
    }
}
