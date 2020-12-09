package com.tsybulko.task7;

import java.io.IOException;
import java.time.DayOfWeek;
import java.util.Calendar;

public class SevensTaskMain {
    public static void main(String[] args) {
        try {
            DateParser dateParser = new DateParser();
            Calendar calendar = dateParser.parseDate(args);
            DateService dateService = new DateService();
            DayOfWeek dayOFWeek = dateService.getDayOfWeek(calendar);
            int fullYears = dateService.calculateFullYears(calendar);
            boolean isBirthday = dateService.isBirthDay(calendar);
            DateConsole dateConsole = new DateConsole();
            dateConsole.printDayOfWeek(dayOFWeek);
            dateConsole.printFullYears(fullYears);
            dateConsole.printBirthdayCelebration(isBirthday);
        } catch (NumberFormatException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
