//Задание 13.3.5
package com.bobrovsky.task13;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        String str3;
        char[] ch3 = new char[ch1.length + ch2.length];

        for (int i = 0; i < ch1.length; i++) {
            ch3[i] = ch1[i];
        }
        for (int i = ch1.length; i < ch3.length; i++) {
            ch3[i] = ch2[i - ch1.length];
        }
        str3 = new String(ch3);

        System.out.println("Result:");
        System.out.println(str3);
    }
}
