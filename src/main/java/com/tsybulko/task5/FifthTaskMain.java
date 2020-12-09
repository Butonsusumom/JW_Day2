package com.tsybulko.task5;

import java.io.IOException;

public class FifthTaskMain {
    public static void main(String[] args) {
        TransformService transformService = new TransformService();
        try {
            int[] ms = transformService.toIntArray(args);
            OperationService operationService = new OperationService();
            int sumResult = operationService.sum(ms);
            long productResult = operationService.multiply(ms);
            OperationConsole operationConsole = new OperationConsole();
            operationConsole.printSumResult(sumResult);
            operationConsole.printProductResult(productResult);
        } catch (IOException | NumberFormatException e ) {
            e.printStackTrace();
        }
    }
}
