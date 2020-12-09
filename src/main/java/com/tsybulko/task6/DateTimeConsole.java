package com.tsybulko.task6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeConsole {
    public void printTaskDateTime(String name, Calendar calendar) {
        String format = new SimpleDateFormat
                ("dd.MM.yyyy 'at' HH:mm:ss z").
                format(calendar.getTime());
        System.out.println(name + " will finish this task " + format);
    }
}
