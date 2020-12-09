package com.tsybulko.task4;

import java.io.IOException;

public class PasswordSample {
    private static final String SAMPLE = "qwerty";

    public String comparePassword(String[] data) throws IOException {
        if (data == null || data.length == 0) {
            throw new IOException("Enter Arguments");
        }
        String password = data[0];
        StringBuilder message = new StringBuilder("Password ");
        if (password.compareTo(SAMPLE) == 0) {
            message.append("matches ");
        } else {
            message.append("doesn't match ");
        }
        message.append("the sample!");
        return message.toString();
    }
}
