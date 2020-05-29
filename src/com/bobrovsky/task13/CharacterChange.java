//Задание 13.3.3
package com.bobrovsky.task13;

import java.util.Scanner;

public class CharacterChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                ch[i] = 'z';
            }
            str = new String(ch);
        }

        System.out.println("The resulting string:");
        System.out.println(str);
    }
}
