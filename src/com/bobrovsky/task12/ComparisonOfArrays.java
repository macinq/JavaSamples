//Задание 12.5.2
package com.bobrovsky.task12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ComparisonOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter arrays size:");
        int size = scanner.nextInt();
        System.out.println("Enter arrays length:");
        int length = scanner.nextInt();
        System.out.println("Enter arrays depth:");
        int depth = scanner.nextInt();
        System.out.println("Enter a range of values:");
        int values = scanner.nextInt();
        int[][][] arrayA = new int[size][length][depth];
        int[][][] arrayB = new int[size][length][depth];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < depth; k++) {
                    arrayA[i][j][k] = random.nextInt(values) + 1;
                    arrayB[i][j][k] = random.nextInt(values) + 1;
                }
            }
        }

        int flag = 1;
        if (arrayA.length == arrayB.length &&
                arrayA[0].length == arrayB[0].length &&
                arrayA[0][0].length == arrayB[0][0].length) {
            for (int i = 0; i < arrayA.length; i++) {
                if (flag == 0) {
                    break;
                }
                for (int j = 0; j < arrayA[i].length; j++) {
                    if (flag == 0) {
                        break;
                    }
                    for (int k = 0; k < arrayA[i][j].length; k++) {
                        if (arrayA[i][j][k] != arrayB[i][j][k]) {
                            flag = 0; //если два значения не равны, значит и массивы не равны
                            break;
                        }
                    }
                }
            }
        }


        if (flag == 1) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}


//        for (int i = 0; i < arrayA.length; i++) {
//            if (arrayA[i].length == arrayB[i].length) {
//                for (int j = 0; j < arrayA[i].length; j++) {
//                    int flag = 1;
//                    if (arrayA[i][j].length == arrayB[i][j].length) {
//                        for (int k = 0; k < arrayA[i][j].length; k++) {
//                            if (arrayA[i][j][k] != arrayB[i][j][k]) {
//                                flag = 0; //если два значения не равны, значит и массивы не равны
//                                break;
//                            }
//                        }
//                    } else {
//                        System.out.println("Arrays are not equal");
//                        break;
//                    }
//                    if (flag == 1) {
//                        System.out.println("Arrays " + Arrays.toString(arrayA[i][j]) + " and " + Arrays.toString(arrayB[i][j])  + " are equal");
//                    } else {
//                        System.out.println("Arrays " + Arrays.toString(arrayA[i][j]) + " and " + Arrays.toString(arrayB[i][j])  + " are not equal");
//                    }
//                }
//            } else {
//                System.out.println("Arrays are not equal");
//                break;
//            }
//        }


//        System.out.println("Enter array size:"); //ввод 3D массива с клавиатуры
//        int size = scanner.nextInt();
//        int[][][] array = new int[size][][];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter array length: " + i);
//            int len = scanner.nextInt();
//            array[i] = new int[len][];
//            System.out.println(Arrays.deepToString(array[i]));
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.println("Enter array depth: " + i + " " + j);
//                int dep = scanner.nextInt();
//                array[i][j] = new int[dep];
//                System.out.println(Arrays.deepToString(array[j]));
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.println("Values from: ");
//                    int val = scanner.nextInt();
//                    System.out.println("Values: " + i + " " + j + " " + k);
//                    array[i][j][k] = random.nextInt(val) + 1;
//                    System.out.println(Arrays.deepToString(array[k]));
//                }
//            }
//        }

//        System.out.println(array[0][0][0]);
//        System.out.println(array[0][0][1]);
//        System.out.println(array[0][1][0]);
//        System.out.println(array[0][1][1]);
//        System.out.println(array[1][0][0]);
