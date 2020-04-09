//Задание 9.6.4
package com.bobrovsky.task9;

import java.util.Scanner;

public class Hacker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of routers:");
        int num = keyboard.nextInt();

        System.out.println("Enter the vulnerability codes:");
        int code = 0;
        int count = 0;
        for (int i = 0; i < num; i++) {
            code = keyboard.nextInt();
            count++;
            if (code == 171) {
                break;
            }
        }

        if (code == 171) {
            System.out.println("Router #" + count + " is vulnerable.");
        } else {
            System.out.println("Vulnerabilities not found.");
        }
    }
}
