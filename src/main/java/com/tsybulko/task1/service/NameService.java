package com.tsybulko.task1.service;

import java.io.IOException;

public class NameService {
    public String formName(String[] args) throws IOException {
        if (args==null || args.length==0) {
            throw new IOException("Enter your name!");
        }
        return args[0];
    }
}
