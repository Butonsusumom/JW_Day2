package com.tsybulko.task2;

import java.io.IOException;

public class ReversePrint {
    public void printReverse(String[] data) throws IOException {
        if (data==null || data.length==0) {
            throw new IOException("Your must enter arguments!");
        }
        int length = data.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
