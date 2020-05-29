//Задание 13.3.6
package com.bobrovsky.task13;

import java.util.Scanner;

public class SecondStringInFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        boolean flag = false;

        for (int i = 0; i < ch1.length - ch2.length; i++) {
            flag = true;
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i + j] != ch2[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        System.out.println("Result: " + flag);
//        System.out.println(flag == 0 ? "False" : "True");
    }
}
