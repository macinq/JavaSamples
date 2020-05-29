//Задание 14.1
package com.bobrovsky.task14;

import java.util.Scanner;

public class SquareOfNumber {

    static double SquareOfRealNumber(double num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        double res = SquareOfRealNumber(scanner.nextDouble());

        System.out.println("Result:");
        System.out.println(res);
    }
}
