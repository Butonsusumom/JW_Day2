package com.tsybulko.task7;

import java.time.DayOfWeek;

public class DateConsole {
    public void printDayOfWeek(DayOfWeek day) {
        System.out.println("You were born on: " + day);
    }

    public void printFullYears(int years) {
        System.out.println("You are " + years + " years old");
    }

    public void printBirthdayCelebration(boolean isTrue) {
        if (isTrue) {
            System.out.println("Happy birthday!");
        }
    }
}
