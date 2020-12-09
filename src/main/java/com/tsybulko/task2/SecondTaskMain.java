package com.tsybulko.task2;

import java.io.IOException;

public class SecondTaskMain {
    public static void main(String[] args) {
        ReversePrint obj = new ReversePrint();
        try {
            obj.printReverse(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
