package com.tsybulko.task4;

import java.io.IOException;

public class FoursTaskMain {
    public static void main(String[] args) {
        PasswordSample obj = new PasswordSample();
        String compareMessage = null;
        try {
            compareMessage = obj.comparePassword(args);
            System.out.println(compareMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
