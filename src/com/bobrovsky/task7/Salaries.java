package com.bobrovsky.task7;

import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the salaries of three employees:");
        int salary1 = keyboard.nextInt();
        int salary2 = keyboard.nextInt();
        int salary3 = keyboard.nextInt();

        int minSalary;
        int maxSalary;

        if (salary1 <= salary2 && salary1 <= salary3) {
            minSalary = salary1;
        } else if (salary2 <= salary1 && salary2 <= salary3) {
            minSalary = salary2;
        } else {
            minSalary = salary3;
        }

        if (salary1 >= salary2 && salary1 >= salary3) {
            maxSalary = salary1;
        } else if (salary2 >= salary1 && salary2 >= salary3) {
            maxSalary = salary2;
        } else {
            maxSalary = salary3;
        }

        double diff = (double) maxSalary / minSalary;

        System.out.println("Minimum salary:");
        System.out.println(minSalary);
        System.out.println("Maximum salary:");
        System.out.println(maxSalary);
        System.out.println();
        System.out.println(diff + " times difference");
    }
}
