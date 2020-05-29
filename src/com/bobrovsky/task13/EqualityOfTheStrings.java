//Задание 13.3.2
package com.bobrovsky.task13;

import java.util.Scanner;

public class EqualityOfTheStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int count = -1;
        int min;

        if (ch1.length < ch2.length) {
            min = ch1.length;
        } else {
            min = ch2.length;
        }

        for (int i = 0; i < min; i++) {
            if (ch1[i] != ch2[i]) {
                count = i;
                break;
            }
        }

        if (ch1.length != ch2.length && count == -1) {
            count = min;
        }


        if (count == -1) {
            System.out.println("EQUALS");
        } else {
            System.out.println("Strings are not equal starting with " + count + " index");
        }
    }
}
