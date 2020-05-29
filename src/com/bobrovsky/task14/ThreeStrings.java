//Задание 14.4
package com.bobrovsky.task14;

import java.util.Scanner;

public class ThreeStrings {

    static int Minimum(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        }
        return num3;
    }

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

    static int MinimumNumberOfWords(String str1, String str2, String str3) {
        return Minimum(WordCount(str1), WordCount(str2), WordCount(str3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the strings:");
        int res = MinimumNumberOfWords(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

        System.out.println("Result:");
        System.out.println(res);
    }
}
