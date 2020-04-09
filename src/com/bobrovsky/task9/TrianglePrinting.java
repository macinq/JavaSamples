//Задание 9.6.1
package com.bobrovsky.task9;

public class TrianglePrinting {
    public static void main(String[] args) {

        int k = 1;
        for (int i = 1; i < 10; i++) {
            if (i < 6) {
                k++;
            } else {
                k--;
            }
            for (int j = 1; j < k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



















//        for (int i = 1; i < 5; i++){
//            for (int j = 0; j < i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();

//        int k = 0;
//        for (int i = 1; i <= 10; i++) {
//            if (i < 6) {
//                for (int j = 0; j < i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            } else {
//                for (int j = (i - 1) - 2 * k; j > 1; j--) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//                k++;
//            }
//        }
