package com.tsybulko.task5;

import java.io.IOException;

public class TransformService {
    public int[] toIntArray(String[] args) throws IOException {
        if (args == null || args.length==0) {
            throw new IOException("Enter arguments!");
        }
        int[] ms = new int[args.length];
        for (int i = 0; i < ms.length; i++) {
            ms[i] = Integer.parseInt(args[i]);
        }
        return ms;
    }
}
