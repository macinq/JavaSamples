//Задание 14.3
package com.bobrovsky.task14;

import java.util.Scanner;

public class NumberOfWords {

    static int WordCount(String str) {
        char[] ch = str.toCharArray();
        int count = 0;

        if (ch[0] != ' ') {
            count++;
        }
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ' ' && ch[i + 1] != ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        int res = WordCount(scanner.nextLine());

        System.out.println("Result:");
        System.out.println(res);
    }
}
