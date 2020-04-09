//Задание 9.6.10
package com.bobrovsky.task9;

import java.util.Scanner;

public class SchoolMarks {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of marks:");
        int num = keyboard.nextInt();
        int mark;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        System.out.println("Enter your marks:");
        for (int i = 0; i < num; i++) {
            mark = keyboard.nextInt();
            if (mark % 13 == 0) {
                count2++;
            } else if (mark % 3 == 0) {
                count3++;
            } else if (mark % 4 == 0) {
                count4++;
            } else if (mark % 5 == 0) {
                count5++;
            }
        }
        System.out.println("List of school marks:");
        System.out.println("2: " + count2);
        System.out.println("3: " + count3);
        System.out.println("4: " + count4);
        System.out.println("5: " + count5);
    }
}
