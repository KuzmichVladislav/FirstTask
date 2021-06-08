package com.company.java_web.task1;

public class Min {
    public int findMin(CustomArray array) {
        int[] tempArray = array.getArray();
        int min = tempArray[0];
        for (int i : tempArray) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}

