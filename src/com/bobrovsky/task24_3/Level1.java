package com.bobrovsky.task24_3;

import java.util.*;

public class Level1 {
  public static int verifier(int N, int M, int[][] arr) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (arr[i][j] == 0) {
          return 0;
        }
      }
    }
    return 1;
  }

  public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
    int days = 0;
    int[][] area = new int[N][M];
    int flag;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        for (int z = 0; z < battalion.length; z += 2) {
          area[battalion[z] - 1][battalion[z + 1] - 1] = 2;
        }
      }
    }
    days++;

    flag = verifier(N, M, area);

    while (flag != 1) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          if (area[i][j] == 2) {
            if ((i >= 1 && i < N - 1) && (j >= 1 && j < M - 1)) {
              area[i - 1][j] += 1;
              area[i + 1][j] += 1;
              area[i][j - 1] += 1;
              area[i][j + 1] += 1;
            }

            if (i == N - 1 && j == M - 1) {
              area[i - 1][j] += 1;
              area[i][j - 1] += 1;
            } else if (i == 0 && j == 0) {
              area[i + 1][j] += 1;
              area[i][j + 1] += 1;
            } else if (i == 0 && j == M - 1) {
              area[i + 1][j] += 1;
              area[i][j - 1] += 1;
            } else if (i == N - 1 && j == 0) {
              area[i - 1][j] += 1;
              area[i][j + 1] += 1;
            }

            if ((i >= 1 && i < N - 1) && j == 0) {
              area[i - 1][j] += 1;
              area[i + 1][j] += 1;
              area[i][j + 1] += 1;
            }
            if ((i >= 1 && i < N - 1) && j == M - 1) {
              area[i - 1][j] += 1;
              area[i + 1][j] += 1;
              area[i][j - 1] += 1;
            }
            if (i == 0 && (j >= 1 && j < M - 1)) {
              area[i][j - 1] += 1;
              area[i][j + 1] += 1;
              area[i + 1][j] += 1;
            }
            if (i == N - 1 && (j >= 1 && j < M - 1)) {
              area[i][j - 1] += 1;
              area[i][j + 1] += 1;
              area[i - 1][j] += 1;
            }
          }
        }
      }
      days++;
      flag = verifier(N, M, area);
    }

    return days;
  }
}
