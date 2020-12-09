package com.tsybulko.task7;

import java.io.IOException;
import java.util.Calendar;

public class DateParser {
    public Calendar parseDate(String []data) throws IOException {
        if (data==null || data.length==0) {
            throw new IOException("Enter arguments!");
        }
        String date=data[0];
        Calendar calendar = Calendar.getInstance();
        String[] ddmmyy = date.split("[.,\\\\/]");
        int dd = Integer.parseInt(ddmmyy[0]);
        int mm = Integer.parseInt(ddmmyy[1]) - 1;
        int yy = Integer.parseInt(ddmmyy[2]);
        calendar.set(yy, mm, dd);
        return calendar;
    }
}
