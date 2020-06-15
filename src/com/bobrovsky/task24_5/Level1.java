package com.bobrovsky.task24_5;

import java.util.*;

public class Level1 {
  public static String PatternUnlock(int N, int[] hits) {
    String str;
    double temp = 0.0;
    int[][] num = {{6, 1, 9}, {5, 2, 8}, {4, 3, 7}};
    double[] len = new double[N];
    double d1 = 1.0;
    double d2 = Math.sqrt(d1 * d1 * 2.0);

    for (int k = 0; k < N; k++) {
      for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[i].length; j++) {
          if (hits[k] == num[i][j] && (k + 1) < len.length) {
            switch (num[i][j]) {
              case 1:
                if (hits[k + 1] == num[i + 2][j]) {
                  len[k] = d1 + d1;
                } else if (hits[k + 1] == num[i + 2][j + 1] || hits[k + 1] == num[i + 2][j - 1]) {
                  len[k] = d1 + d2;
                } else if (hits[k + 1] == num[i][j + 1] ||
                        hits[k + 1] == num[i][j - 1] ||
                        hits[k + 1] == num[i + 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              case 2:
                if (hits[k + 1] == num[i][j + 1] ||
                        hits[k + 1] == num[i][j - 1] ||
                        hits[k + 1] == num[i + 1][j] ||
                        hits[k + 1] == num[i - 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              case 3:
                if (hits[k + 1] == num[i - 2][j]) {
                  len[k] = d1 + d1;
                } else if (hits[k + 1] == num[i - 2][j - 1] || hits[k + 1] == num[i - 2][j + 1]) {
                  len[k] = d1 + d2;
                } else if (hits[k + 1] == num[i][j + 1] ||
                        hits[k + 1] == num[i][j - 1] ||
                        hits[k + 1] == num[i - 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              case 4:
                if (hits[k + 1] == num[i - 2][j] || hits[k + 1] == num[i][j + 2]) {
                  len[k] = d1 + d1;
                } else if (hits[k + 1] == num[i - 2][j + 1] || hits[k + 1] == num[i - 1][j + 2]) {
                  len[k] = d1 + d2;
                } else if (hits[k + 1] == num[i - 2][j + 2]) {
                  len[k] = d2 + d2;
                } else if (hits[k + 1] == num[i][j + 1] ||
                        hits[k + 1] == num[i - 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              case 5:
                if (hits[k + 1] == num[i][j + 2]) {
                  len[k] = d1 + d1;
                } else if (hits[k + 1] == num[i - 1][j + 2] || hits[k + 1] == num[i + 1][j + 2]) {
                  len[k] = d1 + d2;
                } else if (hits[k + 1] == num[i][j + 1] ||
                        hits[k + 1] == num[i + 1][j] ||
                        hits[k + 1] == num[i - 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              case 6:
                if (hits[k + 1] == num[i][j + 2] || hits[k + 1] == num[i + 2][j]) {
                  len[k] = d1 + d1;
                } else if (hits[k + 1] == num[i + 2][j + 1] || hits[k + 1] == num[i + 1][j + 2]) {
                  len[k] = d1 + d2;
                } else if (hits[k + 1] == num[i + 2][j + 2]) {
                  len[k] = d2 + d2;
                } else if (hits[k + 1] == num[i][j + 1] ||
                        hits[k + 1] == num[i + 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              case 7:
                if (hits[k + 1] == num[i - 2][j] || hits[k + 1] == num[i][j - 2]) {
                  len[k] = d1 + d1;
                } else if (hits[k + 1] == num[i - 2][j - 1] || hits[k + 1] == num[i - 1][j - 2]) {
                  len[k] = d1 + d2;
                } else if (hits[k + 1] == num[i - 2][j - 2]) {
                  len[k] = d2 + d2;
                } else if (hits[k + 1] == num[i][j - 1] ||
                        hits[k + 1] == num[i - 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              case 8:
                if (hits[k + 1] == num[i][j - 2]) {
                  len[k] = d1 + d1;
                } else if (hits[k + 1] == num[i - 1][j - 2] || hits[k + 1] == num[i + 1][j - 2]) {
                  len[k] = d1 + d2;
                } else if (hits[k + 1] == num[i][j - 1] ||
                        hits[k + 1] == num[i + 1][j] ||
                        hits[k + 1] == num[i - 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              case 9:
                if (hits[k + 1] == num[i][j - 2] || hits[k + 1] == num[i + 2][j]) {
                  len[k] = d1 + d1;
                } else if (hits[k + 1] == num[i + 2][j - 1] || hits[k + 1] == num[i + 1][j - 2]) {
                  len[k] = d1 + d2;
                } else if (hits[k + 1] == num[i + 2][j - 2]) {
                  len[k] = d2 + d2;
                } else if (hits[k + 1] == num[i][j - 1] ||
                        hits[k + 1] == num[i + 1][j]) {
                  len[k] = d1;
                } else {
                  len[k] = d2;
                }
                break;
              default:
                len[k] = 0.0;
            }
          }
        }
      }
    }

    for (int i = 0; i < N; i++) {
      temp += len[i];
    }

    str = (int) (Math.round(temp * 100000)) + "";


    char[] ch = str.toCharArray();
    char[] withoutZero = new char[str.length()];

    for (int i = 0; i < ch.length; i++) {
      if (ch[i] != '0') {
        withoutZero[i] = ch[i];
      }
    }

    String res = new String(withoutZero);

    return res.trim();
  }
}