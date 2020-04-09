//Задание 10.3.3
package com.bobrovsky.task10;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = keyboard.nextInt();
        int count = 0;

        while (n >= 1) {
            //System.out.println(Integer.toBinaryString(n));
            if (n % 2 != 0) {
                count++;
            }
            n /= 2;
        }


        System.out.println("Count the 1s:");
        System.out.println(count);
    }
}

//        while (n != 0) {
//            //System.out.println(Integer.toBinaryString(n));
//            count += n & 1;
//            n >>= 1;
//        }