package com.bobrovsky.task24_2;

import java.util.*;

public class Level1 {
    public static int odometer(int[] oksana) {
        int distance = 0;
        int time = oksana[1];
        distance += oksana[0] * time;
        for (int i = 0; i < oksana.length; i++) {
            if (i > 1 && i % 2 != 0) {
                time = oksana[i] - oksana[i - 2];
                distance += oksana[i - 1] * time;
            }
        }
        return distance;
    }
}
