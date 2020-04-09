//Задание 9.6.5
package com.bobrovsky.task9;

public class LetterSPrinting {
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            int k = 17;
            int l;
            if (2 < i && i < 6) {
                l = 1;
            } else if (8 < i && i < 12) {
                l = 2;
            } else {
                l = 3;
            }
            for (int j = 0; j < k; j++) {
                if ((l == 1 && j > 3) || (l == 2 && j < 13)) {
                    System.out.print(" ");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
}
