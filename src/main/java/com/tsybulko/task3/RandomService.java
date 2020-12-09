package com.tsybulko.task3;

import java.util.Random;

public class RandomService {
    private Random random = new Random();

    public int[] generateRandomArray(int count) {
        int[] ms = new int[count];
        for (int i = 0; i < count; i++) {
            ms[i] = random.nextInt(1000);
        }
        return ms;
    }
}
