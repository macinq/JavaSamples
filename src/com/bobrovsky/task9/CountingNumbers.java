//Задание 9.6.2
package com.bobrovsky.task9;

public class CountingNumbers {
    public static void main(String[] args) {

        int n = 100;
        int m = 400;
        int count = 0;

        for (int i = n; i <= m; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println("Amount of numbers:");
        System.out.println(count);
    }
}
