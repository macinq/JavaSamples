//Задание 19
package com.bobrovsky.task19;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Tests {
    public static String substring(String str, int index, int len) {
        System.out.println("<Start log>");
        System.out.println("Initial log: " + str + " (value passed: str)");
        System.out.println("Initial log: " + index + " (value passed: index)");
        System.out.println("Initial log: " + len + " (value passed: len)");
        char[] ch1 = str.toCharArray();
        System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber() + " line log: " + Arrays.toString(ch1) + " (create: ch1)");
        char[] ch2 = new char[len];
        System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber() + " line log: " + Arrays.toString(ch2) + " (create: ch2)");

        for (int i = 0; i < len; i++) {
            ch2[i] = ch1[i + index];
            System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber() + " line log: " + ch1[i + index] + " (assignment: ch1[i + index]) " + i + " (count: i) " + Arrays.toString(ch2) + " (result: ch2)");
        }
        String sub = new String(ch2);
        System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber() + " line log: " + sub + " (return: sub)");
        System.out.println("<End log>");

        return sub;
    }

    public static void test1() {
        long m = System.currentTimeMillis();
        Random random = new Random();
        int flag = 1;

        for (int i = 0; i < 10000; i++) {
            int num = random.nextInt(50) + 1;
            byte[] arr = new byte[num];
            random.nextBytes(arr);
            String genStr = new String(arr, StandardCharsets.UTF_16);

            int genIndex = num / 10;
            int genLen = num / 10;

            if (!substring(genStr, genIndex, genLen).equals(genStr.substring(genIndex, genIndex + genLen))) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("TEST 1 PASSED");
        } else {
            System.out.println("TEST 1 FAILED");
        }

        System.out.println((double) (System.currentTimeMillis() - m));
    }

    public static void test2() {
        long m = System.currentTimeMillis();
        String str = "";

        if (substring(str, 0, 0).equals(str.substring(0, 0))) {
            System.out.println("TEST 2 PASSED");
        } else {
            System.out.println("TEST 2 FAILED");
        }

        System.out.println((double) (System.currentTimeMillis() - m));
    }

    public static void test3() {
        Random random = new Random();
        long m = System.currentTimeMillis();

        char[] ch = new char[100000];
        for (int i = 0; i < 100000; i++) {
            ch[i] = (char) (random.nextInt(Character.MAX_VALUE));
        }
        String out = Arrays.toString(ch);

//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 100000; i++) {
//            char c = (char) (random.nextInt(Character.MAX_VALUE));
//            stringBuilder.append(c);
//        }
//        String out = stringBuilder.toString();

        if (substring(out, 0, 100000).equals(out.substring(0, 100000))) {
            System.out.println("TEST 3 PASSED");
        } else {
            System.out.println("TEST 3 FAILED");
        }

        System.out.println((double) (System.currentTimeMillis() - m));
    }

    public static void test4() {
        long m = System.currentTimeMillis();
        String str = "abcdefghijklmnopqrstuvwxyz1234567890";
        int index = 0;
        int len = 36;

        if (substring(str, index, len).equals(str)) {
            System.out.println("TEST 4 PASSED");
        } else {
            System.out.println("TEST 4 FAILED");
        }

        System.out.println((double) (System.currentTimeMillis() - m));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        System.out.println("Enter the index:");
        int index = scanner.nextInt();
        System.out.println("Enter the length:");
        int len = scanner.nextInt();

        System.out.println("substring:");
        System.out.println(substring(str, index, len));

        System.out.println();
        System.out.println("TEST1");
        test1();

//        System.out.println();
//        System.out.println("TEST2");
//        test2();
//
//        System.out.println();
//        System.out.println("TEST3");
//        test3();

        System.out.println();
        System.out.println("TEST4");
        test4();
    }
}
