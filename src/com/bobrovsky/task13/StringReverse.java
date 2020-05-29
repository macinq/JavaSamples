//Задание 13.3.4
package com.bobrovsky.task13;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length / 2; i++) {
            char tmp = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = tmp;
            str = new String(ch);
        }

        System.out.println("Result:");
        System.out.println(str);
    }
}
