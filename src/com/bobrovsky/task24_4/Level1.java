package com.bobrovsky.task24_4;

import java.util.Arrays;

public class Level1 {
  public static int[] SynchronizingTables(int N, int[] ids, int[] salary) {
    int[] temp = new int[N];
    int[] res = new int[N];

    for (int i = 0; i < N; i++) {
      temp[i] = ids[i];
    }

    Arrays.sort(ids);
    Arrays.sort(salary);

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N ; j++) {
        if (temp[i] == ids[j]) {
          res[i] = salary[j];
        }
      }
    }

    return res;
  }
}
