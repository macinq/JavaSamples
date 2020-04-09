package com.bobrovsky.task7;

import java.util.Scanner;

public class Overlap {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();

        int typeN1 = (int) (num1 * 1000);
        int typeN2 = (int) (num2 * 1000);

//        num1 = typeN1 / 1000.0;
//        num2 = typeN2 / 1000.0;

        if (typeN1 == typeN2) {
            System.out.println("The numbers are equal:");
        } else {
            System.out.println("The numbers are not equal:");
        }
        System.out.println("Number 1 = " + typeN1);
        System.out.println("Number 2 = " + typeN2);
    }
}
