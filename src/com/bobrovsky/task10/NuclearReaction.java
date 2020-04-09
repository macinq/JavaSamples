//Задание 10.3.5
package com.bobrovsky.task10;

import java.util.Scanner;

public class NuclearReaction {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of atomic nuclei:");
        int num = keyboard.nextInt();
        System.out.println("Enter a critical threshold:");
        int crit = keyboard.nextInt();
        int safe = (crit / num) * num;

        int count = 0;
        do {
            num *= 3;
            count++;
        } while (num < safe);

        System.out.println("Safe quantity of nuclear fission:");
        System.out.println(count);
    }
}
