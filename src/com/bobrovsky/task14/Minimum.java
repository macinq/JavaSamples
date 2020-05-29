//Задание 14.2
package com.bobrovsky.task14;

import java.util.Scanner;

public class Minimum {

    static int Minimum(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        }
        return num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        int res = Minimum(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Result:");
        System.out.println(res);
    }
}
