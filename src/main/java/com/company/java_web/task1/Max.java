package com.company.java_web.task1;

public class Max {
    public int findMax(CustomArray array) {
        int[] tempArray = array.getArray();
        int max = tempArray[0];
        for (int i : tempArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

