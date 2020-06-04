package com.bobrovsky.task24_1;

import java.util.*;

public class Level1 {
    public static int squirrel(int N) {
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }

        int res = 0;
        for (int a = fact; a > 0; a /= 10) {
            res = a % 10;
        }
        return res;
    }
}
