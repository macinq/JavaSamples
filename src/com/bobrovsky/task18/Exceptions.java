//Задание 18
package com.bobrovsky.task18;

public class Exceptions {

    static String Func(String n) {
        return n.concat(n);
    }

    public static void main(String[] args) {
        try {
            int len = -10;
            String[] arr = new String[len];
        } catch (NegativeArraySizeException e) {
            System.out.println("The array is negative");
        }

        try {
            int len = 5;
            int[] num = new int[len];
            for (int i = 0; i < num.length; i++) {
                if (i == num.length - 1) {
                    System.out.println(num[11]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of range");
        }

        try {
            String num = null;
            System.out.println(Func(num));
        } catch (NullPointerException e) {
            System.out.println("The argument must be non-null");
        }
    }
}
