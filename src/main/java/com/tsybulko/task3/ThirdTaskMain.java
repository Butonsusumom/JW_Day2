package com.tsybulko.task3;

import java.io.IOException;

public class ThirdTaskMain {
    public static void main(String[] args) {
        try {
            ParseService parseService = new ParseService();
            int count = parseService.parseNaturalNumber(args);
            RandomService randomService = new RandomService();
            int[] ms = randomService.
                    generateRandomArray(count);
            PrintService printService = new PrintService();
            printService.printRandomArray(ms);
        } catch (NumberFormatException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
