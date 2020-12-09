package com.tsybulko.task7;

import java.time.DayOfWeek;
import java.util.Calendar;

public class DateService {
    public int calculateFullYears(Calendar birthDay) {
        Calendar today = Calendar.getInstance();
        return today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
    }

    public DayOfWeek getDayOfWeek(Calendar calendar) {
        DayOfWeek dayOfWeek = DayOfWeek.of(calendar.get(Calendar.DAY_OF_WEEK));
        return dayOfWeek;
    }

    public boolean isBirthDay(Calendar calendar) {
        Calendar today = Calendar.getInstance();
        return ((today.get(Calendar.DATE) == calendar.get(Calendar.DATE)) &&
                (today.get(Calendar.MONTH) == calendar.get(Calendar.MONTH)));
    }


}
