package com.bobrovsky.task24_2;

import java.util.*;

public class Level1 {
    public static int odometer(int[] oksana) {
        int distance = 0;
        for (int i = 0; i < oksana.length; i += 2) {
            distance += oksana[i];
        }
        return distance;
    }
}
