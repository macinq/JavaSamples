//Задание 8.6
package com.bobrovsky.task8;

public class PrintingNumbersMod {
    public static void main(String[] args) {

        for (int i = 1; i <= 50 ; i++) {
            if (i % 15 == 0) {
                System.out.println("*333*555*");
            } else if (i % 3 == 0) {
                System.out.println("*333*");
            } else if (i % 5 == 0) {
                System.out.println("*555*");
            } else {
                System.out.println(i);
            }
        }
    }
}
