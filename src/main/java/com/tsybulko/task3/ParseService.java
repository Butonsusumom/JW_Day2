package com.tsybulko.task3;

import java.io.IOException;

public class ParseService {
    public int parseNaturalNumber(String[] args) throws IOException {
        if (args==null || args.length==0) {
            throw new IOException("You must enter arguments!");
        }
        return Integer.parseInt(args[0]);
    }
}
