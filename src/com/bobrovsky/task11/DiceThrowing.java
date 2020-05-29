//Задание 11.4.9
package com.bobrovsky.task11;

import java.util.Random;
import java.util.Scanner;

public class DiceThrowing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the number of dice [1..4]:");
        int n = scanner.nextInt();
        System.out.println("Select the number of edges [d4,d6,d8,d10,d12]:");
        int m = scanner.nextInt();

        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += random.nextInt(m) + 1;
        }

        System.out.println("Rolled:");
        System.out.println(res);
    }
}
