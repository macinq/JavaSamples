//Задание 9.6.3
package com.bobrovsky.task9;

public class LetterEPrinting {
    public static void main(String[] args) {

//        for (int i = 0; i < 7; i++) {
//            if (i == 0 || i == 6) {
//                for (int j = 0; j < 5; j++) {
//                    System.out.print("*");
//                }
//            } else if (i == 3) {
//                for (int k = 0; k < 4; k++) {
//                    System.out.print("*");
//                }
//            } else {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 6 || i == 3) {
                int k= 0;
                if (i == 0 || i == 6) {
                    k = 5;
                } else if (i == 3) {
                    k = 4;
                }
                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
