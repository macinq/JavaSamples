//Задание 14.5
package com.bobrovsky.task14;

import java.util.Scanner;
import java.util.Random;

public class SearchInArray {

    static int Search(int[] arr, int num) {
        for (int i = 0; i < arr.length ; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = 100;
        int value = 100;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(value) + 1;
        }

        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        int res = Search(arr, num);

        System.out.println("Result:");
        System.out.println(res);
    }
}
