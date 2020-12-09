package com.tsybulko.task6;

import java.io.IOException;

public class ParseService {
    public TaskExecutor parseArgs(String[] args) throws IOException {
        if (args==null || args.length==0 || args.length<2) {
            throw new IOException("Enter correct arguments!");
        }
        TaskExecutor executor = new TaskExecutor();
        executor.setDays(Integer.parseInt(args[0]));
        executor.setName(args[1]);
        return executor;
    }
}
