package com.company.java_web.task1;

public class Sum {
    public int findSum(CustomArray array) {
        int[] tempArray = array.getArray();
        int sum = 0;
        for (int i : tempArray) {
            sum += i;
        }
        return sum;
    }
}


