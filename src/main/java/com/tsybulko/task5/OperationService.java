package com.tsybulko.task5;

public class OperationService {
    public int sum(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    public long multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}
