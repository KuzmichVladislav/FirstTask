package com.company.java_web.task1;

public class PositiveAndNative {
    public static double findAverage(CustomArray array){
        int[] tempArray = array.getArray();
        return new Sum().findSum(array)/ (double)tempArray.length;
    }
}
